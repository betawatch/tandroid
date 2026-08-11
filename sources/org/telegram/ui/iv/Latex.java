package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* loaded from: classes3.dex */
public final class Latex {
    private static volatile boolean sInitialized = false;
    public final Bitmap bitmap;
    public final int depth;
    public final int height;
    public final int width;

    private Latex(Bitmap bitmap, int i, int i2, int i3) {
        this.bitmap = bitmap;
        this.width = i;
        this.height = i2;
        this.depth = i3;
    }

    private static void ensureInitialized() {
        if (sInitialized) {
            return;
        }
        synchronized (Latex.class) {
            try {
                if (!sInitialized) {
                    JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                    sInitialized = true;
                }
            } finally {
            }
        }
    }

    public static Latex render(String str, float f, boolean z) {
        if (str != null && !str.isEmpty()) {
            try {
                ensureInitialized();
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z) {
                        try {
                            i = build.icon().getIconDepth();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    return new Latex(createBitmap, intrinsicWidth, intrinsicHeight, i);
                }
                return null;
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
