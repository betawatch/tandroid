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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v1 {
    public static float i;
    public static float j;
    public final Object a;
    public final Object b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public v1(org.telegram.ui.Cells.s1 s1Var) {
        this.a = new Path();
        this.e = new Rect();
        this.b = new RectF();
        this.d = s1Var;
        this.f = new xc(s1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, RectF rectF, float f7, int i10, float f10) {
        int i11;
        Path path;
        Path path2 = (Path) this.a;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.f;
        Matrix matrix = (Matrix) this.g;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.e;
        Paint paint2 = (Paint) this.d;
        RectF rectF3 = (RectF) this.b;
        if (f10 > 0.004f && !a0.a(canvas, rectF, f7, i10, f10)) {
            int i12 = this.c;
            float[][] fArr = w1.a;
            int i13 = 4;
            int i14 = 1;
            if (i12 != 1) {
                this.c = 1;
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
            float dpf2 = AndroidUtilities.dpf2(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(dpf2, dpf2);
            float max = Math.max(0.0f, f7 - dpf2);
            matrix.setRotate(f12);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float dpf22 = AndroidUtilities.dpf2(fArr5[i23]);
            if (dpf22 > 0.05f) {
                sweepGradientArr4[i10].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i10]);
                paint.setColor(-1);
                paint.setAlpha((int) (f10 * 255.0f));
                paint.setStrokeWidth(dpf22);
                rectF2.set(rectF3);
                float f14 = (-dpf22) / 2.0f;
                rectF2.inset(f14, f14);
                float f15 = (dpf22 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f15, f15, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f12);
            float f16 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float dpf23 = AndroidUtilities.dpf2(fArr5[0]);
            float dpf24 = AndroidUtilities.dpf2(fArr5[2]);
            float min = Math.min(1.0f, (f13 + 1.0f) * (fArr5[i22] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f13) * (fArr5[3] / 100.0f));
            int i25 = Build.VERSION.SDK_INT >= 29 ? i22 : 0;
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i26 = 0;
            for (int i27 = 2; i26 < i27; i27 = 2) {
                float f17 = i26 == 0 ? min : min2;
                float f18 = i26 == 0 ? dpf23 : -dpf24;
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
                    b0.b(canvas, path);
                    if (i25 != 0) {
                        int round = Math.round(Math.min(1.0f, f17) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f10 * 255.0f));
                        b0.i(paint2, i22);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f17 * 255.0f * f10));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i11 = i24;
                    if (i25 != 0) {
                        b0.i(paint2, i11);
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
        Rect rect = (Rect) this.e;
        canvas.save();
        Path path = (Path) this.a;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.g;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.g).draw(canvas);
        }
        if (z10) {
            da0 da0Var = (da0) this.h;
            if (da0Var == null) {
                da0 da0Var2 = new da0();
                this.h = da0Var2;
                da0Var2.D = true;
            } else if (da0Var.c() || ((da0) this.h).d()) {
                da0 da0Var3 = (da0) this.h;
                da0Var3.b = -1L;
                da0Var3.c = -1L;
            }
        } else {
            da0 da0Var4 = (da0) this.h;
            if (da0Var4 != null && !da0Var4.d() && !((da0) this.h).c()) {
                ((da0) this.h).a();
            }
        }
        canvas.restore();
        da0 da0Var5 = (da0) this.h;
        if (da0Var5 == null || da0Var5.c()) {
            return;
        }
        da0 da0Var6 = (da0) this.h;
        da0Var6.y = path;
        da0Var6.g(y6.o1(0.7f, this.c), y6.o1(1.3f, this.c), y6.o1(1.5f, this.c), y6.o1(2.0f, this.c));
        ((da0) this.h).setBounds(rect);
        canvas.save();
        ((da0) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.s1) this.d).invalidate();
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float dp;
        RectF rectF = (RectF) this.b;
        int textSize = (((int) y6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f7 = -AndroidUtilities.dp(a1.g.c(min, 9.0f, 2.66f, 4.0f));
        float f10 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(r2);
        Path path = (Path) this.a;
        path.rewind();
        if (!z10) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f7, f10, f7 + dp3, dp3 + f10);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f11 = lineWidth - lineWidth2;
        float max2 = Math.abs(f11) < ((float) AndroidUtilities.dp(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f11) > AndroidUtilities.dp(r14)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z11 = c3.h0.z(dp2, f10, 0.45f, f10);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(max2 - dp, f10, max2, f10 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f12 = lineWidth2 - (dp2 - z11);
                rectF.set(f12, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f12, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = c3.h0.z(dp2, f10, 0.55f, f10);
                float f13 = z12 - f10;
                rectF.set(max2 - f13, f10, max2, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f13, f10, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + dp4, dp4 + z12);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f14 = max2 - dp;
            rectF.set(f14, f10, max2, f10 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f14, dp2 - dp, max2, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f7, dp2 - dp, dp + f7, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.e).set((int) f7, (int) f10, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void d(int i10) {
        if (this.c != i10) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.g;
            if (yVar == null) {
                this.g = y6.g0(i10, 2, -1);
            } else {
                y6.E1(yVar, i10, true);
            }
            ((org.telegram.ui.Cells.y) this.g).setCallback((org.telegram.ui.Cells.s1) this.d);
            this.c = i10;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.e;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((xc) this.f).c(z10);
        if (z10 && (yVar = (org.telegram.ui.Cells.y) this.g) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.g;
        if (yVar2 != null) {
            yVar2.setState(z10 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.s1) this.d).invalidate();
    }

    public v1(int i10) {
        switch (i10) {
            case 2:
                Paint paint = new Paint();
                this.d = paint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.e = new yc0(tileMode);
                this.f = new yc0(tileMode);
                this.g = new yc0(Shader.TileMode.REPEAT);
                this.a = new rt();
                this.b = new rt();
                this.h = new float[4];
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                break;
            default:
                this.d = new Paint(1);
                Paint paint2 = new Paint(1);
                this.e = paint2;
                this.f = new SweepGradient[4];
                this.c = -1;
                this.g = new Matrix();
                this.a = new Path();
                this.b = new RectF();
                this.h = new RectF();
                paint2.setStyle(Paint.Style.STROKE);
                break;
        }
    }
}
