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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class v7 extends View {
    public final /* synthetic */ b8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(b8 b8Var, Context context) {
        super(context);
        this.a = b8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float max;
        RectF rectF;
        int i10;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        Canvas canvas2;
        Paint paint;
        int i11;
        b8 b8Var;
        Path path;
        g6 g6Var;
        float f15;
        b8 b8Var2 = this.a;
        RectF rectF7 = b8Var2.D1;
        Path path2 = b8Var2.I;
        g6 g6Var2 = b8Var2.c;
        Matrix matrix = b8Var2.W;
        Paint paint2 = b8Var2.F;
        RectF rectF8 = b8Var2.H;
        Paint paint3 = b8Var2.y;
        Path path3 = b8Var2.T;
        if (b8Var2.Y0 <= 0.0f) {
            return;
        }
        paint3.setShader(null);
        paint3.setColorFilter(null);
        ArrayList arrayList = b8Var2.S;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            y7 y7Var = (y7) obj;
            float f16 = y7Var.h / y7Var.f;
            if (f16 < 0.1f) {
                f15 = f16 / 0.1f;
            } else {
                float f17 = 1.0f - ((f16 - 0.1f) / 0.9f);
                f15 = f17 * f17;
            }
            ArrayList arrayList2 = arrayList;
            float B = com.google.android.recaptcha.internal.a.B(f15, 0.4f, 0.6f, y7Var.e);
            paint3.setColor(-1);
            paint3.setAlpha((int) (Utilities.l(f15) * 130.0f));
            canvas.save();
            canvas.translate(y7Var.a, y7Var.b);
            canvas.rotate(y7Var.g);
            path3.rewind();
            float f18 = -B;
            float f19 = f18 * 2.0f;
            path3.moveTo(0.0f, f19);
            float f20 = B * 0.35f;
            float f21 = f18 * 0.35f;
            path3.lineTo(f20, f21);
            float f22 = B * 2.0f;
            path3.lineTo(f22, 0.0f);
            path3.lineTo(f20, f20);
            path3.lineTo(0.0f, f22);
            path3.lineTo(f21, f20);
            path3.lineTo(f19, 0.0f);
            path3.lineTo(f21, f21);
            path3.close();
            canvas.drawPath(path3, paint3);
            canvas.restore();
            i12 = i13;
            arrayList = arrayList2;
        }
        float f23 = 1.0f;
        paint3.setAlpha(qs.e4);
        ArrayList arrayList3 = b8Var2.n;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            x7 x7Var = (x7) obj2;
            float l10 = f23 - Utilities.l(x7Var.c / 0.42f);
            float x10 = org.telegram.ui.Cells.f1.x(l10, l10, l10, f23);
            paint2.setColor(-1);
            paint2.setAlpha((int) (l10 * 90.0f));
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.4f) * l10);
            canvas.drawCircle(x7Var.a, x7Var.b, com.google.android.recaptcha.internal.a.B(x10, 0.43f, 0.42f, b8Var2.U()), paint2);
            arrayList3 = arrayList3;
            size2 = size2;
            f23 = 1.0f;
        }
        Paint paint4 = b8Var2.s1;
        Path path4 = b8Var2.u1;
        Paint paint5 = b8Var2.r1;
        float l11 = Utilities.l(b8Var2.q1.a);
        if (l11 < 0.01f || !b8Var2.C()) {
            i7 = 1;
        } else {
            paint4.setAlpha((int) (22.0f * l11));
            canvas.drawPath(path4, paint4);
            float L = org.telegram.messenger.g0.L(6.0f);
            float L2 = org.telegram.messenger.g0.L(4.5f);
            float f24 = L + L2;
            i7 = 1;
            paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f24 - ((b8Var2.n1 * org.telegram.messenger.g0.L(18.0f)) % f24)));
            paint5.setStrokeWidth(org.telegram.messenger.g0.L(3.2f));
            paint5.setColor(Color.argb((int) (40.0f * l11), 0, 18, 48));
            canvas.drawPath(path4, paint5);
            paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.8f));
            paint5.setColor(Color.argb((int) (l11 * 180.0f), qs.e4, qs.e4, qs.e4));
            canvas.drawPath(path4, paint5);
        }
        float y10 = com.google.android.recaptcha.internal.a.y(b8Var2.a0, 0.6f, b8Var2.b0, 10.0f);
        matrix.setScale(b8Var2.Y0 * 1.5f, 1.0f);
        matrix.postRotate(-24.0f);
        float f25 = b8Var2.Y0;
        matrix.postTranslate(com.google.android.recaptcha.internal.a.x(y10, f25, 0.45f, (-f25) * 0.25f), 0.0f);
        b8Var2.V.setLocalMatrix(matrix);
        ArrayList<RectF> stickerObstacles = g6Var2.getStickerObstacles();
        RectF rectF9 = stickerObstacles.get(0);
        RectF rectF10 = stickerObstacles.get(i7);
        RectF rectF11 = stickerObstacles.get(2);
        RectF rectF12 = stickerObstacles.get(3);
        RectF rectF13 = stickerObstacles.get(4);
        RectF rectF14 = stickerObstacles.get(5);
        ArrayList G = b8Var2.G();
        Path path5 = path2;
        int size3 = G.size();
        int i15 = 0;
        Paint paint6 = paint3;
        g6 g6Var3 = g6Var2;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = 0.0f;
        while (i15 < size3) {
            int i16 = i15 + 1;
            a8 a8Var = (a8) G.get(i15);
            int i17 = a8Var.H;
            int i18 = size3;
            z7 z7Var = a8Var.i;
            ArrayList arrayList4 = G;
            z7 z7Var2 = a8Var.f;
            z7 z7Var3 = a8Var.e;
            RectF rectF15 = rectF11;
            z7 z7Var4 = a8Var.j;
            float f30 = f28;
            z7 z7Var5 = a8Var.k;
            RectF rectF16 = rectF14;
            z7 z7Var6 = a8Var.p;
            float f31 = f26;
            if (i17 != 2 && (i17 != 1 || (a8Var.O && z7Var4.a > 0.3f))) {
                rectF4 = rectF9;
                rectF2 = rectF10;
                rectF6 = rectF12;
                rectF5 = rectF13;
                max = f27;
                rectF = rectF7;
                path = path5;
                g6Var = g6Var3;
                paint = paint6;
                rectF3 = rectF16;
                b8Var = b8Var2;
                path5 = path;
                b8Var2 = b8Var;
                paint6 = paint;
                g6Var3 = g6Var;
                rectF7 = rectF;
                rectF9 = rectF4;
                rectF12 = rectF6;
                rectF13 = rectF5;
                f27 = max;
                i15 = i16;
                size3 = i18;
                G = arrayList4;
                rectF11 = rectF15;
                f28 = f30;
                f26 = f31;
                rectF10 = rectF2;
                rectF14 = rectF3;
            }
            Bitmap a10 = a8Var.a();
            float f32 = a8Var.l.a;
            float l12 = Utilities.l(a8Var.r.a);
            RectF rectF17 = rectF10;
            float f33 = f27;
            float B2 = com.google.android.recaptcha.internal.a.B(l12, 0.2f, 0.8f, (((1.0f - (a8Var.q.a * 0.9f)) * 0.04f * f32) + 1.0f) * b8Var2.U() * a8Var.g.a * a8Var.h.a);
            if (a10 == null || B2 < 1.0f) {
                f28 = f30;
                path5 = path5;
                f29 = f29;
                paint6 = paint6;
                g6Var3 = g6Var3;
                rectF7 = rectF7;
                rectF9 = rectF9;
                rectF12 = rectF12;
                i15 = i16;
                size3 = i18;
                rectF11 = rectF15;
                rectF10 = rectF17;
                rectF14 = rectF16;
                f27 = f33;
                f26 = f31;
                b8Var2 = b8Var2;
                rectF13 = rectF13;
                G = arrayList4;
            } else {
                float max2 = Math.max(z7Var4.a, 0.7f * f32);
                float L3 = (org.telegram.messenger.g0.L(9.0f) * max2) + org.telegram.messenger.g0.L(1.5f);
                float sin = ((float) Math.sin(Math.toRadians(b8Var2.b0))) * L3 * 2.2f;
                float sin2 = ((float) Math.sin(Math.toRadians(b8Var2.a0))) * L3 * 2.2f;
                b8 b8Var3 = b8Var2;
                float f34 = z7Var3.a + a8Var.n.a + sin;
                float L4 = ((z7Var2.a + a8Var.o.a) + sin2) - (org.telegram.messenger.g0.L(4.0f) * max2);
                float f35 = z7Var3.a - (sin * 0.3f);
                float f36 = (L3 * 0.22f) + (z7Var2.a - (sin2 * 0.3f));
                float l13 = Utilities.l((f32 * 1.5f) + (3.0f * max2) + z7Var6.a + z7Var5.a);
                rectF7.set(Math.min(f34, f35) - B2, Math.min(L4, f36) - B2, Math.max(f34, f35) + B2, Math.max(L4, f36) + B2);
                boolean intersects = RectF.intersects(rectF7, rectF12);
                float f37 = B2 * 0.4f;
                rectF8.set(f34 - f37, L4 - f37, f34 + f37, L4 + f37);
                max = Math.max(f33, Math.max(b8.n(rectF8, rectF9), b8.n(rectF8, rectF13)) * l12);
                f31 = Math.max(f31, b8.n(rectF8, rectF17) * l12);
                f30 = Math.max(f30, b8.n(rectF8, rectF16) * l12);
                float n10 = b8.n(rectF8, rectF15) * l12;
                RectF rectF18 = rectF12;
                f29 = Math.max(f29, n10);
                if (intersects) {
                    rectF = rectF7;
                    i10 = canvas.saveLayer(rectF7, null);
                } else {
                    rectF = rectF7;
                    i10 = -1;
                }
                canvas.save();
                canvas.rotate(z7Var.a, f35, f36);
                rectF2 = rectF17;
                rectF3 = rectF16;
                rectF4 = rectF9;
                rectF5 = rectF13;
                rectF6 = rectF18;
                rectF15 = rectF15;
                b8Var3.t(canvas, a8Var, f35, f36, com.google.android.recaptcha.internal.a.B(z7Var6.a, 0.07f, (0.08f * max2) + 0.97f, B2), Math.max(max2, z7Var5.a * 0.5f), z7Var6.a, l13 * l12);
                canvas.restore();
                float f38 = f34 - B2;
                float f39 = L4 - B2;
                float f40 = f34 + B2;
                float f41 = L4 + B2;
                int saveLayer = canvas.saveLayer(f38, f39, f40, f41, null);
                Paint paint7 = paint6;
                paint7.setAlpha((int) (l12 * 255.0f));
                float f42 = z7Var5.a;
                if (f42 > 0.004f) {
                    b8Var3.r(canvas, a10, f34, L4, B2, f42, 1.0f, z7Var.a, a8Var.U, a8Var.V);
                    b8Var = b8Var3;
                    canvas2 = canvas;
                    i11 = saveLayer;
                    paint = paint7;
                } else {
                    canvas2 = canvas;
                    paint = paint7;
                    i11 = saveLayer;
                    b8Var = b8Var3;
                    canvas2.save();
                    canvas2.rotate(z7Var.a, f34, L4);
                    float f43 = B2 / 2.0f;
                    rectF8.set(f34 - f43, L4 - f43, f34 + f43, L4 + f43);
                    canvas2.drawBitmap(a10, (Rect) null, rectF8, paint);
                    canvas2.restore();
                }
                paint.setAlpha(qs.e4);
                canvas2.drawRect(f38, f39, f40, f41, b8Var.U);
                canvas2.restoreToCount(i11);
                if (intersects) {
                    if (intersects) {
                        path = path5;
                        g6Var = g6Var3;
                        g6Var.h(path, b8Var.Y0, b8Var.Z0);
                        canvas2.drawPath(path, b8Var.E1);
                    } else {
                        path = path5;
                        g6Var = g6Var3;
                    }
                    canvas2.restoreToCount(i10);
                } else {
                    path = path5;
                    g6Var = g6Var3;
                }
                path5 = path;
                b8Var2 = b8Var;
                paint6 = paint;
                g6Var3 = g6Var;
                rectF7 = rectF;
                rectF9 = rectF4;
                rectF12 = rectF6;
                rectF13 = rectF5;
                f27 = max;
                i15 = i16;
                size3 = i18;
                G = arrayList4;
                rectF11 = rectF15;
                f28 = f30;
                f26 = f31;
                rectF10 = rectF2;
                rectF14 = rectF3;
            }
        }
        b8 b8Var4 = b8Var2;
        float f44 = f26;
        float f45 = f27;
        float f46 = f28;
        g6 g6Var4 = g6Var3;
        float f47 = f29;
        Paint paint8 = b8Var4.k0;
        Paint paint9 = b8Var4.l0;
        Paint paint10 = b8Var4.j0;
        a8 a8Var2 = b8Var4.h0;
        if (a8Var2 == null || a8Var2.H != 2) {
            f10 = f45;
            f11 = f44;
            f12 = f46;
            f13 = f47;
        } else {
            float f48 = a8Var2.n.a + a8Var2.e.a;
            float f49 = a8Var2.o.a + a8Var2.f.a;
            float P = (b8Var4.P(a8Var2) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
            paint10.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint10.setStyle(style);
            paint10.setStrokeCap(Paint.Cap.ROUND);
            paint10.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            if (paint10.getPathEffect() == null) {
                f14 = f45;
                paint10.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
            } else {
                f14 = f45;
            }
            paint10.setShadowLayer(org.telegram.messenger.g0.L(0.75f), 0.0f, 0.0f, 1342177280);
            paint9.setColor(-1);
            paint9.setStyle(style);
            paint9.setStrokeWidth(org.telegram.messenger.g0.L(2.66f));
            paint9.setShadowLayer(org.telegram.messenger.g0.L(0.75f), 0.0f, 0.0f, 1342177280);
            paint8.setColor(-15033089);
            canvas.save();
            canvas.rotate(a8Var2.i.a, f48, f49);
            float f50 = f48 - P;
            float f51 = f49 - P;
            f11 = f44;
            float f52 = f48 + P;
            float f53 = f49 + P;
            f13 = f47;
            f12 = f46;
            f10 = f14;
            canvas.drawArc(f50, f51, f52, f53, 0.0f, 180.0f, false, paint10);
            canvas.drawArc(f50, f51, f52, f53, 180.0f, 180.0f, false, paint10);
            for (int i19 = -1; i19 <= 1; i19 += 2) {
                float f54 = (i19 * P) + f48;
                canvas.drawCircle(f54, f49, org.telegram.messenger.g0.L(5.66f), paint9);
                canvas.drawCircle(f54, f49, org.telegram.messenger.g0.L(4.66f), paint8);
            }
            canvas.restore();
        }
        e6 e6Var = g6Var4.N;
        float round = Math.round(f13 * 20.0f) / 20.0f;
        if (round != g6Var4.J) {
            g6Var4.J = round;
            g6Var4.H.invalidate();
        }
        float f55 = Math.max(f12, f10) > 0.0f ? 1.0f : 0.0f;
        if (f55 != g6Var4.h) {
            g6Var4.h = f55;
            e6Var.invalidate();
        }
        float round2 = Math.round(f10 * 20.0f) / 20.0f;
        float round3 = Math.round(f11 * 20.0f) / 20.0f;
        if (round2 != g6Var4.d0) {
            g6Var4.d0 = round2;
            e6Var.invalidate();
            g6Var4.O.invalidate();
        }
        if (round3 != g6Var4.e0) {
            g6Var4.e0 = round3;
            g6Var4.G.invalidate();
        }
    }
}
