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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class v5 {
    public static final int a = f6.d6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])} : fArr.length == 2 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])} : fArr.length == 3 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])} : fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
    }

    public static int b(int i9) {
        if (b == null) {
            b = new float[3];
        }
        Color.colorToHSV(i9, b);
        float[] fArr = b;
        float f10 = fArr[1];
        if (f10 > 0.01f) {
            fArr[1] = Math.min(1.0f, Math.max(0.0f, f10 + (f6.I.q() ? 0.25f : -0.25f)));
            float[] fArr2 = b;
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (f6.I.q() ? 0.05f : -0.05f)));
        } else {
            fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (f6.I.q() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(127, b);
    }

    public static org.telegram.ui.Cells.z c(u5 u5Var, int i9) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i9});
        u5 u5Var2 = new u5();
        u5Var2.b = -1.0f;
        if (u5.c == null) {
            Paint paint = new Paint(1);
            u5.c = paint;
            paint.setColor(-1);
        }
        u5Var2.a = u5.c;
        return new org.telegram.ui.Cells.z(colorStateList, u5Var, u5Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.telegram.ui.Cells.z d(float[] fArr, int i9, int i10) {
        ColorDrawable colorDrawable;
        ShapeDrawable shapeDrawable;
        if (i9 != 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= Math.min(8, fArr.length)) {
                    colorDrawable = new ColorDrawable(i9);
                    break;
                }
                if (fArr[i11] > 0.0f) {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(i9);
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
        return new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), colorDrawable, shapeDrawable);
    }

    public static org.telegram.ui.Cells.z e(float[] fArr, int i9) {
        return d(fArr, i9, b(i9));
    }

    public static org.telegram.ui.Cells.z f(float[] fArr, int i9) {
        return e(fArr, f6.w0(null, i9, false));
    }
}
