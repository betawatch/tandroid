// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class loc extends View {
    public boolean a;
    public final /* synthetic */ moc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loc(moc mocVar, Context context) {
        super(context);
        this.b = mocVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if ((r8 - r14) <= 328.0f) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        boolean z;
        int i7;
        Path path;
        Paint paint;
        ioc iocVar;
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        moc mocVar = this.b;
        ioc iocVar2 = mocVar.b;
        if (iocVar2 != null) {
            boolean z2 = !mocVar.a && this.a;
            Path path2 = iocVar2.t;
            f = 168.0f;
            Paint paint2 = iocVar2.b;
            paint2.setShader(null);
            paint2.setColor(-1);
            f2 = 102.5f;
            float[][] fArr = iocVar2.L;
            i = 5;
            int length = fArr.length;
            int i8 = 0;
            while (i8 < length) {
                float[] fArr2 = fArr[i8];
                if (!iocVar2.M.contains(fArr2[0], fArr2[1])) {
                    if (z2) {
                        float f4 = fArr2[0];
                        float f5 = fArr2[2];
                        if (f4 + f5 >= 298.0f) {
                        }
                    }
                    Path path3 = path2;
                    double atan2 = Math.atan2(fArr2[1] - 102.5f, fArr2[0] - 168.0f);
                    double cos = Math.cos(atan2 - iocVar2.U);
                    float l = ioc.l(0.25f, 0.85f, (float) Math.pow(Math.abs(cos), cos >= 0.0d ? 3.081664098613251d : 5.0d));
                    paint = paint2;
                    i7 = length;
                    iocVar = iocVar2;
                    paint.setAlpha(Math.round(ioc.i(0.16f, 0.96f, Math.max(0.0f, (fArr2[5] * iocVar2.Y) + (fArr2[4] * iocVar2.X) + (fArr2[3] * iocVar2.W)) * ((float) Math.pow(Math.max(0.0f, (fArr2[5] * iocVar2.b0) + (fArr2[4] * iocVar2.a0) + (fArr2[3] * iocVar2.Z)), 10.0d))) * (1.0f - ((1.0f - ioc.l(0.12f, 0.85f, (float) Math.pow(Math.pow(Math.sin(atan2 - iocVar2.V) / 0.64d, 2.0d) + 1.0d, -2.0d))) * (1.0f - l))) * 255.0f));
                    float f6 = fArr2[0];
                    float f7 = fArr2[1];
                    float f8 = fArr2[2];
                    float f9 = 0.15f * f8;
                    path3.rewind();
                    path = path3;
                    path.moveTo(f6 - f8, f7);
                    float f10 = f6 - f9;
                    float f11 = f7 - f9;
                    path.lineTo(f10, f11);
                    z = z2;
                    path.lineTo(f6, f7 - f8);
                    float f12 = f6 + f9;
                    path.lineTo(f12, f11);
                    path.lineTo(f6 + f8, f7);
                    float f13 = f9 + f7;
                    path.lineTo(f12, f13);
                    path.lineTo(f6, f7 + f8);
                    path.lineTo(f10, f13);
                    path.close();
                    canvas.drawPath(path, paint);
                    i8++;
                    z2 = z;
                    path2 = path;
                    iocVar2 = iocVar;
                    length = i7;
                    paint2 = paint;
                }
                z = z2;
                i7 = length;
                path = path2;
                paint = paint2;
                iocVar = iocVar2;
                i8++;
                z2 = z;
                path2 = path;
                iocVar2 = iocVar;
                length = i7;
                paint2 = paint;
            }
            i2 = 1;
            i3 = 3;
            i4 = 2;
            paint2.setAlpha(nm7.d4);
        } else {
            f = 168.0f;
            f2 = 102.5f;
            i = 5;
            i2 = 1;
            i3 = 3;
            i4 = 2;
        }
        ioc iocVar3 = mocVar.b;
        if (iocVar3 != null && !mocVar.a) {
            RectF rectF = iocVar3.g;
            Paint paint3 = iocVar3.d;
            int save2 = canvas.save();
            Path path4 = iocVar3.s;
            path4.rewind();
            RectF rectF2 = iocVar3.M;
            path4.addRoundRect(rectF2, 8.0f, 8.0f, Path.Direction.CW);
            canvas.clipPath(path4);
            Paint paint4 = iocVar3.b;
            paint4.setShader(iocVar3.c0);
            canvas.drawRect(rectF2, paint4);
            paint4.setShader(null);
            iocVar3.b(canvas, ioc.m0[4], rectF2, 55);
            iocVar3.b(canvas, ioc.m0[i], rectF2, 95);
            ComposeShader composeShader = iocVar3.e0;
            if (composeShader != null) {
                paint4.setShader(composeShader);
                paint4.setAlpha(95);
                canvas.drawRect(rectF2, paint4);
                paint4.setShader(null);
                paint4.setAlpha(nm7.d4);
            }
            if (iocVar3.Q != null) {
                float l2 = (ioc.l(0.05f, 0.42f, -((float) Math.sin(Math.toRadians(iocVar3.S)))) * 0.65f) + 0.35f;
                paint4.setColorFilter(new PorterDuffColorFilter(-14405316, PorterDuff.Mode.SRC_IN));
                iocVar3.b(canvas, iocVar3.Q, rectF2, Math.round(((l2 * 0.495f) + 0.1f) * 255.0f));
                paint4.setColorFilter(null);
                float f14 = (float) (((((iocVar3.V / 6.283185307179586d) % 1.0d) + 1.0d) % 1.0d) * 8.0d);
                int i9 = (int) f14;
                float f15 = f14 - i9;
                int i10 = 0;
                int i11 = i4;
                while (i10 < i11) {
                    float f16 = i10 == 0 ? 1.0f - f15 : f15;
                    int i12 = (i9 + i10) % 8;
                    iocVar3.b(canvas, iocVar3.P[i12], rectF2, Math.round(204.0f * f16));
                    iocVar3.b(canvas, iocVar3.O[i12], rectF2, Math.round(f16 * 248.0f));
                    i10++;
                }
            }
            float cos2 = ((float) Math.cos(iocVar3.V - 0.7d)) * 24.0f;
            float sin = ((float) Math.sin(iocVar3.V - 0.7d)) * 18.0f;
            float[] fArr3 = new float[i3];
            // fill-array-data instruction
            fArr3[0] = 0.0f;
            fArr3[1] = 0.45f;
            fArr3[2] = 1.0f;
            paint3.setShader(new LinearGradient(rectF2.centerX() - cos2, rectF2.centerY() - sin, rectF2.centerX() + cos2, rectF2.centerY() + sin, new int[]{1812994342, 268435455, -1493172225}, fArr3, Shader.TileMode.CLAMP));
            paint3.setStrokeWidth(0.7f);
            rectF.set(rectF2);
            rectF.inset(0.35f, 0.35f);
            canvas.drawRoundRect(rectF, 7.65f, 7.65f, paint3);
            canvas.restoreToCount(save2);
        }
        ioc iocVar4 = mocVar.b;
        if (iocVar4 != null) {
            RectF rectF3 = iocVar4.g;
            Paint paint5 = iocVar4.d;
            double radians = Math.toRadians((iocVar4.T * 3.6d) - (iocVar4.S * 3.2d)) - 2.0420352248333655d;
            float cos3 = (float) Math.cos(radians);
            float sin2 = (float) Math.sin(radians);
            float abs = ((Math.abs(sin2) * 205.0f) + (Math.abs(cos3) * 336.0f)) * 0.5f;
            int i13 = 0;
            while (true) {
                float f17 = 0.8f;
                if (i13 >= 3) {
                    break;
                }
                if (i13 == 0) {
                    f17 = 0.66f;
                    i5 = i2;
                } else {
                    i5 = i2;
                    if (i13 != i5) {
                        f17 = 0.92f;
                    }
                }
                float f18 = i13 == 0 ? 0.4f : i13 == i5 ? 0.24f : 0.1f;
                int rgb = Color.rgb(Math.round(Color.red(iocVar4.g0) * f17), Math.round(Color.green(iocVar4.g0) * f17), Math.round(Color.blue(iocVar4.g0) * f17));
                int f19 = on2.f(0.45f, iocVar4.g0, iocVar4.h0);
                int f20 = on2.f(f18, iocVar4.h0, -1);
                float f21 = cos3 * abs;
                float f22 = sin2 * abs;
                int[] iArr = {rgb, rgb, f19, f20, f20};
                int i14 = i;
                float[] fArr4 = new float[i14];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 0.32f;
                fArr4[2] = 0.53f;
                fArr4[3] = 0.76f;
                fArr4[4] = 1.0f;
                paint5.setShader(new LinearGradient(f - f21, f2 - f22, f21 + f, f22 + f2, iArr, fArr4, Shader.TileMode.CLAMP));
                if (i13 == 0) {
                    f3 = 0.3f;
                    i6 = 1;
                } else {
                    i6 = 1;
                    f3 = i13 == 1 ? 0.88f : 1.47f;
                }
                paint5.setStrokeWidth(i13 == 0 ? 0.6f : i13 == i6 ? 1.0f : 0.43f);
                rectF3.set(f3, f3, 336.0f - f3, 205.0f - f3);
                float f23 = 25.2f - f3;
                canvas.drawRoundRect(rectF3, f23, f23, paint5);
                i13++;
                i = i14;
                i2 = i6;
            }
            float c = ioc.c(((float) Math.sin(Math.toRadians(iocVar4.T))) * 1.7f);
            float c2 = ioc.c((-((float) Math.sin(Math.toRadians(iocVar4.T)))) * 1.7f);
            int f24 = on2.f(0.38f, iocVar4.h0, -1);
            paint5.setShader(new LinearGradient(0.0f, 102.5f, 336.0f, 102.5f, new int[]{ioc.a(c2 * 0.8f, f24), ioc.a(c2 * 0.38f, f24), ioc.a(0.0f, f24), ioc.a(0.0f, f24), ioc.a(0.38f * c, f24), ioc.a(c * 0.8f, f24)}, new float[]{0.0f, 0.15f, 0.34f, 0.66f, 0.85f, 1.0f}, Shader.TileMode.CLAMP));
            paint5.setStrokeWidth(1.05f);
            rectF3.set(0.95f, 0.95f, 335.05f, 204.05f);
            canvas.drawRoundRect(rectF3, 24.25f, 24.25f, paint5);
            paint5.setShader(null);
        }
        canvas.restoreToCount(save);
    }
}
