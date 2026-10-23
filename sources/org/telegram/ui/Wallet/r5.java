package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class r5 extends View {
    public boolean a;
    public final /* synthetic */ s5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, Context context) {
        super(context);
        this.b = s5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((r6 - r14) <= 328.0f) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        boolean z10;
        int i16;
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        s5 s5Var = this.b;
        p5 p5Var = s5Var.b;
        if (p5Var != null) {
            boolean z11 = !s5Var.a && this.a;
            f7 = 168.0f;
            Path path = p5Var.t;
            f10 = 102.5f;
            Paint paint = p5Var.b;
            paint.setShader(null);
            paint.setColor(-1);
            i10 = 5;
            float[][] fArr = p5Var.L;
            int length = fArr.length;
            int i17 = 0;
            i11 = 1;
            while (i17 < length) {
                float[] fArr2 = fArr[i17];
                if (!p5Var.M.contains(fArr2[0], fArr2[1])) {
                    if (z11) {
                        float f12 = fArr2[0];
                        float f13 = fArr2[2];
                        if (f12 + f13 >= 298.0f) {
                        }
                    }
                    z10 = z11;
                    double atan2 = Math.atan2(fArr2[1] - 102.5f, fArr2[0] - 168.0f);
                    double cos = Math.cos(atan2 - p5Var.U);
                    i16 = i17;
                    paint.setAlpha(Math.round(p5.i(0.16f, 0.96f, Math.max(0.0f, (fArr2[5] * p5Var.Y) + (fArr2[4] * p5Var.X) + (fArr2[3] * p5Var.W)) * ((float) Math.pow(Math.max(0.0f, (fArr2[5] * p5Var.b0) + (fArr2[4] * p5Var.a0) + (fArr2[3] * p5Var.Z)), 10.0d))) * (1.0f - ((1.0f - p5.l(0.12f, 0.85f, (float) Math.pow(Math.pow(Math.sin(atan2 - p5Var.V) / 0.64d, 2.0d) + 1.0d, -2.0d))) * (1.0f - p5.l(0.25f, 0.85f, (float) Math.pow(Math.abs(cos), cos >= 0.0d ? 3.081664098613251d : 5.0d))))) * 255.0f));
                    float f14 = fArr2[0];
                    float f15 = fArr2[1];
                    float f16 = fArr2[2];
                    float f17 = 0.15f * f16;
                    path.rewind();
                    path.moveTo(f14 - f16, f15);
                    float f18 = f14 - f17;
                    float f19 = f15 - f17;
                    path.lineTo(f18, f19);
                    path.lineTo(f14, f15 - f16);
                    float f20 = f14 + f17;
                    path.lineTo(f20, f19);
                    path.lineTo(f14 + f16, f15);
                    float f21 = f17 + f15;
                    path.lineTo(f20, f21);
                    path.lineTo(f14, f15 + f16);
                    path.lineTo(f18, f21);
                    path.close();
                    canvas.drawPath(path, paint);
                    i17 = i16 + 1;
                    z11 = z10;
                }
                i16 = i17;
                z10 = z11;
                i17 = i16 + 1;
                z11 = z10;
            }
            i12 = 3;
            i13 = 2;
            paint.setAlpha(255);
        } else {
            f7 = 168.0f;
            f10 = 102.5f;
            i10 = 5;
            i11 = 1;
            i12 = 3;
            i13 = 2;
        }
        p5 p5Var2 = s5Var.b;
        if (p5Var2 != null && !s5Var.a) {
            RectF rectF = p5Var2.g;
            Paint paint2 = p5Var2.d;
            int save2 = canvas.save();
            Path path2 = p5Var2.s;
            path2.rewind();
            RectF rectF2 = p5Var2.M;
            path2.addRoundRect(rectF2, 8.0f, 8.0f, Path.Direction.CW);
            canvas.clipPath(path2);
            Paint paint3 = p5Var2.b;
            paint3.setShader(p5Var2.c0);
            canvas.drawRect(rectF2, paint3);
            paint3.setShader(null);
            p5Var2.b(canvas, p5.m0[4], rectF2, 55);
            p5Var2.b(canvas, p5.m0[i10], rectF2, 95);
            ComposeShader composeShader = p5Var2.e0;
            if (composeShader != null) {
                paint3.setShader(composeShader);
                paint3.setAlpha(95);
                canvas.drawRect(rectF2, paint3);
                paint3.setShader(null);
                paint3.setAlpha(255);
            }
            if (p5Var2.Q != null) {
                float l4 = (p5.l(0.05f, 0.42f, -((float) Math.sin(Math.toRadians(p5Var2.S)))) * 0.65f) + 0.35f;
                paint3.setColorFilter(new PorterDuffColorFilter(-14405316, PorterDuff.Mode.SRC_IN));
                p5Var2.b(canvas, p5Var2.Q, rectF2, Math.round(((l4 * 0.495f) + 0.1f) * 255.0f));
                paint3.setColorFilter(null);
                float f22 = (float) (((((p5Var2.V / 6.283185307179586d) % 1.0d) + 1.0d) % 1.0d) * 8.0d);
                int i18 = (int) f22;
                float f23 = f22 - i18;
                int i19 = 0;
                for (int i20 = i13; i19 < i20; i20 = 2) {
                    float f24 = i19 == 0 ? 1.0f - f23 : f23;
                    int i21 = (i18 + i19) % 8;
                    p5Var2.b(canvas, p5Var2.P[i21], rectF2, Math.round(204.0f * f24));
                    p5Var2.b(canvas, p5Var2.O[i21], rectF2, Math.round(f24 * 248.0f));
                    i19++;
                }
            }
            float cos2 = ((float) Math.cos(p5Var2.V - 0.7d)) * 24.0f;
            float sin = ((float) Math.sin(p5Var2.V - 0.7d)) * 18.0f;
            float[] fArr3 = new float[i12];
            // fill-array-data instruction
            fArr3[0] = 0.0f;
            fArr3[1] = 0.45f;
            fArr3[2] = 1.0f;
            paint2.setShader(new LinearGradient(rectF2.centerX() - cos2, rectF2.centerY() - sin, rectF2.centerX() + cos2, rectF2.centerY() + sin, new int[]{1812994342, 268435455, -1493172225}, fArr3, Shader.TileMode.CLAMP));
            paint2.setStrokeWidth(0.7f);
            rectF.set(rectF2);
            rectF.inset(0.35f, 0.35f);
            canvas.drawRoundRect(rectF, 7.65f, 7.65f, paint2);
            canvas.restoreToCount(save2);
        }
        p5 p5Var3 = s5Var.b;
        if (p5Var3 != null) {
            RectF rectF3 = p5Var3.g;
            Paint paint4 = p5Var3.d;
            double radians = Math.toRadians((p5Var3.T * 3.6d) - (p5Var3.S * 3.2d)) - 2.0420352248333655d;
            float cos3 = (float) Math.cos(radians);
            float sin2 = (float) Math.sin(radians);
            float abs = ((Math.abs(sin2) * 205.0f) + (Math.abs(cos3) * 336.0f)) * 0.5f;
            int i22 = 0;
            while (true) {
                float f25 = 0.8f;
                if (i22 >= 3) {
                    break;
                }
                if (i22 == 0) {
                    f25 = 0.66f;
                    i14 = i11;
                } else {
                    i14 = i11;
                    if (i22 != i14) {
                        f25 = 0.92f;
                    }
                }
                float f26 = i22 == 0 ? 0.4f : i22 == i14 ? 0.24f : 0.1f;
                int rgb = Color.rgb(Math.round(Color.red(p5Var3.g0) * f25), Math.round(Color.green(p5Var3.g0) * f25), Math.round(Color.blue(p5Var3.g0) * f25));
                int f27 = i0.a.f(0.45f, p5Var3.g0, p5Var3.h0);
                int f28 = i0.a.f(f26, p5Var3.h0, -1);
                float f29 = cos3 * abs;
                float f30 = sin2 * abs;
                int[] iArr = {rgb, rgb, f27, f28, f28};
                int i23 = i10;
                float[] fArr4 = new float[i23];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 0.32f;
                fArr4[2] = 0.53f;
                fArr4[3] = 0.76f;
                fArr4[4] = 1.0f;
                paint4.setShader(new LinearGradient(f7 - f29, f10 - f30, f29 + f7, f30 + f10, iArr, fArr4, Shader.TileMode.CLAMP));
                if (i22 == 0) {
                    f11 = 0.3f;
                    i15 = 1;
                } else {
                    i15 = 1;
                    f11 = i22 == 1 ? 0.88f : 1.47f;
                }
                paint4.setStrokeWidth(i22 == 0 ? 0.6f : i22 == i15 ? 1.0f : 0.43f);
                rectF3.set(f11, f11, 336.0f - f11, 205.0f - f11);
                float f31 = 25.2f - f11;
                canvas.drawRoundRect(rectF3, f31, f31, paint4);
                i22++;
                i10 = i23;
                i11 = i15;
            }
            float c10 = p5.c(((float) Math.sin(Math.toRadians(p5Var3.T))) * 1.7f);
            float c11 = p5.c((-((float) Math.sin(Math.toRadians(p5Var3.T)))) * 1.7f);
            int f32 = i0.a.f(0.38f, p5Var3.h0, -1);
            paint4.setShader(new LinearGradient(0.0f, 102.5f, 336.0f, 102.5f, new int[]{p5.a(c11 * 0.8f, f32), p5.a(c11 * 0.38f, f32), p5.a(0.0f, f32), p5.a(0.0f, f32), p5.a(0.38f * c10, f32), p5.a(c10 * 0.8f, f32)}, new float[]{0.0f, 0.15f, 0.34f, 0.66f, 0.85f, 1.0f}, Shader.TileMode.CLAMP));
            paint4.setStrokeWidth(1.05f);
            rectF3.set(0.95f, 0.95f, 335.05f, 204.05f);
            canvas.drawRoundRect(rectF3, 24.25f, 24.25f, paint4);
            paint4.setShader(null);
        }
        canvas.restoreToCount(save);
    }
}
