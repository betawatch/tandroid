package org.telegram.messenger;

import android.R;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.StaticLayout;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k9 {
    public static float i;
    public static float j;
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public k9(org.telegram.ui.Cells.q1 q1Var) {
        this.c = new Path();
        this.d = new Rect();
        this.f = new RectF();
        this.b = q1Var;
        this.e = new org.telegram.ui.Components.dc(q1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, RectF rectF, float f7, int i10, float f10) {
        int i11;
        Path path;
        Path path2 = (Path) this.f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.c;
        Paint paint2 = (Paint) this.b;
        RectF rectF3 = (RectF) this.g;
        if (f10 > 0.004f && !qh.t.a(canvas, rectF, f7, i10, f10)) {
            int i12 = this.a;
            float[][] fArr = qh.y0.a;
            int i13 = 4;
            int i14 = 1;
            if (i12 != 1) {
                this.a = 1;
                int i15 = 0;
                while (i15 < i13) {
                    float[] fArr2 = fArr[i15];
                    int i16 = i13;
                    int[] iArr = new int[73];
                    int i17 = i14;
                    float[] fArr3 = new float[73];
                    int i18 = 0;
                    for (int i19 = 73; i18 < i19; i19 = 73) {
                        int i20 = i15;
                        float[][] fArr4 = fArr;
                        double radians = Math.toRadians(i18 * 5);
                        Path path3 = path2;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        float f11 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                        iArr[i18] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f11) * pow) + f11)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i18] = i18 / 72.0f;
                        i18++;
                        fArr = fArr4;
                        i15 = i20;
                        path2 = path3;
                        sweepGradientArr = sweepGradientArr2;
                    }
                    SweepGradient[] sweepGradientArr3 = sweepGradientArr;
                    int i21 = i15;
                    sweepGradientArr3[i21] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i15 = i21 + 1;
                    i13 = i16;
                    i14 = i17;
                    path2 = path2;
                    sweepGradientArr = sweepGradientArr3;
                }
            }
            Path path4 = path2;
            SweepGradient[] sweepGradientArr4 = sweepGradientArr;
            int i22 = i14;
            int i23 = i13;
            int i24 = 0;
            float[] fArr5 = fArr[i10];
            float f12 = i;
            float f13 = j;
            float N = i0.N(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f7 - N);
            matrix.setRotate(f12);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = i0.N(fArr5[i23]);
            if (N2 > 0.05f) {
                sweepGradientArr4[i10].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i10]);
                paint.setColor(-1);
                paint.setAlpha((int) (f10 * 255.0f));
                paint.setStrokeWidth(N2);
                rectF2.set(rectF3);
                float f14 = (-N2) / 2.0f;
                rectF2.inset(f14, f14);
                float f15 = (N2 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f15, f15, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f12);
            float f16 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float N3 = i0.N(fArr5[0]);
            float N4 = i0.N(fArr5[2]);
            float min = Math.min(1.0f, (f13 + 1.0f) * (fArr5[i22] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f13) * (fArr5[3] / 100.0f));
            int i25 = Build.VERSION.SDK_INT >= 29 ? i22 : 0;
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i26 = 0;
            for (int i27 = 2; i26 < i27; i27 = 2) {
                float f17 = i26 == 0 ? min : min2;
                float f18 = i26 == 0 ? N3 : -N4;
                if (f17 <= 0.004f || Math.abs(f18) < 0.1f) {
                    i11 = i24;
                    path = path4;
                } else {
                    rectF2.set(rectF3);
                    rectF2.offset(f16 * f18, f18 * cos);
                    path4.rewind();
                    path = path4;
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    qh.u.b(canvas, path);
                    if (i25 != 0) {
                        int round = Math.round(Math.min(1.0f, f17) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f10 * 255.0f));
                        qh.u.i(i22, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f17 * 255.0f * f10));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i11 = i24;
                    if (i25 != 0) {
                        qh.u.i(i11, paint2);
                    }
                    canvas.restore();
                }
                i26++;
                path4 = path;
                i24 = i11;
            }
        }
    }

    public void b(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.g;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.g).draw(canvas);
        }
        if (z10) {
            t80 t80Var = (t80) this.h;
            if (t80Var == null) {
                t80 t80Var2 = new t80();
                this.h = t80Var2;
                t80Var2.D = true;
            } else if (t80Var.c() || ((t80) this.h).d()) {
                t80 t80Var3 = (t80) this.h;
                t80Var3.b = -1L;
                t80Var3.c = -1L;
            }
        } else {
            t80 t80Var4 = (t80) this.h;
            if (t80Var4 != null && !t80Var4.d() && !((t80) this.h).c()) {
                ((t80) this.h).a();
            }
        }
        canvas.restore();
        t80 t80Var5 = (t80) this.h;
        if (t80Var5 == null || t80Var5.c()) {
            return;
        }
        t80 t80Var6 = (t80) this.h;
        t80Var6.y = path;
        t80Var6.g(org.telegram.ui.ActionBar.t6.r1(0.7f, this.a), org.telegram.ui.ActionBar.t6.r1(1.3f, this.a), org.telegram.ui.ActionBar.t6.r1(1.5f, this.a), org.telegram.ui.ActionBar.t6.r1(2.0f, this.a));
        ((t80) this.h).setBounds(rect);
        canvas.save();
        ((t80) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.q1) this.b).invalidate();
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float L;
        RectF rectF = (RectF) this.f;
        int textSize = (((int) org.telegram.ui.ActionBar.t6.X2.getTextSize()) * 2) + i0.L(4.0f);
        float max = Math.max(0, Math.min(6, tz.Y0) - 1);
        float min = Math.min(9, tz.Y0);
        float min2 = Math.min(3, tz.Y0);
        float f7 = -i0.L(a1.g.c(min, 9.0f, 2.66f, 4.0f));
        float f10 = -i0.L(3.0f);
        float L2 = i0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + i0.L(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + i0.L(r2);
        Path path = (Path) this.c;
        path.rewind();
        if (!z10) {
            max = tz.Y0 / 2.0f;
        }
        float L3 = i0.L(max) * 2;
        rectF.set(f7, f10, f7 + L3, L3 + f10);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f11 = lineWidth - lineWidth2;
        float max2 = Math.abs(f11) < ((float) i0.L(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f11) > i0.L(r14)) {
            float L4 = i0.L(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z11 = c3.i0.z(L2, f10, 0.45f, f10);
                L = i0.L(min) * 2;
                rectF.set(max2 - L, f10, max2, f10 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - L4, L4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f12 = lineWidth2 - (L2 - z11);
                rectF.set(f12, z11, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f12, z11, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = c3.i0.z(L2, f10, 0.55f, f10);
                float f13 = z12 - f10;
                rectF.set(max2 - f13, f10, max2, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = i0.L(min) * 2;
                rectF.set(lineWidth - f13, f10, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + L4, L4 + z12);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L2 - L, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = i0.L(min) * 2;
            float f14 = max2 - L;
            rectF.set(f14, f10, max2, f10 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f14, L2 - L, max2, L2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f7, L2 - L, L + f7, L2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f7, (int) f10, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i10) {
        if (this.a != i10) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.g;
            if (yVar == null) {
                this.g = org.telegram.ui.ActionBar.t6.h0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.t6.H1(yVar, i10, true);
            }
            ((org.telegram.ui.Cells.y) this.g).setCallback((org.telegram.ui.Cells.q1) this.b);
            this.a = i10;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((org.telegram.ui.Components.dc) this.e).c(z10);
        if (z10 && (yVar = (org.telegram.ui.Cells.y) this.g) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.g;
        if (yVar2 != null) {
            yVar2.setState(z10 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.q1) this.b).invalidate();
    }

    public k9(int i10) {
        switch (i10) {
            case 3:
                this.b = new Paint(1);
                Paint paint = new Paint(1);
                this.c = paint;
                this.d = new SweepGradient[4];
                this.a = -1;
                this.e = new Matrix();
                this.f = new Path();
                this.g = new RectF();
                this.h = new RectF();
                paint.setStyle(Paint.Style.STROKE);
                break;
            default:
                Paint paint2 = new Paint();
                this.c = paint2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.d = new mb0(tileMode);
                this.e = new mb0(tileMode);
                this.f = new mb0(Shader.TileMode.REPEAT);
                this.g = new org.telegram.ui.Components.tm();
                this.h = new org.telegram.ui.Components.tm();
                this.b = new float[4];
                paint2.setFilterBitmap(true);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                break;
        }
    }
}
