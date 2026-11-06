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
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b6 extends View {
    public boolean a;
    public final /* synthetic */ c6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var, Context context) {
        super(context);
        this.b = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((r6 - r14) <= 328.0f) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f12;
        boolean z9;
        int i15;
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        c6 c6Var = this.b;
        z5 z5Var = c6Var.b;
        if (z5Var != null) {
            boolean z10 = !c6Var.a && this.a;
            f10 = 168.0f;
            Path path = z5Var.t;
            f11 = 102.5f;
            Paint paint = z5Var.b;
            paint.setShader(null);
            paint.setColor(-1);
            i7 = 5;
            float[][] fArr = z5Var.L;
            int length = fArr.length;
            int i16 = 0;
            i10 = 1;
            while (i16 < length) {
                float[] fArr2 = fArr[i16];
                if (!z5Var.M.contains(fArr2[0], fArr2[1])) {
                    if (z10) {
                        float f13 = fArr2[0];
                        float f14 = fArr2[2];
                        if (f13 + f14 >= 298.0f) {
                        }
                    }
                    z9 = z10;
                    double atan2 = Math.atan2(fArr2[1] - 102.5f, fArr2[0] - 168.0f);
                    double cos = Math.cos(atan2 - z5Var.U);
                    i15 = i16;
                    paint.setAlpha(Math.round(z5.i(0.16f, 0.96f, Math.max(0.0f, (fArr2[5] * z5Var.Y) + (fArr2[4] * z5Var.X) + (fArr2[3] * z5Var.W)) * ((float) Math.pow(Math.max(0.0f, (fArr2[5] * z5Var.b0) + (fArr2[4] * z5Var.a0) + (fArr2[3] * z5Var.Z)), 10.0d))) * (1.0f - ((1.0f - z5.l(0.12f, 0.85f, (float) Math.pow(Math.pow(Math.sin(atan2 - z5Var.V) / 0.64d, 2.0d) + 1.0d, -2.0d))) * (1.0f - z5.l(0.25f, 0.85f, (float) Math.pow(Math.abs(cos), cos >= 0.0d ? 3.081664098613251d : 5.0d))))) * 255.0f));
                    float f15 = fArr2[0];
                    float f16 = fArr2[1];
                    float f17 = fArr2[2];
                    float f18 = 0.15f * f17;
                    path.rewind();
                    path.moveTo(f15 - f17, f16);
                    float f19 = f15 - f18;
                    float f20 = f16 - f18;
                    path.lineTo(f19, f20);
                    path.lineTo(f15, f16 - f17);
                    float f21 = f15 + f18;
                    path.lineTo(f21, f20);
                    path.lineTo(f15 + f17, f16);
                    float f22 = f18 + f16;
                    path.lineTo(f21, f22);
                    path.lineTo(f15, f16 + f17);
                    path.lineTo(f19, f22);
                    path.close();
                    canvas.drawPath(path, paint);
                    i16 = i15 + 1;
                    z10 = z9;
                }
                i15 = i16;
                z9 = z10;
                i16 = i15 + 1;
                z10 = z9;
            }
            i11 = 3;
            i12 = 2;
            paint.setAlpha(qs.e4);
        } else {
            f10 = 168.0f;
            f11 = 102.5f;
            i7 = 5;
            i10 = 1;
            i11 = 3;
            i12 = 2;
        }
        z5 z5Var2 = c6Var.b;
        if (z5Var2 != null && !c6Var.a) {
            RectF rectF = z5Var2.g;
            Paint paint2 = z5Var2.d;
            int save2 = canvas.save();
            Path path2 = z5Var2.s;
            path2.rewind();
            RectF rectF2 = z5Var2.M;
            path2.addRoundRect(rectF2, 8.0f, 8.0f, Path.Direction.CW);
            canvas.clipPath(path2);
            Paint paint3 = z5Var2.b;
            paint3.setShader(z5Var2.c0);
            canvas.drawRect(rectF2, paint3);
            paint3.setShader(null);
            z5Var2.b(canvas, z5.m0[4], rectF2, 55);
            z5Var2.b(canvas, z5.m0[i7], rectF2, 95);
            ComposeShader composeShader = z5Var2.e0;
            if (composeShader != null) {
                paint3.setShader(composeShader);
                paint3.setAlpha(95);
                canvas.drawRect(rectF2, paint3);
                paint3.setShader(null);
                paint3.setAlpha(qs.e4);
            }
            if (z5Var2.Q != null) {
                float l10 = (z5.l(0.05f, 0.42f, -((float) Math.sin(Math.toRadians(z5Var2.S)))) * 0.65f) + 0.35f;
                paint3.setColorFilter(new PorterDuffColorFilter(-14405316, PorterDuff.Mode.SRC_IN));
                z5Var2.b(canvas, z5Var2.Q, rectF2, Math.round(((l10 * 0.495f) + 0.1f) * 255.0f));
                paint3.setColorFilter(null);
                float f23 = (float) (((((z5Var2.V / 6.283185307179586d) % 1.0d) + 1.0d) % 1.0d) * 8.0d);
                int i17 = (int) f23;
                float f24 = f23 - i17;
                int i18 = 0;
                for (int i19 = i12; i18 < i19; i19 = 2) {
                    float f25 = i18 == 0 ? 1.0f - f24 : f24;
                    int i20 = (i17 + i18) % 8;
                    z5Var2.b(canvas, z5Var2.P[i20], rectF2, Math.round(204.0f * f25));
                    z5Var2.b(canvas, z5Var2.O[i20], rectF2, Math.round(f25 * 248.0f));
                    i18++;
                }
            }
            float cos2 = ((float) Math.cos(z5Var2.V - 0.7d)) * 24.0f;
            float sin = ((float) Math.sin(z5Var2.V - 0.7d)) * 18.0f;
            float[] fArr3 = new float[i11];
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
        z5 z5Var3 = c6Var.b;
        if (z5Var3 != null) {
            RectF rectF3 = z5Var3.g;
            Paint paint4 = z5Var3.d;
            double radians = Math.toRadians((z5Var3.T * 3.6d) - (z5Var3.S * 3.2d)) - 2.0420352248333655d;
            float cos3 = (float) Math.cos(radians);
            float sin2 = (float) Math.sin(radians);
            float abs = ((Math.abs(sin2) * 205.0f) + (Math.abs(cos3) * 336.0f)) * 0.5f;
            int i21 = 0;
            while (true) {
                float f26 = 0.8f;
                if (i21 >= 3) {
                    break;
                }
                if (i21 == 0) {
                    f26 = 0.66f;
                    i13 = i10;
                } else {
                    i13 = i10;
                    if (i21 != i13) {
                        f26 = 0.92f;
                    }
                }
                float f27 = i21 == 0 ? 0.4f : i21 == i13 ? 0.24f : 0.1f;
                int rgb = Color.rgb(Math.round(Color.red(z5Var3.g0) * f26), Math.round(Color.green(z5Var3.g0) * f26), Math.round(Color.blue(z5Var3.g0) * f26));
                int f28 = i0.a.f(0.45f, z5Var3.g0, z5Var3.h0);
                int f29 = i0.a.f(f27, z5Var3.h0, -1);
                float f30 = cos3 * abs;
                float f31 = sin2 * abs;
                int[] iArr = {rgb, rgb, f28, f29, f29};
                int i22 = i7;
                float[] fArr4 = new float[i22];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 0.32f;
                fArr4[2] = 0.53f;
                fArr4[3] = 0.76f;
                fArr4[4] = 1.0f;
                paint4.setShader(new LinearGradient(f10 - f30, f11 - f31, f30 + f10, f31 + f11, iArr, fArr4, Shader.TileMode.CLAMP));
                if (i21 == 0) {
                    f12 = 0.3f;
                    i14 = 1;
                } else {
                    i14 = 1;
                    f12 = i21 == 1 ? 0.88f : 1.47f;
                }
                paint4.setStrokeWidth(i21 == 0 ? 0.6f : i21 == i14 ? 1.0f : 0.43f);
                rectF3.set(f12, f12, 336.0f - f12, 205.0f - f12);
                float f32 = 25.2f - f12;
                canvas.drawRoundRect(rectF3, f32, f32, paint4);
                i21++;
                i7 = i22;
                i10 = i14;
            }
            float c10 = z5.c(((float) Math.sin(Math.toRadians(z5Var3.T))) * 1.7f);
            float c11 = z5.c((-((float) Math.sin(Math.toRadians(z5Var3.T)))) * 1.7f);
            int f33 = i0.a.f(0.38f, z5Var3.h0, -1);
            paint4.setShader(new LinearGradient(0.0f, 102.5f, 336.0f, 102.5f, new int[]{z5.a(c11 * 0.8f, f33), z5.a(c11 * 0.38f, f33), z5.a(0.0f, f33), z5.a(0.0f, f33), z5.a(0.38f * c10, f33), z5.a(c10 * 0.8f, f33)}, new float[]{0.0f, 0.15f, 0.34f, 0.66f, 0.85f, 1.0f}, Shader.TileMode.CLAMP));
            paint4.setStrokeWidth(1.05f);
            rectF3.set(0.95f, 0.95f, 335.05f, 204.05f);
            canvas.drawRoundRect(rectF3, 24.25f, 24.25f, paint4);
            paint4.setShader(null);
        }
        canvas.restoreToCount(save);
    }
}
