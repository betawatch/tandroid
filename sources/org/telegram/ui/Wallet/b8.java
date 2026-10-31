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
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b8 extends View {
    public final /* synthetic */ h8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(h8 h8Var, Context context) {
        super(context);
        this.a = h8Var;
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
        h8 h8Var;
        Path path;
        l6 l6Var;
        float f14;
        h8 h8Var2 = this.a;
        RectF rectF7 = h8Var2.D1;
        Path path2 = h8Var2.I;
        l6 l6Var2 = h8Var2.c;
        Matrix matrix = h8Var2.W;
        Paint paint2 = h8Var2.F;
        RectF rectF8 = h8Var2.H;
        Paint paint3 = h8Var2.y;
        Path path3 = h8Var2.T;
        if (h8Var2.Y0 <= 0.0f) {
            return;
        }
        paint3.setShader(null);
        paint3.setColorFilter(null);
        ArrayList arrayList = h8Var2.S;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            int i14 = i13 + 1;
            e8 e8Var = (e8) obj;
            float f15 = e8Var.h / e8Var.f;
            if (f15 < 0.1f) {
                f14 = f15 / 0.1f;
            } else {
                float f16 = 1.0f - ((f15 - 0.1f) / 0.9f);
                f14 = f16 * f16;
            }
            ArrayList arrayList2 = arrayList;
            float C = c3.i0.C(f14, 0.4f, 0.6f, e8Var.e);
            paint3.setColor(-1);
            paint3.setAlpha((int) (Utilities.l(f14) * 130.0f));
            canvas.save();
            canvas.translate(e8Var.a, e8Var.b);
            canvas.rotate(e8Var.g);
            path3.rewind();
            float f17 = -C;
            float f18 = f17 * 2.0f;
            path3.moveTo(0.0f, f18);
            float f19 = C * 0.35f;
            float f20 = f17 * 0.35f;
            path3.lineTo(f19, f20);
            float f21 = C * 2.0f;
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
        paint3.setAlpha(zs.e4);
        ArrayList arrayList3 = h8Var2.n;
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList3.get(i15);
            i15++;
            d8 d8Var = (d8) obj2;
            float l4 = f22 - Utilities.l(d8Var.c / 0.42f);
            float x10 = org.telegram.ui.Cells.f1.x(l4, l4, l4, f22);
            paint2.setColor(-1);
            paint2.setAlpha((int) (l4 * 90.0f));
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.4f) * l4);
            canvas.drawCircle(d8Var.a, d8Var.b, c3.i0.C(x10, 0.43f, 0.42f, h8Var2.U()), paint2);
            arrayList3 = arrayList3;
            size2 = size2;
            f22 = 1.0f;
        }
        Paint paint4 = h8Var2.s1;
        Path path4 = h8Var2.u1;
        Paint paint5 = h8Var2.r1;
        float l10 = Utilities.l(h8Var2.q1.a);
        if (l10 < 0.01f || !h8Var2.C()) {
            i10 = 1;
        } else {
            paint4.setAlpha((int) (22.0f * l10));
            canvas.drawPath(path4, paint4);
            float L = org.telegram.messenger.i0.L(6.0f);
            float L2 = org.telegram.messenger.i0.L(4.5f);
            float f23 = L + L2;
            i10 = 1;
            paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f23 - ((h8Var2.n1 * org.telegram.messenger.i0.L(18.0f)) % f23)));
            paint5.setStrokeWidth(org.telegram.messenger.i0.L(3.2f));
            paint5.setColor(Color.argb((int) (40.0f * l10), 0, 18, 48));
            canvas.drawPath(path4, paint5);
            paint5.setStrokeWidth(org.telegram.messenger.i0.L(1.8f));
            paint5.setColor(Color.argb((int) (l10 * 180.0f), zs.e4, zs.e4, zs.e4));
            canvas.drawPath(path4, paint5);
        }
        float x11 = c3.i0.x(h8Var2.a0, 0.6f, h8Var2.b0, 10.0f);
        matrix.setScale(h8Var2.Y0 * 1.5f, 1.0f);
        matrix.postRotate(-24.0f);
        float f24 = h8Var2.Y0;
        matrix.postTranslate(c3.i0.u(x11, f24, 0.45f, (-f24) * 0.25f), 0.0f);
        h8Var2.V.setLocalMatrix(matrix);
        ArrayList<RectF> stickerObstacles = l6Var2.getStickerObstacles();
        RectF rectF9 = stickerObstacles.get(0);
        RectF rectF10 = stickerObstacles.get(i10);
        RectF rectF11 = stickerObstacles.get(2);
        RectF rectF12 = stickerObstacles.get(3);
        RectF rectF13 = stickerObstacles.get(4);
        RectF rectF14 = stickerObstacles.get(5);
        ArrayList G = h8Var2.G();
        Path path5 = path2;
        int size3 = G.size();
        int i16 = 0;
        Paint paint6 = paint3;
        l6 l6Var3 = l6Var2;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        while (i16 < size3) {
            int i17 = i16 + 1;
            g8 g8Var = (g8) G.get(i16);
            int i18 = g8Var.H;
            int i19 = size3;
            f8 f8Var = g8Var.i;
            ArrayList arrayList4 = G;
            f8 f8Var2 = g8Var.f;
            f8 f8Var3 = g8Var.e;
            RectF rectF15 = rectF11;
            f8 f8Var4 = g8Var.j;
            float f29 = f27;
            f8 f8Var5 = g8Var.k;
            RectF rectF16 = rectF14;
            f8 f8Var6 = g8Var.p;
            float f30 = f25;
            if (i18 != 2 && (i18 != 1 || (g8Var.O && f8Var4.a > 0.3f))) {
                rectF4 = rectF9;
                rectF2 = rectF10;
                rectF6 = rectF12;
                rectF5 = rectF13;
                max = f26;
                rectF = rectF7;
                path = path5;
                l6Var = l6Var3;
                paint = paint6;
                rectF3 = rectF16;
                h8Var = h8Var2;
                path5 = path;
                h8Var2 = h8Var;
                paint6 = paint;
                l6Var3 = l6Var;
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
            Bitmap a2 = g8Var.a();
            float f31 = g8Var.l.a;
            float l11 = Utilities.l(g8Var.r.a);
            RectF rectF17 = rectF10;
            float f32 = f26;
            float C2 = c3.i0.C(l11, 0.2f, 0.8f, (((1.0f - (g8Var.q.a * 0.9f)) * 0.04f * f31) + 1.0f) * h8Var2.U() * g8Var.g.a * g8Var.h.a);
            if (a2 == null || C2 < 1.0f) {
                f27 = f29;
                path5 = path5;
                f28 = f28;
                paint6 = paint6;
                l6Var3 = l6Var3;
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
                h8Var2 = h8Var2;
                rectF13 = rectF13;
                G = arrayList4;
            } else {
                float max2 = Math.max(f8Var4.a, 0.7f * f31);
                float L3 = (org.telegram.messenger.i0.L(9.0f) * max2) + org.telegram.messenger.i0.L(1.5f);
                float sin = ((float) Math.sin(Math.toRadians(h8Var2.b0))) * L3 * 2.2f;
                float sin2 = ((float) Math.sin(Math.toRadians(h8Var2.a0))) * L3 * 2.2f;
                h8 h8Var3 = h8Var2;
                float f33 = f8Var3.a + g8Var.n.a + sin;
                float L4 = ((f8Var2.a + g8Var.o.a) + sin2) - (org.telegram.messenger.i0.L(4.0f) * max2);
                float f34 = f8Var3.a - (sin * 0.3f);
                float f35 = (L3 * 0.22f) + (f8Var2.a - (sin2 * 0.3f));
                float l12 = Utilities.l((f31 * 1.5f) + (3.0f * max2) + f8Var6.a + f8Var5.a);
                rectF7.set(Math.min(f33, f34) - C2, Math.min(L4, f35) - C2, Math.max(f33, f34) + C2, Math.max(L4, f35) + C2);
                boolean intersects = RectF.intersects(rectF7, rectF12);
                float f36 = C2 * 0.4f;
                rectF8.set(f33 - f36, L4 - f36, f33 + f36, L4 + f36);
                max = Math.max(f32, Math.max(h8.n(rectF8, rectF9), h8.n(rectF8, rectF13)) * l11);
                f30 = Math.max(f30, h8.n(rectF8, rectF17) * l11);
                f29 = Math.max(f29, h8.n(rectF8, rectF16) * l11);
                float n10 = h8.n(rectF8, rectF15) * l11;
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
                canvas.rotate(f8Var.a, f34, f35);
                rectF2 = rectF17;
                rectF3 = rectF16;
                rectF4 = rectF9;
                rectF5 = rectF13;
                rectF6 = rectF18;
                rectF15 = rectF15;
                h8Var3.t(canvas, g8Var, f34, f35, c3.i0.C(f8Var6.a, 0.07f, (0.08f * max2) + 0.97f, C2), Math.max(max2, f8Var5.a * 0.5f), f8Var6.a, l12 * l11);
                canvas.restore();
                float f37 = f33 - C2;
                float f38 = L4 - C2;
                float f39 = f33 + C2;
                float f40 = L4 + C2;
                int saveLayer = canvas.saveLayer(f37, f38, f39, f40, null);
                Paint paint7 = paint6;
                paint7.setAlpha((int) (l11 * 255.0f));
                float f41 = f8Var5.a;
                if (f41 > 0.004f) {
                    h8Var3.r(canvas, a2, f33, L4, C2, f41, 1.0f, f8Var.a, g8Var.U, g8Var.V);
                    h8Var = h8Var3;
                    canvas2 = canvas;
                    i12 = saveLayer;
                    paint = paint7;
                } else {
                    canvas2 = canvas;
                    paint = paint7;
                    i12 = saveLayer;
                    h8Var = h8Var3;
                    canvas2.save();
                    canvas2.rotate(f8Var.a, f33, L4);
                    float f42 = C2 / 2.0f;
                    rectF8.set(f33 - f42, L4 - f42, f33 + f42, L4 + f42);
                    canvas2.drawBitmap(a2, (Rect) null, rectF8, paint);
                    canvas2.restore();
                }
                paint.setAlpha(zs.e4);
                canvas2.drawRect(f37, f38, f39, f40, h8Var.U);
                canvas2.restoreToCount(i12);
                if (intersects) {
                    if (intersects) {
                        path = path5;
                        l6Var = l6Var3;
                        l6Var.h(path, h8Var.Y0, h8Var.Z0);
                        canvas2.drawPath(path, h8Var.E1);
                    } else {
                        path = path5;
                        l6Var = l6Var3;
                    }
                    canvas2.restoreToCount(i11);
                } else {
                    path = path5;
                    l6Var = l6Var3;
                }
                path5 = path;
                h8Var2 = h8Var;
                paint6 = paint;
                l6Var3 = l6Var;
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
        h8 h8Var4 = h8Var2;
        float f43 = f25;
        float f44 = f26;
        float f45 = f27;
        l6 l6Var4 = l6Var3;
        float f46 = f28;
        Paint paint8 = h8Var4.k0;
        Paint paint9 = h8Var4.l0;
        Paint paint10 = h8Var4.j0;
        g8 g8Var2 = h8Var4.h0;
        if (g8Var2 == null || g8Var2.H != 2) {
            f7 = f44;
            f10 = f43;
            f11 = f45;
            f12 = f46;
        } else {
            float f47 = g8Var2.n.a + g8Var2.e.a;
            float f48 = g8Var2.o.a + g8Var2.f.a;
            float P = (h8Var4.P(g8Var2) * 0.5f) + org.telegram.messenger.i0.L(9.0f);
            paint10.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint10.setStyle(style);
            paint10.setStrokeCap(Paint.Cap.ROUND);
            paint10.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            if (paint10.getPathEffect() == null) {
                f13 = f44;
                paint10.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f)}, 0.5f));
            } else {
                f13 = f44;
            }
            paint10.setShadowLayer(org.telegram.messenger.i0.L(0.75f), 0.0f, 0.0f, 1342177280);
            paint9.setColor(-1);
            paint9.setStyle(style);
            paint9.setStrokeWidth(org.telegram.messenger.i0.L(2.66f));
            paint9.setShadowLayer(org.telegram.messenger.i0.L(0.75f), 0.0f, 0.0f, 1342177280);
            paint8.setColor(-15033089);
            canvas.save();
            canvas.rotate(g8Var2.i.a, f47, f48);
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
                canvas.drawCircle(f53, f48, org.telegram.messenger.i0.L(5.66f), paint9);
                canvas.drawCircle(f53, f48, org.telegram.messenger.i0.L(4.66f), paint8);
            }
            canvas.restore();
        }
        j6 j6Var = l6Var4.N;
        float round = Math.round(f12 * 20.0f) / 20.0f;
        if (round != l6Var4.J) {
            l6Var4.J = round;
            l6Var4.H.invalidate();
        }
        float f54 = Math.max(f11, f7) > 0.0f ? 1.0f : 0.0f;
        if (f54 != l6Var4.h) {
            l6Var4.h = f54;
            j6Var.invalidate();
        }
        float round2 = Math.round(f7 * 20.0f) / 20.0f;
        float round3 = Math.round(f10 * 20.0f) / 20.0f;
        if (round2 != l6Var4.d0) {
            l6Var4.d0 = round2;
            j6Var.invalidate();
            l6Var4.O.invalidate();
        }
        if (round3 != l6Var4.e0) {
            l6Var4.e0 = round3;
            l6Var4.G.invalidate();
        }
    }
}
