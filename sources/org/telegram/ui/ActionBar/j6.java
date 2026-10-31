package org.telegram.ui.ActionBar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j6 {
    public static final int a = t6.d6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0])} : fArr.length == 2 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1])} : fArr.length == 3 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2])} : fArr.length < 8 ? new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[3]), org.telegram.messenger.i0.L(fArr[3])} : new float[]{org.telegram.messenger.i0.L(fArr[0]), org.telegram.messenger.i0.L(fArr[1]), org.telegram.messenger.i0.L(fArr[2]), org.telegram.messenger.i0.L(fArr[3]), org.telegram.messenger.i0.L(fArr[4]), org.telegram.messenger.i0.L(fArr[5]), org.telegram.messenger.i0.L(fArr[6]), org.telegram.messenger.i0.L(fArr[7])};
    }

    public static int b(int i10) {
        if (b == null) {
            b = new float[3];
        }
        Color.colorToHSV(i10, b);
        float[] fArr = b;
        float f7 = fArr[1];
        if (f7 > 0.01f) {
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f7 + (t6.I.q() ? 0.25f : -0.25f)));
            float[] fArr2 = b;
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (t6.I.q() ? 0.05f : -0.05f)));
        } else {
            fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (t6.I.q() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(zs.L1, b);
    }

    public static org.telegram.ui.Cells.y c(i6 i6Var, int i10) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10});
        i6 i6Var2 = new i6();
        i6Var2.b = -1.0f;
        if (i6.c == null) {
            Paint paint = new Paint(1);
            i6.c = paint;
            paint.setColor(-1);
        }
        i6Var2.a = i6.c;
        return new org.telegram.ui.Cells.y(colorStateList, i6Var, i6Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.Cells.y d(int i10, int i11, float... fArr) {
        ColorDrawable colorDrawable;
        ShapeDrawable shapeDrawable;
        if (i10 != 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= Math.min(8, fArr.length)) {
                    colorDrawable = new ColorDrawable(i10);
                    break;
                }
                if (fArr[i12] > 0.0f) {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(i10);
                    colorDrawable = shapeDrawable2;
                    break;
                }
                i12++;
            }
        } else {
            colorDrawable = null;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= Math.min(8, fArr.length)) {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            if (fArr[i13] > 0.0f) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            i13++;
        }
        return new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), colorDrawable, shapeDrawable);
    }

    public static org.telegram.ui.Cells.y e(int i10, float... fArr) {
        return d(i10, b(i10), fArr);
    }

    public static org.telegram.ui.Cells.y f(int i10, float... fArr) {
        return e(t6.x0(null, i10, false), fArr);
    }
}
