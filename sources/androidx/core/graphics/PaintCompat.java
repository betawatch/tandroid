package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pair;

/* loaded from: classes.dex */
public abstract class PaintCompat {
    private static final ThreadLocal sRectThreadLocal = new ThreadLocal();

    /* loaded from: classes.dex */
    static class Api23Impl {
        static boolean hasGlyph(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean hasGlyph(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.hasGlyph(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        Pair obtainEmptyRects = obtainEmptyRects();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) obtainEmptyRects.first);
        paint.getTextBounds(str, 0, length, (Rect) obtainEmptyRects.second);
        return !((Rect) obtainEmptyRects.first).equals(obtainEmptyRects.second);
    }

    private static Pair obtainEmptyRects() {
        ThreadLocal threadLocal = sRectThreadLocal;
        Pair pair = (Pair) threadLocal.get();
        if (pair == null) {
            Pair pair2 = new Pair(new Rect(), new Rect());
            threadLocal.set(pair2);
            return pair2;
        }
        ((Rect) pair.first).setEmpty();
        ((Rect) pair.second).setEmpty();
        return pair;
    }
}
