package org.telegram.ui.ActionBar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class b6 {
    public static final int a = m6.d6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0])} : fArr.length == 2 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1])} : fArr.length == 3 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2])} : fArr.length < 8 ? new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[3])} : new float[]{org.telegram.messenger.g0.L(fArr[0]), org.telegram.messenger.g0.L(fArr[1]), org.telegram.messenger.g0.L(fArr[2]), org.telegram.messenger.g0.L(fArr[3]), org.telegram.messenger.g0.L(fArr[4]), org.telegram.messenger.g0.L(fArr[5]), org.telegram.messenger.g0.L(fArr[6]), org.telegram.messenger.g0.L(fArr[7])};
    }

    public static int b(int i7) {
        if (b == null) {
            b = new float[3];
        }
        Color.colorToHSV(i7, b);
        float[] fArr = b;
        float f10 = fArr[1];
        if (f10 > 0.01f) {
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f10 + (m6.I.q() ? 0.25f : -0.25f)));
            float[] fArr2 = b;
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (m6.I.q() ? 0.05f : -0.05f)));
        } else {
            fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (m6.I.q() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(qs.L1, b);
    }

    public static org.telegram.ui.Cells.y c(a6 a6Var, int i7) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i7});
        a6 a6Var2 = new a6();
        a6Var2.b = -1.0f;
        if (a6.c == null) {
            Paint paint = new Paint(1);
            a6.c = paint;
            paint.setColor(-1);
        }
        a6Var2.a = a6.c;
        return new org.telegram.ui.Cells.y(colorStateList, a6Var, a6Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.Cells.y d(int i7, int i10, float... fArr) {
        ColorDrawable colorDrawable;
        ShapeDrawable shapeDrawable;
        if (i7 != 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= Math.min(8, fArr.length)) {
                    colorDrawable = new ColorDrawable(i7);
                    break;
                }
                if (fArr[i11] > 0.0f) {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(i7);
                    colorDrawable = shapeDrawable2;
                    break;
                }
                i11++;
            }
        } else {
            colorDrawable = null;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= Math.min(8, fArr.length)) {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            if (fArr[i12] > 0.0f) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            i12++;
        }
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), colorDrawable, shapeDrawable);
    }

    public static org.telegram.ui.Cells.y e(int i7, float... fArr) {
        return d(i7, b(i7), fArr);
    }

    public static org.telegram.ui.Cells.y f(int i7, float... fArr) {
        return e(m6.x0(null, i7, false), fArr);
    }
}
