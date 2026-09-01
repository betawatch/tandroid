package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y3 extends FrameLayout {
    public float B;
    public int C;
    public ValueAnimator D;
    public x3 E;
    public final lh.c3 F;
    public final View[] a;
    public final Matrix b;
    public final float[] c;
    public float d;
    public float e;
    public boolean f;
    public final float[][] h;
    public final float[] n;
    public final float[] r;
    public final Integer[] s;
    public final HashSet v;
    public final HashMap w;
    public final HashMap x;
    public final float[] y;

    public y3(Context context, View[] viewArr) {
        super(context);
        this.b = new Matrix();
        float[] fArr = new float[16];
        this.c = fArr;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.n = new float[4];
        this.r = new float[6];
        this.s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.v = new HashSet();
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new float[6];
        this.C = -1;
        this.F = new lh.c3(this, 9);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.a = viewArr;
        for (View view : viewArr) {
            addView(view, k7.c6.e(108, 108, 17));
        }
    }

    public static void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = 1.0f - cos;
        float f14 = f13 * f10;
        fArr[0] = (f14 * f10) + cos;
        float f15 = f14 * f11;
        float f16 = sin * 0.0f;
        fArr[4] = f15 - f16;
        float f17 = f14 * 0.0f;
        float f18 = sin * f11;
        fArr[8] = f17 + f18;
        fArr[12] = 0.0f;
        fArr[1] = f15 + f16;
        float f19 = f13 * f11;
        fArr[5] = (f11 * f19) + cos;
        float f20 = f19 * 0.0f;
        float f21 = sin * f10;
        fArr[9] = f20 - f21;
        fArr[13] = 0.0f;
        fArr[2] = f17 - f18;
        fArr[6] = f20 + f21;
        fArr[10] = e2.c.u(f13, 0.0f, 0.0f, cos);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr[1];
        float f11 = fArr2[2];
        float f12 = fArr[2];
        fArr3[0] = (f10 * f11) - (fArr2[1] * f12);
        float f13 = fArr2[0];
        float f14 = fArr[0];
        fArr3[1] = (f12 * f13) - (f11 * f14);
        fArr3[2] = (f14 * fArr2[1]) - (fArr[1] * f13);
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
        System.arraycopy(fArr4, 0, fArr3, 0, 16);
    }

    public static void e(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = f12 * f12;
        float sqrt = (float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10));
        if (sqrt > 0.0f) {
            fArr[0] = fArr[0] / sqrt;
            fArr[1] = fArr[1] / sqrt;
            fArr[2] = fArr[2] / sqrt;
        }
    }

    public final void a() {
        if (Math.abs(this.d) > 1.0E-4f || Math.abs(this.e) > 1.0E-4f) {
            float[] fArr = new float[16];
            b(1.0f, 0.0f, this.d, fArr);
            float[] fArr2 = this.c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f) {
                this.d *= 0.96f;
                this.e *= 0.96f;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        RectF rectF;
        boolean z4;
        boolean z10;
        float f10;
        char c3;
        float f11;
        int i10;
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 6) {
            z4 = this.C == indexOfChild;
            rectF = (RectF) this.x.get(Integer.valueOf(indexOfChild));
            Integer num = (Integer) this.w.get(Integer.valueOf(indexOfChild));
            if (num != null) {
                indexOfChild = num.intValue();
            }
            if (view instanceof d4) {
                d4 d4Var = (d4) view;
                float f12 = 1.0f - (z4 ? this.B : 1.0f);
                d4Var.d.setAlpha(f12);
                d4Var.e.setAlpha(f12);
                if (!z4 || this.B >= 1.0f) {
                    this.a[indexOfChild].setVisibility(8);
                }
            }
            z10 = true;
        } else {
            rectF = null;
            z4 = false;
            z10 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.n, 0, this.c, 0, fArr[indexOfChild], 0);
        float f13 = this.n[2];
        if (f13 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f13 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z10 && (view instanceof d4)) {
            f10 = 1.0f;
            c3 = 6;
            f11 = ((z4 ? this.B : 1.0f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(-6.0f);
        } else {
            f10 = 1.0f;
            c3 = 6;
            f11 = 0.0f;
        }
        float dp = AndroidUtilities.dp(108.0f) / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        System.arraycopy(fArr[indexOfChild], 0, fArr2, 0, 4);
        if (indexOfChild == 0) {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f10;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        } else if (indexOfChild == 1) {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = -1.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        } else if (indexOfChild == 2) {
            i10 = 3;
            fArr3[0] = f10;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
            fArr4[2] = f10;
        } else if (indexOfChild == 3) {
            i10 = 3;
            fArr3[0] = f10;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
            fArr4[2] = -1.0f;
        } else if (indexOfChild != 4) {
            i10 = 3;
            if (indexOfChild == 5) {
                fArr3[0] = f10;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i10 = 3;
            fArr3[0] = -1.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i10] = 0.0f;
        fArr4[i10] = 0.0f;
        float f14 = this.y[indexOfChild];
        if (f14 != 0.0f) {
            double radians = (float) Math.toRadians(f14);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f15 = fArr3[0];
            float f16 = fArr4[0];
            float f17 = fArr3[1];
            float f18 = fArr4[1];
            float f19 = fArr3[2];
            float f20 = fArr4[2];
            fArr3[0] = (f16 * sin) + (f15 * cos);
            fArr3[1] = (f18 * sin) + (f17 * cos);
            fArr3[2] = (f20 * sin) + (f19 * cos);
            fArr4[0] = (f16 * cos) + ((-f15) * sin);
            fArr4[1] = (f18 * cos) + ((-f17) * sin);
            fArr4[2] = (f20 * cos) + ((-f19) * sin);
        }
        float[] fArr5 = new float[4];
        float[] fArr6 = new float[4];
        float[] fArr7 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.c, 0, fArr4, 0);
        float f21 = 64.0f * dp;
        int i11 = 2;
        int i12 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, i10);
        int i13 = 0;
        for (int i14 = 4; i13 < i14; i14 = 4) {
            float f22 = (i13 == i12 || i13 == i11) ? 1.0f : -1.0f;
            float f23 = (i13 == 0 || i13 == i12) ? 1.0f : -1.0f;
            float[] fArr11 = fArr10[i13];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = e2.c.y(fArr7[0], f23, (fArr9[0] * f22) + fArr8[0], dp);
            fArr11[1] = e2.c.y(fArr7[1], f23, (fArr13[1] * f22) + fArr12[1], dp);
            fArr11[2] = e2.c.y(fArr7[2], f23, (fArr13[2] * f22) + fArr12[2], dp);
            i13++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i12 = 1;
            i11 = 2;
        }
        char c10 = 2;
        float[] fArr14 = new float[8];
        int i15 = 0;
        while (i15 < 4) {
            float[] fArr15 = fArr10[i15];
            float f24 = f21 / (f21 - fArr15[c10]);
            int i16 = i15 * 2;
            fArr14[i16] = (fArr15[0] * f24) + width2;
            fArr14[i16 + 1] = (fArr15[1] * f24) + height;
            i15++;
            c10 = 2;
        }
        float f25 = (width2 - width) - f11;
        float f26 = (height - width) - f11;
        float f27 = width2 + width + f11;
        float f28 = height + width + f11;
        float[] fArr16 = new float[8];
        fArr16[0] = f25;
        fArr16[1] = f26;
        fArr16[2] = f27;
        fArr16[i10] = f26;
        fArr16[4] = f27;
        fArr16[5] = f28;
        fArr16[c3] = f25;
        fArr16[7] = f28;
        if (z4 && rectF != null) {
            float f29 = rectF.left;
            float f30 = rectF.top;
            float f31 = rectF.right;
            float f32 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f29;
            fArr17[1] = f30;
            fArr17[2] = f31;
            fArr17[i10] = f30;
            fArr17[4] = f31;
            fArr17[5] = f32;
            fArr17[c3] = f29;
            fArr17[7] = f32;
            AndroidUtilities.lerp(fArr17, fArr14, this.B, fArr14);
        }
        Matrix matrix = this.b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void f(int i10, FrameLayout frameLayout) {
        if (i10 == -1) {
            i10 = 5;
        }
        AndroidUtilities.removeFromParent(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, k7.c6.e(64, 64, 17));
        this.v.add(Integer.valueOf(i10));
        this.w.put(Integer.valueOf(childCount), Integer.valueOf(i10));
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (i11 < 6) {
            Integer[] numArr = this.s;
            if (i11 < numArr.length) {
                return numArr[i11].intValue();
            }
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.F, 16L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.F);
    }
}
