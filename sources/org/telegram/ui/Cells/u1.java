package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 {
    public final q1 a;
    public int b;
    public np c;
    public String d;
    public e20 e;
    public Drawable f;
    public int g = -1;

    public u1(q1 q1Var) {
        this.a = q1Var;
    }

    public final void a(Canvas canvas) {
        q1 q1Var = this.a;
        ei.c3 c3Var = q1Var.U0;
        k4.j jVar = q1Var.Rb;
        if (((Drawable) jVar.c) == null) {
            jVar.c = k2.p1.g((Context) jVar.a, R.drawable.map_pin);
        }
        Drawable drawable = (Drawable) jVar.c;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int z10 = (int) com.google.android.recaptcha.internal.a.z(c3Var.N0, intrinsicWidth, 2.0f, c3Var.L0);
        int interpolation = (int) ((((c3Var.O0 / 2.0f) - intrinsicHeight) + c3Var.M0) - ((1.0f - xq.k.getInterpolation(c3Var.i1)) * org.telegram.messenger.g0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, c3Var.i1 * 5.0f) * 255.0f));
        drawable.setBounds(z10, interpolation, intrinsicWidth + z10, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (c3Var.i1 < 1.0f) {
            q1Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        String C;
        float abs;
        float f13;
        RectF rectF;
        float f14;
        q1 q1Var;
        ImageReceiver imageReceiver;
        x1 x1Var;
        float f15;
        q1 q1Var2 = this.a;
        int i3 = q1Var2.Z5;
        ImageReceiver imageReceiver2 = q1Var2.E7;
        x1 x1Var2 = q1Var2.hb;
        RectF rectF2 = q1Var2.b4;
        ei.c3 c3Var = q1Var2.U0;
        if (q1Var2.d3 != null) {
            if (q1Var2.P5.Q3()) {
                org.telegram.ui.ActionBar.k6.H2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var2.Pb));
                org.telegram.ui.ActionBar.k6.I2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var2.x2() ? org.telegram.ui.ActionBar.k6.zc : org.telegram.ui.ActionBar.k6.yc, q1Var2.Pb));
            } else {
                org.telegram.ui.ActionBar.k6.H2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var2.Pb));
                org.telegram.ui.ActionBar.k6.I2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var2.x2() ? org.telegram.ui.ActionBar.k6.xe : org.telegram.ui.ActionBar.k6.we, q1Var2.Pb));
            }
            if (!(zi.o1(q1Var2.P5.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                canvas.save();
                canvas.translate(c3Var.L0 + org.telegram.messenger.g0.L(6.0f), c3Var.A() + org.telegram.messenger.g0.L(8.0f));
                q1Var2.d3.draw(canvas);
                if (q1Var2.w3 != null) {
                    canvas.translate(0.0f, org.telegram.messenger.g0.L(21.0f));
                    q1Var2.w3.draw(canvas);
                }
                canvas.restore();
                return;
            }
            int A = (int) (c3Var.A() + org.telegram.messenger.g0.L(30.0f));
            if (!q1Var2.g3 || x1Var2.j) {
                q1Var2.F9 = true;
                StaticLayout staticLayout = q1Var2.d3;
                StaticLayout staticLayout2 = q1Var2.w3;
                f10 = 1.0f;
                boolean z10 = false;
                if (x1Var2.j) {
                    float f16 = x1Var2.m;
                    String str = x1Var2.l;
                    staticLayout = x1Var2.n;
                    StaticLayout staticLayout3 = x1Var2.o;
                    f11 = 255.0f;
                    abs = f16;
                    f13 = 1.0f - x1Var2.L1;
                    C = str;
                    staticLayout2 = staticLayout3;
                    f12 = 2.0f;
                } else {
                    f11 = 255.0f;
                    if (zi.o1(q1Var2.P5.k).period == Integer.MAX_VALUE) {
                        C = "";
                        f13 = 1.0f;
                        abs = 1.0f;
                        f12 = 2.0f;
                        z10 = true;
                    } else {
                        f12 = 2.0f;
                        C = bd.C(Math.abs(zi.o1(q1Var2.P5.k).period - (ConnectionsManager.getInstance(i3).getCurrentTime() - q1Var2.P5.k.date)));
                        abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i3).getCurrentTime() - q1Var2.P5.k.date) / zi.o1(q1Var2.P5.k).period);
                        f13 = 1.0f;
                    }
                }
                float f17 = f13;
                rectF2.set(c3Var.y() - org.telegram.messenger.g0.L(43.0f), A - org.telegram.messenger.g0.L(15.0f), c3Var.y() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(15.0f) + A);
                if (q1Var2.P5.Q3()) {
                    Paint paint = org.telegram.ui.ActionBar.k6.l2;
                    int i10 = org.telegram.ui.ActionBar.k6.Jb;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, q1Var2.Pb));
                    org.telegram.ui.ActionBar.k6.F2.setColor(org.telegram.ui.ActionBar.k6.w0(i10, q1Var2.Pb));
                } else {
                    Paint paint2 = org.telegram.ui.ActionBar.k6.l2;
                    int i11 = org.telegram.ui.ActionBar.k6.rd;
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i11, q1Var2.Pb));
                    org.telegram.ui.ActionBar.k6.F2.setColor(org.telegram.ui.ActionBar.k6.w0(i11, q1Var2.Pb));
                }
                int alpha = org.telegram.ui.ActionBar.k6.H2.getAlpha();
                int alpha2 = org.telegram.ui.ActionBar.k6.I2.getAlpha();
                int alpha3 = org.telegram.ui.ActionBar.k6.F2.getAlpha();
                if (f17 != 1.0f) {
                    f14 = 50.0f;
                    rectF = rectF2;
                    org.telegram.ui.ActionBar.k6.H2.setAlpha((int) (alpha * f17));
                    org.telegram.ui.ActionBar.k6.I2.setAlpha((int) (alpha2 * f17));
                    org.telegram.ui.ActionBar.k6.F2.setAlpha((int) (alpha3 * f17));
                    canvas.save();
                    canvas.translate(0.0f, (-org.telegram.messenger.g0.L(50.0f)) * x1Var2.L1);
                } else {
                    rectF = rectF2;
                    f14 = 50.0f;
                }
                org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (f17 * f14));
                StaticLayout staticLayout4 = staticLayout2;
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.g0.L(15.0f), org.telegram.ui.ActionBar.k6.l2);
                org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (f17 * f11));
                StaticLayout staticLayout5 = staticLayout;
                q1Var = q1Var2;
                imageReceiver = imageReceiver2;
                RectF rectF3 = rectF;
                canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
                if (z10) {
                    if (this.f == null) {
                        this.f = q1Var.getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                    }
                    if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.g) {
                        Drawable drawable = this.f;
                        int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                        this.g = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    x1Var = x1Var2;
                    f15 = abs;
                    this.f.setBounds(f1.C(2, (int) rectF3.centerX(), this.f), f1.B(2, (int) rectF3.centerY(), this.f), f1.z(2, (int) rectF3.centerX(), this.f), f1.i(2, (int) rectF3.centerY(), this.f));
                    this.f.draw(canvas);
                } else {
                    x1Var = x1Var2;
                    f15 = abs;
                    float measureText = org.telegram.ui.ActionBar.k6.F2.measureText(C);
                    int length = C.length();
                    float f18 = length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f;
                    canvas.save();
                    canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
                    canvas.drawText(C, rectF3.centerX() - (measureText / f12), org.telegram.messenger.g0.L(4.0f) + A, org.telegram.ui.ActionBar.k6.F2);
                    canvas.restore();
                }
                if (staticLayout5 != null && staticLayout4 != null) {
                    canvas.save();
                    canvas.translate(c3Var.L0 + org.telegram.messenger.g0.L(10.0f), c3Var.A() + org.telegram.messenger.g0.L(10.0f));
                    staticLayout5.draw(canvas);
                    canvas.translate(0.0f, org.telegram.messenger.g0.L(23.0f));
                    staticLayout4.draw(canvas);
                    canvas.restore();
                }
                if (f17 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.H2.setAlpha(alpha);
                    org.telegram.ui.ActionBar.k6.I2.setAlpha(alpha2);
                    org.telegram.ui.ActionBar.k6.F2.setAlpha(alpha3);
                    canvas.restore();
                }
                x1 x1Var3 = x1Var;
                x1Var3.m = f15;
                x1Var3.l = C;
                x1Var3.n = staticLayout5;
                x1Var3.o = staticLayout4;
            } else {
                x1Var2.l = null;
                x1Var2.n = null;
                x1Var2.o = null;
                q1Var = q1Var2;
                imageReceiver = imageReceiver2;
                f12 = 2.0f;
                f10 = 1.0f;
                f11 = 255.0f;
            }
            float f19 = c3Var.N() ? f10 : c3Var.i1;
            if (f19 > 0.0f) {
                if (c3Var.L() || c3Var.N()) {
                    int L = (int) (((c3Var.N0 / f12) + c3Var.L0) - org.telegram.messenger.g0.L(31.0f));
                    int L2 = (int) ((((c3Var.O0 / f12) + c3Var.M0) - org.telegram.messenger.g0.L(38.0f)) - ((f10 - xq.k.getInterpolation(f19)) * org.telegram.messenger.g0.L(16.0f)));
                    k4.j jVar = q1Var.Rb;
                    if (((Drawable) jVar.b) == null) {
                        jVar.b = k2.p1.g((Context) jVar.a, R.drawable.livepin);
                    }
                    Drawable drawable2 = (Drawable) jVar.b;
                    z.s(L, L2, drawable2);
                    float f20 = f19 * 5.0f;
                    drawable2.setAlpha((int) (Math.min(f10, f20) * f11));
                    drawable2.draw(canvas);
                    ImageReceiver imageReceiver3 = imageReceiver;
                    imageReceiver3.y0(org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(52.0f));
                    imageReceiver3.setAlpha(Math.min(1.0f, f20));
                    imageReceiver3.h(canvas, null);
                }
            }
        }
    }
}
