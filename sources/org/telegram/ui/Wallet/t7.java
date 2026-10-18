package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class t7 extends View {
    public final /* synthetic */ z7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(z7 z7Var, Context context) {
        super(context);
        this.a = z7Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        float max;
        RectF rectF2;
        int i11;
        RectF rectF3;
        RectF rectF4;
        Canvas canvas2;
        int i12;
        RectF rectF5;
        x7 x7Var;
        z7 z7Var;
        float f7;
        float f10;
        Paint paint;
        RectF rectF6;
        Path path;
        x5 x5Var;
        x5 x5Var2;
        Paint paint2;
        float f11;
        z7 z7Var2 = this.a;
        RectF rectF7 = z7Var2.y1;
        Path path2 = z7Var2.I;
        x5 x5Var3 = z7Var2.c;
        Matrix matrix = z7Var2.W;
        Paint paint3 = z7Var2.F;
        RectF rectF8 = z7Var2.H;
        Paint paint4 = z7Var2.x;
        Path path3 = z7Var2.T;
        if (z7Var2.T0 <= 0.0f) {
            return;
        }
        paint4.setShader(null);
        paint4.setColorFilter(null);
        ArrayList arrayList = z7Var2.S;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            int i14 = i13 + 1;
            w7 w7Var = (w7) obj;
            float f12 = w7Var.h / w7Var.f;
            if (f12 < 0.1f) {
                f11 = f12 / 0.1f;
            } else {
                float f13 = 1.0f - ((f12 - 0.1f) / 0.9f);
                f11 = f13 * f13;
            }
            float A = com.google.android.gms.internal.play_billing.k3.A(f11, 0.4f, 0.6f, w7Var.e);
            paint4.setColor(-1);
            paint4.setAlpha((int) (Utilities.clamp01(f11) * 130.0f));
            canvas.save();
            canvas.translate(w7Var.a, w7Var.b);
            canvas.rotate(w7Var.g);
            path3.rewind();
            float f14 = -A;
            float f15 = f14 * 2.0f;
            path3.moveTo(0.0f, f15);
            float f16 = A * 0.35f;
            float f17 = f14 * 0.35f;
            path3.lineTo(f16, f17);
            float f18 = A * 2.0f;
            path3.lineTo(f18, 0.0f);
            path3.lineTo(f16, f16);
            path3.lineTo(0.0f, f18);
            path3.lineTo(f17, f16);
            path3.lineTo(f15, 0.0f);
            path3.lineTo(f17, f17);
            path3.close();
            canvas.drawPath(path3, paint4);
            canvas.restore();
            i13 = i14;
            arrayList = arrayList;
        }
        float f19 = 1.0f;
        paint4.setAlpha(255);
        ArrayList arrayList2 = z7Var2.n;
        int size2 = arrayList2.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList2.get(i15);
            i15++;
            v7 v7Var = (v7) obj2;
            float clamp01 = f19 - Utilities.clamp01(v7Var.c / 0.42f);
            float z10 = org.telegram.ui.Cells.c1.z(clamp01, clamp01, clamp01, f19);
            paint3.setColor(-1);
            paint3.setAlpha((int) (clamp01 * 90.0f));
            paint3.setStrokeWidth(AndroidUtilities.dp(2.4f) * clamp01);
            canvas.drawCircle(v7Var.a, v7Var.b, com.google.android.gms.internal.play_billing.k3.A(z10, 0.43f, 0.42f, z7Var2.W()), paint3);
            arrayList2 = arrayList2;
            size2 = size2;
            f19 = 1.0f;
        }
        Paint paint5 = z7Var2.n1;
        Path path4 = z7Var2.p1;
        Paint paint6 = z7Var2.m1;
        float clamp012 = Utilities.clamp01(z7Var2.l1.a);
        if (clamp012 < 0.01f || !z7Var2.E()) {
            i10 = 1;
        } else {
            paint5.setAlpha((int) (22.0f * clamp012));
            canvas.drawPath(path4, paint5);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(4.5f);
            float f20 = dp + dp2;
            i10 = 1;
            paint6.setPathEffect(new DashPathEffect(new float[]{dp, dp2}, f20 - ((z7Var2.i1 * AndroidUtilities.dp(18.0f)) % f20)));
            paint6.setStrokeWidth(AndroidUtilities.dp(3.2f));
            paint6.setColor(Color.argb((int) (40.0f * clamp012), 0, 18, 48));
            canvas.drawPath(path4, paint6);
            paint6.setStrokeWidth(AndroidUtilities.dp(1.8f));
            paint6.setColor(Color.argb((int) (clamp012 * 180.0f), 255, 255, 255));
            canvas.drawPath(path4, paint6);
        }
        float w9 = com.google.android.gms.internal.play_billing.k3.w(z7Var2.a0, 0.6f, z7Var2.b0, 10.0f);
        matrix.setScale(z7Var2.T0 * 1.5f, 1.0f);
        matrix.postRotate(-24.0f);
        float f21 = z7Var2.T0;
        matrix.postTranslate(com.google.android.gms.internal.play_billing.k3.t(w9, f21, 0.45f, (-f21) * 0.25f), 0.0f);
        z7Var2.V.setLocalMatrix(matrix);
        ArrayList<RectF> stickerObstacles = x5Var3.getStickerObstacles();
        RectF rectF9 = stickerObstacles.get(0);
        RectF rectF10 = stickerObstacles.get(i10);
        RectF rectF11 = stickerObstacles.get(2);
        RectF rectF12 = stickerObstacles.get(3);
        RectF rectF13 = stickerObstacles.get(4);
        RectF rectF14 = stickerObstacles.get(5);
        ArrayList K = z7Var2.K();
        Paint paint7 = paint3;
        int size3 = K.size();
        int i16 = 0;
        Paint paint8 = paint4;
        Path path5 = path2;
        x5 x5Var4 = x5Var3;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        while (i16 < size3) {
            int i17 = i16 + 1;
            y7 y7Var = (y7) K.get(i16);
            ArrayList arrayList3 = K;
            int i18 = y7Var.H;
            int i19 = size3;
            x7 x7Var2 = y7Var.i;
            x7 x7Var3 = y7Var.f;
            float f26 = f23;
            x7 x7Var4 = y7Var.e;
            RectF rectF15 = rectF11;
            x7 x7Var5 = y7Var.l;
            float f27 = f25;
            x7 x7Var6 = y7Var.j;
            RectF rectF16 = rectF14;
            x7 x7Var7 = y7Var.k;
            float f28 = f24;
            x7 x7Var8 = y7Var.p;
            RectF rectF17 = rectF10;
            if (i18 != 2 && (i18 != 1 || (y7Var.O && x7Var6.a > 0.3f))) {
                rectF3 = rectF9;
                rectF = rectF13;
                rectF4 = rectF12;
                max = f22;
                rectF5 = rectF8;
                rectF2 = rectF7;
                paint2 = paint7;
                path = path5;
                x5Var2 = x5Var4;
                paint = paint8;
                rectF6 = rectF16;
                z7Var = z7Var2;
                f25 = f27;
                rectF8 = rectF5;
                paint7 = paint2;
                x5Var4 = x5Var2;
                z7Var2 = z7Var;
                path5 = path;
                paint8 = paint;
                rectF7 = rectF2;
                rectF12 = rectF4;
                rectF9 = rectF3;
                rectF14 = rectF6;
                K = arrayList3;
                i16 = i17;
                size3 = i19;
                f23 = f26;
                rectF11 = rectF15;
                f24 = f28;
                f22 = max;
                rectF10 = rectF17;
                rectF13 = rectF;
            }
            Bitmap a2 = y7Var.a();
            float f29 = x7Var5.a;
            float clamp013 = Utilities.clamp01(y7Var.r.a);
            float f30 = 0.7f * f29;
            float f31 = f22;
            rectF = rectF13;
            float A2 = com.google.android.gms.internal.play_billing.k3.A(clamp013, 0.2f, 0.8f, (((1.0f - (y7Var.q.a * 0.9f)) * f30) + 1.0f) * z7Var2.W() * y7Var.g.a * y7Var.h.a);
            if (a2 == null || A2 < 1.0f) {
                rectF8 = rectF8;
                f25 = f27;
                paint7 = paint7;
                x5Var4 = x5Var4;
                paint8 = paint8;
                rectF7 = rectF7;
                rectF12 = rectF12;
                rectF9 = rectF9;
                rectF14 = rectF16;
                K = arrayList3;
                i16 = i17;
                size3 = i19;
                rectF11 = rectF15;
                rectF13 = rectF;
                f24 = f28;
                f23 = f26;
                z7Var2 = z7Var2;
                f22 = f31;
                rectF10 = rectF17;
            } else {
                float max2 = Math.max(x7Var6.a, f30);
                float dp3 = (AndroidUtilities.dp(9.0f) * max2) + AndroidUtilities.dp(1.5f);
                float sin = ((float) Math.sin(Math.toRadians(z7Var2.b0))) * dp3 * 2.2f;
                float sin2 = ((float) Math.sin(Math.toRadians(z7Var2.a0))) * dp3 * 2.2f;
                z7 z7Var3 = z7Var2;
                float f32 = x7Var4.a + y7Var.n.a + sin;
                float dp4 = ((x7Var3.a + y7Var.o.a) + sin2) - (AndroidUtilities.dp(4.0f) * max2);
                float f33 = x7Var4.a - (sin * 0.3f);
                float f34 = (dp3 * 0.22f) + (x7Var3.a - (sin2 * 0.3f));
                float clamp014 = Utilities.clamp01((f29 * 1.5f) + (3.0f * max2) + x7Var8.a + x7Var7.a);
                rectF7.set(Math.min(f32, f33) - A2, Math.min(dp4, f34) - A2, Math.max(f32, f33) + A2, Math.max(dp4, f34) + A2);
                boolean intersects = RectF.intersects(rectF7, rectF12);
                float f35 = A2 * 0.4f;
                rectF8.set(f32 - f35, dp4 - f35, f32 + f35, dp4 + f35);
                max = Math.max(f31, Math.max(z7.n(rectF8, rectF9), z7.n(rectF8, rectF)) * clamp013);
                f28 = Math.max(f28, z7.n(rectF8, rectF17) * clamp013);
                f27 = Math.max(f27, z7.n(rectF8, rectF16) * clamp013);
                f26 = Math.max(f26, z7.n(rectF8, rectF15) * clamp013);
                if (intersects) {
                    rectF2 = rectF7;
                    i11 = canvas.saveLayer(rectF7, null);
                } else {
                    rectF2 = rectF7;
                    i11 = -1;
                }
                canvas.save();
                canvas.rotate(x7Var2.a, f33, f34);
                rectF15 = rectF15;
                rectF3 = rectF9;
                rectF4 = rectF12;
                z7Var3.t(canvas, y7Var, f33, f34, com.google.android.gms.internal.play_billing.k3.A(x7Var8.a, 0.07f, (0.08f * max2) + 0.97f, A2), Math.max(max2, x7Var7.a * 0.5f), x7Var8.a, clamp014 * clamp013);
                canvas.restore();
                float f36 = f32 - A2;
                float f37 = dp4 - A2;
                float f38 = f32 + A2;
                float f39 = dp4 + A2;
                int saveLayer = canvas.saveLayer(f36, f37, f38, f39, null);
                Paint paint9 = paint8;
                paint9.setAlpha((int) (clamp013 * 255.0f));
                float f40 = x7Var7.a;
                if (f40 > 0.004f) {
                    rectF6 = rectF16;
                    rectF5 = rectF8;
                    i12 = saveLayer;
                    x7Var = x7Var5;
                    paint = paint9;
                    z7Var3.r(canvas, a2, f32, dp4, A2, f40, 1.0f, x7Var2.a, y7Var.U, y7Var.V);
                    z7Var = z7Var3;
                    canvas2 = canvas;
                    f7 = f32;
                    f10 = dp4;
                } else {
                    canvas2 = canvas;
                    i12 = saveLayer;
                    rectF5 = rectF8;
                    x7Var = x7Var5;
                    z7Var = z7Var3;
                    f7 = f32;
                    f10 = dp4;
                    paint = paint9;
                    rectF6 = rectF16;
                    canvas2.save();
                    canvas2.rotate(x7Var2.a, f7, f10);
                    float f41 = A2 / 2.0f;
                    rectF5.set(f7 - f41, f10 - f41, f7 + f41, f41 + f10);
                    canvas2.drawBitmap(a2, (Rect) null, rectF5, paint);
                    canvas2.restore();
                }
                paint.setAlpha(255);
                canvas2.drawRect(f36, f37, f38, f39, z7Var.U);
                canvas2.restoreToCount(i12);
                if (intersects) {
                    if (intersects) {
                        path = path5;
                        x5Var = x5Var4;
                        x5Var.j(path, z7Var.T0, z7Var.U0);
                        canvas2.drawPath(path, z7Var.z1);
                    } else {
                        path = path5;
                        x5Var = x5Var4;
                    }
                    canvas2.restoreToCount(i11);
                } else {
                    path = path5;
                    x5Var = x5Var4;
                }
                if (f29 > 0.02f) {
                    float f42 = A2 * 0.6f;
                    paint2 = paint7;
                    char c10 = 65535;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (Utilities.clamp01(x7Var.a) * 110.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
                    canvas2.drawCircle(f7, f10, f42, paint2);
                    canvas2.save();
                    canvas2.rotate(x7Var2.a, f7, f10);
                    int i20 = 0;
                    while (i20 < 24) {
                        float f43 = f10 - f42;
                        char c11 = c10;
                        float f44 = f7;
                        canvas2.drawLine(f44, f43, f7, AndroidUtilities.dp(i20 == 0 ? 7.0f : i20 % 6 == 0 ? 4.5f : 2.5f) + f43, paint2);
                        Canvas canvas3 = canvas2;
                        canvas3.rotate(15.0f, f44, f10);
                        i20++;
                        canvas2 = canvas3;
                        x5Var = x5Var;
                        f7 = f44;
                        c10 = c11;
                    }
                    x5Var2 = x5Var;
                    canvas2.restore();
                } else {
                    x5Var2 = x5Var;
                    paint2 = paint7;
                }
                f25 = f27;
                rectF8 = rectF5;
                paint7 = paint2;
                x5Var4 = x5Var2;
                z7Var2 = z7Var;
                path5 = path;
                paint8 = paint;
                rectF7 = rectF2;
                rectF12 = rectF4;
                rectF9 = rectF3;
                rectF14 = rectF6;
                K = arrayList3;
                i16 = i17;
                size3 = i19;
                f23 = f26;
                rectF11 = rectF15;
                f24 = f28;
                f22 = max;
                rectF10 = rectF17;
                rectF13 = rectF;
            }
        }
        float f45 = f22;
        float f46 = f23;
        float f47 = f24;
        float f48 = f25;
        x5 x5Var5 = x5Var4;
        v5 v5Var = x5Var5.R;
        float round = Math.round(f46 * 20.0f) / 20.0f;
        if (round != x5Var5.N) {
            x5Var5.N = round;
            x5Var5.L.invalidate();
        }
        float f49 = Math.max(f48, f45) > 0.0f ? 1.0f : 0.0f;
        if (f49 != x5Var5.n) {
            x5Var5.n = f49;
            v5Var.invalidate();
        }
        float round2 = Math.round(f45 * 20.0f) / 20.0f;
        float round3 = Math.round(f47 * 20.0f) / 20.0f;
        if (round2 != x5Var5.h0) {
            x5Var5.h0 = round2;
            v5Var.invalidate();
            x5Var5.S.invalidate();
        }
        if (round3 != x5Var5.i0) {
            x5Var5.i0 = round3;
            x5Var5.K.invalidate();
        }
    }
}
