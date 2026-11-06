package ai;

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
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.ua0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n1 {
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

    public n1(q1 q1Var) {
        this.f = new Path();
        this.c = new Rect();
        this.g = new RectF();
        this.b = q1Var;
        this.d = new ic(q1Var, 0.8f, 1.4f);
    }

    public void a(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        int i10;
        Path path;
        Path path2 = (Path) this.f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.c;
        Paint paint2 = (Paint) this.b;
        RectF rectF3 = (RectF) this.g;
        if (f11 > 0.004f && !z.a(f10, f11, i7, canvas, rectF)) {
            int i11 = this.a;
            float[][] fArr = o1.a;
            int i12 = 4;
            int i13 = 1;
            if (i11 != 1) {
                this.a = 1;
                int i14 = 0;
                while (i14 < i12) {
                    float[] fArr2 = fArr[i14];
                    int i15 = i12;
                    int[] iArr = new int[73];
                    int i16 = i13;
                    float[] fArr3 = new float[73];
                    int i17 = 0;
                    for (int i18 = 73; i17 < i18; i18 = 73) {
                        int i19 = i14;
                        float[][] fArr4 = fArr;
                        double radians = Math.toRadians(i17 * 5);
                        Path path3 = path2;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        float f12 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                        iArr[i17] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f12) * pow) + f12)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i17] = i17 / 72.0f;
                        i17++;
                        fArr = fArr4;
                        i14 = i19;
                        path2 = path3;
                        sweepGradientArr = sweepGradientArr2;
                    }
                    SweepGradient[] sweepGradientArr3 = sweepGradientArr;
                    int i20 = i14;
                    sweepGradientArr3[i20] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i14 = i20 + 1;
                    i12 = i15;
                    i13 = i16;
                    path2 = path2;
                    sweepGradientArr = sweepGradientArr3;
                }
            }
            Path path4 = path2;
            SweepGradient[] sweepGradientArr4 = sweepGradientArr;
            int i21 = i13;
            int i22 = i12;
            int i23 = 0;
            float[] fArr5 = fArr[i7];
            float f13 = i;
            float f14 = j;
            float N = org.telegram.messenger.g0.N(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f10 - N);
            matrix.setRotate(f13);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = org.telegram.messenger.g0.N(fArr5[i22]);
            if (N2 > 0.05f) {
                sweepGradientArr4[i7].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i7]);
                paint.setColor(-1);
                paint.setAlpha((int) (f11 * 255.0f));
                paint.setStrokeWidth(N2);
                rectF2.set(rectF3);
                float f15 = (-N2) / 2.0f;
                rectF2.inset(f15, f15);
                float f16 = (N2 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f16, f16, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f13);
            float f17 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float N3 = org.telegram.messenger.g0.N(fArr5[0]);
            float N4 = org.telegram.messenger.g0.N(fArr5[2]);
            float min = Math.min(1.0f, (f14 + 1.0f) * (fArr5[i21] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f14) * (fArr5[3] / 100.0f));
            int i24 = Build.VERSION.SDK_INT >= 29 ? i21 : 0;
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i25 = 0;
            for (int i26 = 2; i25 < i26; i26 = 2) {
                float f18 = i25 == 0 ? min : min2;
                float f19 = i25 == 0 ? N3 : -N4;
                if (f18 <= 0.004f || Math.abs(f19) < 0.1f) {
                    i10 = i23;
                    path = path4;
                } else {
                    rectF2.set(rectF3);
                    rectF2.offset(f17 * f19, f19 * cos);
                    path4.rewind();
                    path = path4;
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    a0.b(canvas, path);
                    if (i24 != 0) {
                        int round = Math.round(Math.min(1.0f, f18) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f11 * 255.0f));
                        a0.i(i21, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f18 * 255.0f * f11));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i10 = i23;
                    if (i24 != 0) {
                        a0.i(i10, paint2);
                    }
                    canvas.restore();
                }
                i25++;
                path4 = path;
                i23 = i10;
            }
        }
    }

    public void b(Canvas canvas, boolean z9) {
        Rect rect = (Rect) this.c;
        canvas.save();
        Path path = (Path) this.f;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.e;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.e).draw(canvas);
        }
        if (z9) {
            a80 a80Var = (a80) this.h;
            if (a80Var == null) {
                a80 a80Var2 = new a80();
                this.h = a80Var2;
                a80Var2.D = true;
            } else if (a80Var.c() || ((a80) this.h).d()) {
                a80 a80Var3 = (a80) this.h;
                a80Var3.b = -1L;
                a80Var3.c = -1L;
            }
        } else {
            a80 a80Var4 = (a80) this.h;
            if (a80Var4 != null && !a80Var4.d() && !((a80) this.h).c()) {
                ((a80) this.h).a();
            }
        }
        canvas.restore();
        a80 a80Var5 = (a80) this.h;
        if (a80Var5 == null || a80Var5.c()) {
            return;
        }
        a80 a80Var6 = (a80) this.h;
        a80Var6.y = path;
        a80Var6.g(k6.r1(0.7f, this.a), k6.r1(1.3f, this.a), k6.r1(1.5f, this.a), k6.r1(2.0f, this.a));
        ((a80) this.h).setBounds(rect);
        canvas.save();
        ((a80) this.h).draw(canvas);
        canvas.restore();
        ((q1) this.b).invalidate();
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z9) {
        float L;
        RectF rectF = (RectF) this.g;
        int textSize = (((int) k6.X2.getTextSize()) * 2) + org.telegram.messenger.g0.L(4.0f);
        float max = Math.max(0, Math.min(6, iz.Y0) - 1);
        float min = Math.min(9, iz.Y0);
        float min2 = Math.min(3, iz.Y0);
        float f10 = -org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.c(min, 9.0f, 2.66f, 4.0f));
        float f11 = -org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + org.telegram.messenger.g0.L(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + org.telegram.messenger.g0.L(r2);
        Path path = (Path) this.f;
        path.rewind();
        if (!z9) {
            max = iz.Y0 / 2.0f;
        }
        float L3 = org.telegram.messenger.g0.L(max) * 2;
        rectF.set(f10, f11, f10 + L3, L3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float max2 = Math.abs(f12) < ((float) org.telegram.messenger.g0.L(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f12) > org.telegram.messenger.g0.L(r14)) {
            float L4 = org.telegram.messenger.g0.L(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z10 = com.google.android.recaptcha.internal.a.z(L2, f11, 0.45f, f11);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(max2 - L, f11, max2, f11 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z10 - L4, L4 + lineWidth, z10);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f13 = lineWidth2 - (L2 - z10);
                rectF.set(f13, z10, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f13, z10, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z11 = com.google.android.recaptcha.internal.a.z(L2, f11, 0.55f, f11);
                float f14 = z11 - f11;
                rectF.set(max2 - f14, f11, max2, z11);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(lineWidth - f14, f11, lineWidth, z11);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z11, lineWidth2 + L4, L4 + z11);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L2 - L, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = org.telegram.messenger.g0.L(min) * 2;
            float f15 = max2 - L;
            rectF.set(f15, f11, max2, f11 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f15, L2 - L, max2, L2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, L2 - L, L + f10, L2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.c).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i7) {
        if (this.a != i7) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.e;
            if (yVar == null) {
                this.e = k6.h0(i7, 2, -1);
            } else {
                k6.H1(yVar, i7, true);
            }
            ((org.telegram.ui.Cells.y) this.e).setCallback((q1) this.b);
            this.a = i7;
        }
    }

    public void e(boolean z9) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.c;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((ic) this.d).c(z9);
        if (z9 && (yVar = (org.telegram.ui.Cells.y) this.e) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.e;
        if (yVar2 != null) {
            yVar2.setState(z9 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((q1) this.b).invalidate();
    }

    public n1(int i7) {
        switch (i7) {
            case 3:
                Paint paint = new Paint();
                this.b = paint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.c = new ua0(tileMode);
                this.d = new ua0(tileMode);
                this.e = new ua0(Shader.TileMode.REPEAT);
                this.f = new lm();
                this.g = new lm();
                this.h = new float[4];
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                break;
            default:
                this.b = new Paint(1);
                Paint paint2 = new Paint(1);
                this.c = paint2;
                this.d = new SweepGradient[4];
                this.a = -1;
                this.e = new Matrix();
                this.f = new Path();
                this.g = new RectF();
                this.h = new RectF();
                paint2.setStyle(Paint.Style.STROKE);
                break;
        }
    }
}
