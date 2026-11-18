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
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class r6 extends View {
    public boolean a;
    public final /* synthetic */ s6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, Context context) {
        super(context);
        this.b = s6Var;
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
        boolean z10;
        int i15;
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        s6 s6Var = this.b;
        p6 p6Var = s6Var.b;
        if (p6Var != null) {
            boolean z11 = !s6Var.a && this.a;
            f10 = 168.0f;
            Path path = p6Var.t;
            f11 = 102.5f;
            Paint paint = p6Var.b;
            paint.setShader(null);
            paint.setColor(-1);
            i7 = 5;
            float[][] fArr = p6Var.L;
            int length = fArr.length;
            int i16 = 0;
            i10 = 1;
            while (i16 < length) {
                float[] fArr2 = fArr[i16];
                if (!p6Var.M.contains(fArr2[0], fArr2[1])) {
                    if (z11) {
                        float f13 = fArr2[0];
                        float f14 = fArr2[2];
                        if (f13 + f14 >= 298.0f) {
                        }
                    }
                    z10 = z11;
                    double atan2 = Math.atan2(fArr2[1] - 102.5f, fArr2[0] - 168.0f);
                    double cos = Math.cos(atan2 - p6Var.U);
                    i15 = i16;
                    paint.setAlpha(Math.round(p6.i(0.16f, 0.96f, Math.max(0.0f, (fArr2[5] * p6Var.Y) + (fArr2[4] * p6Var.X) + (fArr2[3] * p6Var.W)) * ((float) Math.pow(Math.max(0.0f, (fArr2[5] * p6Var.b0) + (fArr2[4] * p6Var.a0) + (fArr2[3] * p6Var.Z)), 10.0d))) * (1.0f - ((1.0f - p6.l(0.12f, 0.85f, (float) Math.pow(Math.pow(Math.sin(atan2 - p6Var.V) / 0.64d, 2.0d) + 1.0d, -2.0d))) * (1.0f - p6.l(0.25f, 0.85f, (float) Math.pow(Math.abs(cos), cos >= 0.0d ? 3.081664098613251d : 5.0d))))) * 255.0f));
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
                    z11 = z10;
                }
                i15 = i16;
                z10 = z11;
                i16 = i15 + 1;
                z11 = z10;
            }
            i11 = 3;
            i12 = 2;
            paint.setAlpha(ks.e4);
        } else {
            f10 = 168.0f;
            f11 = 102.5f;
            i7 = 5;
            i10 = 1;
            i11 = 3;
            i12 = 2;
        }
        p6 p6Var2 = s6Var.b;
        if (p6Var2 != null && !s6Var.a) {
            RectF rectF = p6Var2.g;
            Paint paint2 = p6Var2.d;
            int save2 = canvas.save();
            Path path2 = p6Var2.s;
            path2.rewind();
            RectF rectF2 = p6Var2.M;
            path2.addRoundRect(rectF2, 8.0f, 8.0f, Path.Direction.CW);
            canvas.clipPath(path2);
            Paint paint3 = p6Var2.b;
            paint3.setShader(p6Var2.c0);
            canvas.drawRect(rectF2, paint3);
            paint3.setShader(null);
            p6Var2.b(canvas, p6.m0[4], rectF2, 55);
            p6Var2.b(canvas, p6.m0[i7], rectF2, 95);
            ComposeShader composeShader = p6Var2.e0;
            if (composeShader != null) {
                paint3.setShader(composeShader);
                paint3.setAlpha(95);
                canvas.drawRect(rectF2, paint3);
                paint3.setShader(null);
                paint3.setAlpha(ks.e4);
            }
            if (p6Var2.Q != null) {
                float l10 = (p6.l(0.05f, 0.42f, -((float) Math.sin(Math.toRadians(p6Var2.S)))) * 0.65f) + 0.35f;
                paint3.setColorFilter(new PorterDuffColorFilter(-14405316, PorterDuff.Mode.SRC_IN));
                p6Var2.b(canvas, p6Var2.Q, rectF2, Math.round(((l10 * 0.495f) + 0.1f) * 255.0f));
                paint3.setColorFilter(null);
                float f23 = (float) (((((p6Var2.V / 6.283185307179586d) % 1.0d) + 1.0d) % 1.0d) * 8.0d);
                int i17 = (int) f23;
                float f24 = f23 - i17;
                int i18 = 0;
                for (int i19 = i12; i18 < i19; i19 = 2) {
                    float f25 = i18 == 0 ? 1.0f - f24 : f24;
                    int i20 = (i17 + i18) % 8;
                    p6Var2.b(canvas, p6Var2.P[i20], rectF2, Math.round(204.0f * f25));
                    p6Var2.b(canvas, p6Var2.O[i20], rectF2, Math.round(f25 * 248.0f));
                    i18++;
                }
            }
            float cos2 = ((float) Math.cos(p6Var2.V - 0.7d)) * 24.0f;
            float sin = ((float) Math.sin(p6Var2.V - 0.7d)) * 18.0f;
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
        p6 p6Var3 = s6Var.b;
        if (p6Var3 != null) {
            RectF rectF3 = p6Var3.g;
            Paint paint4 = p6Var3.d;
            double radians = Math.toRadians((p6Var3.T * 3.6d) - (p6Var3.S * 3.2d)) - 2.0420352248333655d;
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
                int rgb = Color.rgb(Math.round(Color.red(p6Var3.g0) * f26), Math.round(Color.green(p6Var3.g0) * f26), Math.round(Color.blue(p6Var3.g0) * f26));
                int f28 = i0.a.f(0.45f, p6Var3.g0, p6Var3.h0);
                int f29 = i0.a.f(f27, p6Var3.h0, -1);
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
            float c10 = p6.c(((float) Math.sin(Math.toRadians(p6Var3.T))) * 1.7f);
            float c11 = p6.c((-((float) Math.sin(Math.toRadians(p6Var3.T)))) * 1.7f);
            int f33 = i0.a.f(0.38f, p6Var3.h0, -1);
            paint4.setShader(new LinearGradient(0.0f, 102.5f, 336.0f, 102.5f, new int[]{p6.a(c11 * 0.8f, f33), p6.a(c11 * 0.38f, f33), p6.a(0.0f, f33), p6.a(0.0f, f33), p6.a(0.38f * c10, f33), p6.a(c10 * 0.8f, f33)}, new float[]{0.0f, 0.15f, 0.34f, 0.66f, 0.85f, 1.0f}, Shader.TileMode.CLAMP));
            paint4.setStrokeWidth(1.05f);
            rectF3.set(0.95f, 0.95f, 335.05f, 204.05f);
            canvas.drawRoundRect(rectF3, 24.25f, 24.25f, paint4);
            paint4.setShader(null);
        }
        canvas.restoreToCount(save);
    }
}
