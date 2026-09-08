package org.telegram.ui.ActionBar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class y5 {
    public static final int a = j6.d6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])} : fArr.length == 2 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])} : fArr.length == 3 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])} : fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
    }

    public static int b(int i10) {
        if (b == null) {
            b = new float[3];
        }
        Color.colorToHSV(i10, b);
        float[] fArr = b;
        float f7 = fArr[1];
        if (f7 > 0.01f) {
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f7 + (j6.I.q() ? 0.25f : -0.25f)));
            float[] fArr2 = b;
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (j6.I.q() ? 0.05f : -0.05f)));
        } else {
            fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (j6.I.q() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(127, b);
    }

    public static org.telegram.ui.Cells.z c(x5 x5Var, int i10) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10});
        x5 x5Var2 = new x5();
        x5Var2.b = -1.0f;
        if (x5.c == null) {
            Paint paint = new Paint(1);
            x5.c = paint;
            paint.setColor(-1);
        }
        x5Var2.a = x5.c;
        return new org.telegram.ui.Cells.z(colorStateList, x5Var, x5Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.Cells.z d(float[] fArr, int i10, int i11) {
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
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i11}), colorDrawable, shapeDrawable);
    }

    public static org.telegram.ui.Cells.z e(float[] fArr, int i10) {
        return d(fArr, i10, b(i10));
    }

    public static org.telegram.ui.Cells.z f(float[] fArr, int i10) {
        return e(fArr, j6.w0(null, i10, false));
    }
}
