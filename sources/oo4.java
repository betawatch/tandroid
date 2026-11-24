// default package

import android.R;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.StaticLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oo4 {
    public static float i;
    public static float j;
    public int a;
    public final Path b;
    public final RectF c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public oo4() {
        this.d = new Paint(1);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new SweepGradient[4];
        this.a = -1;
        this.g = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f, float f2, int i2, Canvas canvas, RectF rectF) {
        float f3;
        float f4;
        float f5;
        int i3;
        int i4;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.f;
        Matrix matrix = (Matrix) this.g;
        Paint paint = (Paint) this.d;
        RectF rectF2 = (RectF) this.h;
        Paint paint2 = (Paint) this.e;
        if (f2 <= 0.004f || vx8.a(f, f2, i2, canvas, rectF)) {
            return;
        }
        int i5 = this.a;
        float[][] fArr = ned.a;
        int i6 = 4;
        int i7 = 1;
        if (i5 != 1) {
            this.a = 1;
            int i8 = 0;
            while (i8 < i6) {
                float[] fArr2 = fArr[i8];
                int i9 = i6;
                int[] iArr = new int[73];
                float[] fArr3 = new float[73];
                int i10 = 0;
                for (int i11 = 73; i10 < i11; i11 = 73) {
                    int i12 = i7;
                    int i13 = i10;
                    double radians = Math.toRadians(i10 * 5);
                    int[] iArr2 = iArr;
                    int i14 = i8;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                    float f6 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                    iArr2[i13] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f6) * pow) + f6)) * 255.0f) + 0.5f)) << 24;
                    fArr3[i13] = i13 / 72.0f;
                    i10 = i13 + 1;
                    i7 = i12;
                    iArr = iArr2;
                    i8 = i14;
                }
                int i15 = i8;
                sweepGradientArr[i15] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                i8 = i15 + 1;
                i6 = i9;
            }
        }
        int i16 = i6;
        int i17 = i7;
        int i18 = 0;
        float[] fArr4 = fArr[i2];
        float f7 = i;
        float f8 = j;
        float N = gm.N(fArr4[8]);
        RectF rectF3 = this.c;
        rectF3.set(rectF);
        rectF3.inset(N, N);
        float max = Math.max(0.0f, f - N);
        matrix.setRotate(f7);
        matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
        matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
        float N2 = gm.N(fArr4[i16]);
        if (N2 > 0.05f) {
            sweepGradientArr[i2].setLocalMatrix(matrix);
            paint2.setShader(sweepGradientArr[i2]);
            paint2.setColor(-1);
            paint2.setAlpha((int) (f2 * 255.0f));
            paint2.setStrokeWidth(N2);
            rectF2.set(rectF3);
            float f9 = (-N2) / 2.0f;
            rectF2.inset(f9, f9);
            float f10 = (N2 / 2.0f) + max;
            canvas.drawRoundRect(rectF2, f10, f10, paint2);
            paint2.setShader(null);
        }
        double radians2 = Math.toRadians(f7);
        float f11 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = gm.N(fArr4[0]);
        float N4 = gm.N(fArr4[2]);
        float min = Math.min(1.0f, (f8 + 1.0f) * (fArr4[i17] / 100.0f));
        float min2 = Math.min(1.0f, (1.0f - f8) * (fArr4[3] / 100.0f));
        int i19 = Build.VERSION.SDK_INT >= 29 ? i17 : 0;
        float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            if (i20 == 0) {
                f3 = N3;
                f4 = min;
            } else {
                f3 = -N4;
                f4 = min2;
            }
            if (f4 <= 0.004f || Math.abs(f3) < 0.1f) {
                f5 = cos;
                i3 = i18;
                i4 = i17;
            } else {
                rectF2.set(rectF3);
                f5 = cos;
                rectF2.offset(f11 * f3, f3 * f5);
                Path path = this.b;
                path.rewind();
                path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                canvas.save();
                y00.d(canvas, path);
                if (i19 != 0) {
                    int round = Math.round(Math.min(1.0f, f4) * 255.0f);
                    paint.setColor((round << 16) | (-16777216) | (round << 8) | round);
                    paint.setAlpha((int) (f2 * 255.0f));
                    i4 = i17;
                    y00.u(i4, paint);
                } else {
                    i4 = i17;
                    paint.setColor(-1);
                    paint.setAlpha((int) (f4 * 255.0f * f2));
                }
                canvas.drawRoundRect(rectF3, min3, min3, paint);
                i3 = i18;
                if (i19 != 0) {
                    y00.u(i3, paint);
                }
                canvas.restore();
            }
            i20++;
            i18 = i3;
            i17 = i4;
            cos = f5;
        }
    }

    public final void b(Canvas canvas, boolean z) {
        Rect rect = (Rect) this.e;
        canvas.save();
        Path path = this.b;
        canvas.clipPath(path);
        fg0 fg0Var = (fg0) this.g;
        if (fg0Var != null) {
            fg0Var.setBounds(rect);
            ((fg0) this.g).draw(canvas);
        }
        qa6 qa6Var = (qa6) this.h;
        if (z) {
            if (qa6Var == null) {
                qa6 qa6Var2 = new qa6();
                this.h = qa6Var2;
                qa6Var2.D = true;
            } else if (qa6Var.c() || ((qa6) this.h).d()) {
                qa6 qa6Var3 = (qa6) this.h;
                qa6Var3.b = -1L;
                qa6Var3.c = -1L;
            }
        } else if (qa6Var != null && !qa6Var.d() && !((qa6) this.h).c()) {
            ((qa6) this.h).a();
        }
        canvas.restore();
        qa6 qa6Var4 = (qa6) this.h;
        if (qa6Var4 == null || qa6Var4.c()) {
            return;
        }
        qa6 qa6Var5 = (qa6) this.h;
        qa6Var5.y = path;
        qa6Var5.g(cmb.p1(0.7f, this.a), cmb.p1(1.3f, this.a), cmb.p1(1.5f, this.a), cmb.p1(2.0f, this.a));
        ((qa6) this.h).setBounds(rect);
        canvas.save();
        ((qa6) this.h).draw(canvas);
        canvas.restore();
        ((rc2) this.d).invalidate();
    }

    public final void c(StaticLayout[] staticLayoutArr, boolean z) {
        float L;
        int L2 = gm.L(4.0f) + (((int) cmb.W2.getTextSize()) << 1);
        float max = Math.max(0, Math.min(6, gda.U0) - 1);
        float min = Math.min(9, gda.U0);
        float min2 = Math.min(3, gda.U0);
        float f = -gm.L(b10.A(min, 9.0f, 2.66f, 4.0f));
        float f2 = -gm.L(3.0f);
        float L3 = gm.L(5.0f) + L2;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + gm.L(r1);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + gm.L(r1);
        Path path = this.b;
        path.rewind();
        if (!z) {
            max = gda.U0 / 2.0f;
        }
        float L4 = gm.L(max) << 1;
        RectF rectF = this.c;
        rectF.set(f, f2, f + L4, L4 + f2);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f3 = lineWidth - lineWidth2;
        float max2 = Math.abs(f3) < ((float) gm.L(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f3) > gm.L(r15)) {
            float L5 = gm.L(min2) << 1;
            if (lineWidth < lineWidth2) {
                float A = td4.A(L3, f2, 0.45f, f2);
                L = gm.L(min) << 1;
                rectF.set(max2 - L, f2, max2, f2 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, A - L5, L5 + lineWidth, A);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f4 = lineWidth2 - (L3 - A);
                rectF.set(f4, A, lineWidth2, L3);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f4, A, lineWidth2, L3);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float A2 = td4.A(L3, f2, 0.55f, f2);
                float f5 = A2 - f2;
                rectF.set(max2 - f5, f2, max2, A2);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = gm.L(min) << 1;
                rectF.set(lineWidth - f5, f2, lineWidth, A2);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, A2, lineWidth2 + L5, L5 + A2);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L3 - L, lineWidth2, L3);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = gm.L(min) << 1;
            float f6 = max2 - L;
            rectF.set(f6, f2, max2, f2 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f6, L3 - L, max2, L3);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f, L3 - L, L + f, L3);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.e).set((int) f, (int) f2, (int) Math.max(lineWidth, lineWidth2), (int) L3);
    }

    public final void d(int i2) {
        if (this.a != i2) {
            fg0 fg0Var = (fg0) this.g;
            if (fg0Var == null) {
                this.g = cmb.f0(i2, 2, -1);
            } else {
                cmb.F1(fg0Var, i2, true);
            }
            ((fg0) this.g).setCallback((rc2) this.d);
            this.a = i2;
        }
    }

    public final void e(boolean z) {
        fg0 fg0Var;
        Rect rect = (Rect) this.e;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((u51) this.f).c(z);
        if (z && (fg0Var = (fg0) this.g) != null) {
            fg0Var.setHotspot(centerX, centerY);
        }
        fg0 fg0Var2 = (fg0) this.g;
        if (fg0Var2 != null) {
            fg0Var2.setState(z ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((rc2) this.d).invalidate();
    }

    public oo4(rc2 rc2Var) {
        this.b = new Path();
        this.e = new Rect();
        this.c = new RectF();
        this.d = rc2Var;
        this.f = new u51(rc2Var, 0.8f, 1.4f);
    }
}
