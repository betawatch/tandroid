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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n7 extends View {
    public final /* synthetic */ t7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(t7 t7Var, Context context) {
        super(context);
        this.a = t7Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float max;
        RectF rectF;
        int i11;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        Canvas canvas2;
        Paint paint;
        int i12;
        t7 t7Var;
        Path path;
        x5 x5Var;
        float f14;
        t7 t7Var2 = this.a;
        RectF rectF7 = t7Var2.D1;
        Path path2 = t7Var2.I;
        x5 x5Var2 = t7Var2.c;
        Matrix matrix = t7Var2.W;
        Paint paint2 = t7Var2.F;
        RectF rectF8 = t7Var2.H;
        Paint paint3 = t7Var2.x;
        Path path3 = t7Var2.T;
        if (t7Var2.Y0 <= 0.0f) {
            return;
        }
        paint3.setShader(null);
        paint3.setColorFilter(null);
        ArrayList arrayList = t7Var2.S;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            int i14 = i13 + 1;
            q7 q7Var = (q7) obj;
            float f15 = q7Var.h / q7Var.f;
            if (f15 < 0.1f) {
                f14 = f15 / 0.1f;
            } else {
                float f16 = 1.0f - ((f15 - 0.1f) / 0.9f);
                f14 = f16 * f16;
            }
            ArrayList arrayList2 = arrayList;
            float A = com.google.android.gms.internal.play_billing.k3.A(f14, 0.4f, 0.6f, q7Var.e);
            paint3.setColor(-1);
            paint3.setAlpha((int) (Utilities.clamp01(f14) * 130.0f));
            canvas.save();
            canvas.translate(q7Var.a, q7Var.b);
            canvas.rotate(q7Var.g);
            path3.rewind();
            float f17 = -A;
            float f18 = f17 * 2.0f;
            path3.moveTo(0.0f, f18);
            float f19 = A * 0.35f;
            float f20 = f17 * 0.35f;
            path3.lineTo(f19, f20);
            float f21 = A * 2.0f;
            path3.lineTo(f21, 0.0f);
            path3.lineTo(f19, f19);
            path3.lineTo(0.0f, f21);
            path3.lineTo(f20, f19);
            path3.lineTo(f18, 0.0f);
            path3.lineTo(f20, f20);
            path3.close();
            canvas.drawPath(path3, paint3);
            canvas.restore();
            i13 = i14;
            arrayList = arrayList2;
        }
        float f22 = 1.0f;
        paint3.setAlpha(255);
        ArrayList arrayList3 = t7Var2.n;
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList3.get(i15);
            i15++;
            p7 p7Var = (p7) obj2;
            float clamp01 = f22 - Utilities.clamp01(p7Var.c / 0.42f);
            float x10 = org.telegram.ui.Cells.b1.x(clamp01, clamp01, clamp01, f22);
            paint2.setColor(-1);
            paint2.setAlpha((int) (clamp01 * 90.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.4f) * clamp01);
            canvas.drawCircle(p7Var.a, p7Var.b, com.google.android.gms.internal.play_billing.k3.A(x10, 0.43f, 0.42f, t7Var2.U()), paint2);
            arrayList3 = arrayList3;
            size2 = size2;
            f22 = 1.0f;
        }
        Paint paint4 = t7Var2.s1;
        Path path4 = t7Var2.u1;
        Paint paint5 = t7Var2.r1;
        float clamp012 = Utilities.clamp01(t7Var2.q1.a);
        if (clamp012 < 0.01f || !t7Var2.C()) {
            i10 = 1;
        } else {
            paint4.setAlpha((int) (22.0f * clamp012));
            canvas.drawPath(path4, paint4);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(4.5f);
            float f23 = dp + dp2;
            i10 = 1;
            paint5.setPathEffect(new DashPathEffect(new float[]{dp, dp2}, f23 - ((t7Var2.n1 * AndroidUtilities.dp(18.0f)) % f23)));
            paint5.setStrokeWidth(AndroidUtilities.dp(3.2f));
            paint5.setColor(Color.argb((int) (40.0f * clamp012), 0, 18, 48));
            canvas.drawPath(path4, paint5);
            paint5.setStrokeWidth(AndroidUtilities.dp(1.8f));
            paint5.setColor(Color.argb((int) (clamp012 * 180.0f), 255, 255, 255));
            canvas.drawPath(path4, paint5);
        }
        float w9 = com.google.android.gms.internal.play_billing.k3.w(t7Var2.a0, 0.6f, t7Var2.b0, 10.0f);
        matrix.setScale(t7Var2.Y0 * 1.5f, 1.0f);
        matrix.postRotate(-24.0f);
        float f24 = t7Var2.Y0;
        matrix.postTranslate(com.google.android.gms.internal.play_billing.k3.t(w9, f24, 0.45f, (-f24) * 0.25f), 0.0f);
        t7Var2.V.setLocalMatrix(matrix);
        ArrayList<RectF> stickerObstacles = x5Var2.getStickerObstacles();
        RectF rectF9 = stickerObstacles.get(0);
        RectF rectF10 = stickerObstacles.get(i10);
        RectF rectF11 = stickerObstacles.get(2);
        RectF rectF12 = stickerObstacles.get(3);
        RectF rectF13 = stickerObstacles.get(4);
        RectF rectF14 = stickerObstacles.get(5);
        ArrayList G = t7Var2.G();
        Path path5 = path2;
        int size3 = G.size();
        int i16 = 0;
        Paint paint6 = paint3;
        x5 x5Var3 = x5Var2;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        while (i16 < size3) {
            int i17 = i16 + 1;
            s7 s7Var = (s7) G.get(i16);
            int i18 = s7Var.H;
            int i19 = size3;
            r7 r7Var = s7Var.i;
            ArrayList arrayList4 = G;
            r7 r7Var2 = s7Var.f;
            r7 r7Var3 = s7Var.e;
            RectF rectF15 = rectF11;
            r7 r7Var4 = s7Var.j;
            float f29 = f27;
            r7 r7Var5 = s7Var.k;
            RectF rectF16 = rectF14;
            r7 r7Var6 = s7Var.p;
            float f30 = f25;
            if (i18 != 2 && (i18 != 1 || (s7Var.O && r7Var4.a > 0.3f))) {
                rectF4 = rectF9;
                rectF2 = rectF10;
                rectF6 = rectF12;
                rectF5 = rectF13;
                max = f26;
                rectF = rectF7;
                path = path5;
                x5Var = x5Var3;
                paint = paint6;
                rectF3 = rectF16;
                t7Var = t7Var2;
                path5 = path;
                t7Var2 = t7Var;
                paint6 = paint;
                x5Var3 = x5Var;
                rectF7 = rectF;
                rectF9 = rectF4;
                rectF12 = rectF6;
                rectF13 = rectF5;
                f26 = max;
                i16 = i17;
                size3 = i19;
                G = arrayList4;
                rectF11 = rectF15;
                f27 = f29;
                f25 = f30;
                rectF10 = rectF2;
                rectF14 = rectF3;
            }
            Bitmap a2 = s7Var.a();
            float f31 = s7Var.l.a;
            float clamp013 = Utilities.clamp01(s7Var.r.a);
            RectF rectF17 = rectF10;
            float f32 = f26;
            float A2 = com.google.android.gms.internal.play_billing.k3.A(clamp013, 0.2f, 0.8f, (((1.0f - (s7Var.q.a * 0.9f)) * 0.04f * f31) + 1.0f) * t7Var2.U() * s7Var.g.a * s7Var.h.a);
            if (a2 == null || A2 < 1.0f) {
                f27 = f29;
                path5 = path5;
                f28 = f28;
                paint6 = paint6;
                x5Var3 = x5Var3;
                rectF7 = rectF7;
                rectF9 = rectF9;
                rectF12 = rectF12;
                i16 = i17;
                size3 = i19;
                rectF11 = rectF15;
                rectF10 = rectF17;
                rectF14 = rectF16;
                f26 = f32;
                f25 = f30;
                t7Var2 = t7Var2;
                rectF13 = rectF13;
                G = arrayList4;
            } else {
                float max2 = Math.max(r7Var4.a, 0.7f * f31);
                float dp3 = (AndroidUtilities.dp(9.0f) * max2) + AndroidUtilities.dp(1.5f);
                float sin = ((float) Math.sin(Math.toRadians(t7Var2.b0))) * dp3 * 2.2f;
                float sin2 = ((float) Math.sin(Math.toRadians(t7Var2.a0))) * dp3 * 2.2f;
                t7 t7Var3 = t7Var2;
                float f33 = r7Var3.a + s7Var.n.a + sin;
                float dp4 = ((r7Var2.a + s7Var.o.a) + sin2) - (AndroidUtilities.dp(4.0f) * max2);
                float f34 = r7Var3.a - (sin * 0.3f);
                float f35 = (dp3 * 0.22f) + (r7Var2.a - (sin2 * 0.3f));
                float clamp014 = Utilities.clamp01((f31 * 1.5f) + (3.0f * max2) + r7Var6.a + r7Var5.a);
                rectF7.set(Math.min(f33, f34) - A2, Math.min(dp4, f35) - A2, Math.max(f33, f34) + A2, Math.max(dp4, f35) + A2);
                boolean intersects = RectF.intersects(rectF7, rectF12);
                float f36 = A2 * 0.4f;
                rectF8.set(f33 - f36, dp4 - f36, f33 + f36, dp4 + f36);
                max = Math.max(f32, Math.max(t7.n(rectF8, rectF9), t7.n(rectF8, rectF13)) * clamp013);
                f30 = Math.max(f30, t7.n(rectF8, rectF17) * clamp013);
                f29 = Math.max(f29, t7.n(rectF8, rectF16) * clamp013);
                float n10 = t7.n(rectF8, rectF15) * clamp013;
                RectF rectF18 = rectF12;
                f28 = Math.max(f28, n10);
                if (intersects) {
                    rectF = rectF7;
                    i11 = canvas.saveLayer(rectF7, null);
                } else {
                    rectF = rectF7;
                    i11 = -1;
                }
                canvas.save();
                canvas.rotate(r7Var.a, f34, f35);
                rectF2 = rectF17;
                rectF3 = rectF16;
                rectF4 = rectF9;
                rectF5 = rectF13;
                rectF6 = rectF18;
                rectF15 = rectF15;
                t7Var3.t(canvas, s7Var, f34, f35, com.google.android.gms.internal.play_billing.k3.A(r7Var6.a, 0.07f, (0.08f * max2) + 0.97f, A2), Math.max(max2, r7Var5.a * 0.5f), r7Var6.a, clamp014 * clamp013);
                canvas.restore();
                float f37 = f33 - A2;
                float f38 = dp4 - A2;
                float f39 = f33 + A2;
                float f40 = dp4 + A2;
                int saveLayer = canvas.saveLayer(f37, f38, f39, f40, null);
                Paint paint7 = paint6;
                paint7.setAlpha((int) (clamp013 * 255.0f));
                float f41 = r7Var5.a;
                if (f41 > 0.004f) {
                    t7Var3.r(canvas, a2, f33, dp4, A2, f41, 1.0f, r7Var.a, s7Var.U, s7Var.V);
                    t7Var = t7Var3;
                    canvas2 = canvas;
                    i12 = saveLayer;
                    paint = paint7;
                } else {
                    canvas2 = canvas;
                    paint = paint7;
                    i12 = saveLayer;
                    t7Var = t7Var3;
                    canvas2.save();
                    canvas2.rotate(r7Var.a, f33, dp4);
                    float f42 = A2 / 2.0f;
                    rectF8.set(f33 - f42, dp4 - f42, f33 + f42, dp4 + f42);
                    canvas2.drawBitmap(a2, (Rect) null, rectF8, paint);
                    canvas2.restore();
                }
                paint.setAlpha(255);
                canvas2.drawRect(f37, f38, f39, f40, t7Var.U);
                canvas2.restoreToCount(i12);
                if (intersects) {
                    if (intersects) {
                        path = path5;
                        x5Var = x5Var3;
                        x5Var.h(path, t7Var.Y0, t7Var.Z0);
                        canvas2.drawPath(path, t7Var.E1);
                    } else {
                        path = path5;
                        x5Var = x5Var3;
                    }
                    canvas2.restoreToCount(i11);
                } else {
                    path = path5;
                    x5Var = x5Var3;
                }
                path5 = path;
                t7Var2 = t7Var;
                paint6 = paint;
                x5Var3 = x5Var;
                rectF7 = rectF;
                rectF9 = rectF4;
                rectF12 = rectF6;
                rectF13 = rectF5;
                f26 = max;
                i16 = i17;
                size3 = i19;
                G = arrayList4;
                rectF11 = rectF15;
                f27 = f29;
                f25 = f30;
                rectF10 = rectF2;
                rectF14 = rectF3;
            }
        }
        t7 t7Var4 = t7Var2;
        float f43 = f25;
        float f44 = f26;
        float f45 = f27;
        x5 x5Var4 = x5Var3;
        float f46 = f28;
        Paint paint8 = t7Var4.k0;
        Paint paint9 = t7Var4.l0;
        Paint paint10 = t7Var4.j0;
        s7 s7Var2 = t7Var4.h0;
        if (s7Var2 == null || s7Var2.H != 2) {
            f7 = f44;
            f10 = f43;
            f11 = f45;
            f12 = f46;
        } else {
            float f47 = s7Var2.n.a + s7Var2.e.a;
            float f48 = s7Var2.o.a + s7Var2.f.a;
            float P = (t7Var4.P(s7Var2) * 0.5f) + AndroidUtilities.dp(9.0f);
            paint10.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint10.setStyle(style);
            paint10.setStrokeCap(Paint.Cap.ROUND);
            paint10.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (paint10.getPathEffect() == null) {
                f13 = f44;
                paint10.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
            } else {
                f13 = f44;
            }
            paint10.setShadowLayer(AndroidUtilities.dp(0.75f), 0.0f, 0.0f, 1342177280);
            paint9.setColor(-1);
            paint9.setStyle(style);
            paint9.setStrokeWidth(AndroidUtilities.dp(2.66f));
            paint9.setShadowLayer(AndroidUtilities.dp(0.75f), 0.0f, 0.0f, 1342177280);
            paint8.setColor(-15033089);
            canvas.save();
            canvas.rotate(s7Var2.i.a, f47, f48);
            float f49 = f47 - P;
            float f50 = f48 - P;
            f10 = f43;
            float f51 = f47 + P;
            float f52 = f48 + P;
            f12 = f46;
            f11 = f45;
            f7 = f13;
            canvas.drawArc(f49, f50, f51, f52, 0.0f, 180.0f, false, paint10);
            canvas.drawArc(f49, f50, f51, f52, 180.0f, 180.0f, false, paint10);
            for (int i20 = -1; i20 <= 1; i20 += 2) {
                float f53 = (i20 * P) + f47;
                canvas.drawCircle(f53, f48, AndroidUtilities.dp(5.66f), paint9);
                canvas.drawCircle(f53, f48, AndroidUtilities.dp(4.66f), paint8);
            }
            canvas.restore();
        }
        v5 v5Var = x5Var4.N;
        float round = Math.round(f12 * 20.0f) / 20.0f;
        if (round != x5Var4.J) {
            x5Var4.J = round;
            x5Var4.H.invalidate();
        }
        float f54 = Math.max(f11, f7) > 0.0f ? 1.0f : 0.0f;
        if (f54 != x5Var4.h) {
            x5Var4.h = f54;
            v5Var.invalidate();
        }
        float round2 = Math.round(f7 * 20.0f) / 20.0f;
        float round3 = Math.round(f10 * 20.0f) / 20.0f;
        if (round2 != x5Var4.d0) {
            x5Var4.d0 = round2;
            v5Var.invalidate();
            x5Var4.O.invalidate();
        }
        if (round3 != x5Var4.e0) {
            x5Var4.e0 = round3;
            x5Var4.G.invalidate();
        }
    }
}
