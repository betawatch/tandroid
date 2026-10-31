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
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u1 {
    public final q1 a;
    public int b;
    public up c;
    public String d;
    public b30 e;
    public Drawable f;
    public int g = -1;

    public u1(q1 q1Var) {
        this.a = q1Var;
    }

    public final void a(Canvas canvas) {
        q1 q1Var = this.a;
        ag.c2 c2Var = q1Var.T0;
        li.k kVar = q1Var.Qb;
        if (((Drawable) kVar.d) == null) {
            kVar.d = i0.a.f((Context) kVar.b, R.drawable.map_pin);
        }
        Drawable drawable = (Drawable) kVar.d;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int B = (int) c3.i0.B(c2Var.M0, intrinsicWidth, 2.0f, c2Var.K0);
        int interpolation = (int) ((((c2Var.N0 / 2.0f) - intrinsicHeight) + c2Var.L0) - ((1.0f - gr.k.getInterpolation(c2Var.h1)) * org.telegram.messenger.i0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, c2Var.h1 * 5.0f) * 255.0f));
        drawable.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (c2Var.h1 < 1.0f) {
            q1Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        String C;
        float abs;
        float f12;
        RectF rectF;
        float f13;
        q1 q1Var;
        ImageReceiver imageReceiver;
        x1 x1Var;
        float f14;
        q1 q1Var2 = this.a;
        int i10 = q1Var2.Y5;
        ImageReceiver imageReceiver2 = q1Var2.D7;
        x1 x1Var2 = q1Var2.gb;
        RectF rectF2 = q1Var2.a4;
        ag.c2 c2Var = q1Var2.T0;
        if (q1Var2.c3 != null) {
            if (q1Var2.O5.P3()) {
                org.telegram.ui.ActionBar.t6.H2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var2.Ob));
                org.telegram.ui.ActionBar.t6.I2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var2.v2() ? org.telegram.ui.ActionBar.t6.zc : org.telegram.ui.ActionBar.t6.yc, q1Var2.Ob));
            } else {
                org.telegram.ui.ActionBar.t6.H2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var2.Ob));
                org.telegram.ui.ActionBar.t6.I2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var2.v2() ? org.telegram.ui.ActionBar.t6.xe : org.telegram.ui.ActionBar.t6.we, q1Var2.Ob));
            }
            if (!(jj.o1(q1Var2.O5.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                canvas.save();
                canvas.translate(c2Var.K0 + org.telegram.messenger.i0.L(6.0f), c2Var.A() + org.telegram.messenger.i0.L(8.0f));
                q1Var2.c3.draw(canvas);
                if (q1Var2.v3 != null) {
                    canvas.translate(0.0f, org.telegram.messenger.i0.L(21.0f));
                    q1Var2.v3.draw(canvas);
                }
                canvas.restore();
                return;
            }
            int A = (int) (c2Var.A() + org.telegram.messenger.i0.L(30.0f));
            if (!q1Var2.f3 || x1Var2.j) {
                q1Var2.E9 = true;
                StaticLayout staticLayout = q1Var2.c3;
                StaticLayout staticLayout2 = q1Var2.v3;
                f7 = 1.0f;
                boolean z10 = false;
                if (x1Var2.j) {
                    float f15 = x1Var2.m;
                    String str = x1Var2.l;
                    staticLayout = x1Var2.n;
                    StaticLayout staticLayout3 = x1Var2.o;
                    f10 = 255.0f;
                    abs = f15;
                    f12 = 1.0f - x1Var2.L1;
                    C = str;
                    staticLayout2 = staticLayout3;
                    f11 = 2.0f;
                } else {
                    f10 = 255.0f;
                    if (jj.o1(q1Var2.O5.k).period == Integer.MAX_VALUE) {
                        C = "";
                        f12 = 1.0f;
                        abs = 1.0f;
                        f11 = 2.0f;
                        z10 = true;
                    } else {
                        f11 = 2.0f;
                        C = cd.C(Math.abs(jj.o1(q1Var2.O5.k).period - (ConnectionsManager.getInstance(i10).getCurrentTime() - q1Var2.O5.k.date)));
                        abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i10).getCurrentTime() - q1Var2.O5.k.date) / jj.o1(q1Var2.O5.k).period);
                        f12 = 1.0f;
                    }
                }
                float f16 = f12;
                rectF2.set(c2Var.y() - org.telegram.messenger.i0.L(43.0f), A - org.telegram.messenger.i0.L(15.0f), c2Var.y() - org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(15.0f) + A);
                if (q1Var2.O5.P3()) {
                    Paint paint = org.telegram.ui.ActionBar.t6.l2;
                    int i11 = org.telegram.ui.ActionBar.t6.Jb;
                    paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, q1Var2.Ob));
                    org.telegram.ui.ActionBar.t6.F2.setColor(org.telegram.ui.ActionBar.t6.w0(i11, q1Var2.Ob));
                } else {
                    Paint paint2 = org.telegram.ui.ActionBar.t6.l2;
                    int i12 = org.telegram.ui.ActionBar.t6.rd;
                    paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i12, q1Var2.Ob));
                    org.telegram.ui.ActionBar.t6.F2.setColor(org.telegram.ui.ActionBar.t6.w0(i12, q1Var2.Ob));
                }
                int alpha = org.telegram.ui.ActionBar.t6.H2.getAlpha();
                int alpha2 = org.telegram.ui.ActionBar.t6.I2.getAlpha();
                int alpha3 = org.telegram.ui.ActionBar.t6.F2.getAlpha();
                if (f16 != 1.0f) {
                    f13 = 50.0f;
                    rectF = rectF2;
                    org.telegram.ui.ActionBar.t6.H2.setAlpha((int) (alpha * f16));
                    org.telegram.ui.ActionBar.t6.I2.setAlpha((int) (alpha2 * f16));
                    org.telegram.ui.ActionBar.t6.F2.setAlpha((int) (alpha3 * f16));
                    canvas.save();
                    canvas.translate(0.0f, (-org.telegram.messenger.i0.L(50.0f)) * x1Var2.L1);
                } else {
                    rectF = rectF2;
                    f13 = 50.0f;
                }
                org.telegram.ui.ActionBar.t6.l2.setAlpha((int) (f16 * f13));
                StaticLayout staticLayout4 = staticLayout2;
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.i0.L(15.0f), org.telegram.ui.ActionBar.t6.l2);
                org.telegram.ui.ActionBar.t6.l2.setAlpha((int) (f16 * f10));
                StaticLayout staticLayout5 = staticLayout;
                q1Var = q1Var2;
                imageReceiver = imageReceiver2;
                RectF rectF3 = rectF;
                canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.t6.l2);
                if (z10) {
                    if (this.f == null) {
                        this.f = q1Var.getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                    }
                    if (org.telegram.ui.ActionBar.t6.F2.getColor() != this.g) {
                        Drawable drawable = this.f;
                        int color = org.telegram.ui.ActionBar.t6.F2.getColor();
                        this.g = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    x1Var = x1Var2;
                    f14 = abs;
                    this.f.setBounds(f1.z(2, (int) rectF3.centerX(), this.f), f1.y(2, (int) rectF3.centerY(), this.f), f1.w(2, (int) rectF3.centerX(), this.f), f1.f(2, (int) rectF3.centerY(), this.f));
                    this.f.draw(canvas);
                } else {
                    x1Var = x1Var2;
                    f14 = abs;
                    float measureText = org.telegram.ui.ActionBar.t6.F2.measureText(C);
                    int length = C.length();
                    float f17 = length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f;
                    canvas.save();
                    canvas.scale(f17, f17, rectF3.centerX(), rectF3.centerY());
                    canvas.drawText(C, rectF3.centerX() - (measureText / f11), org.telegram.messenger.i0.L(4.0f) + A, org.telegram.ui.ActionBar.t6.F2);
                    canvas.restore();
                }
                if (staticLayout5 != null && staticLayout4 != null) {
                    canvas.save();
                    canvas.translate(c2Var.K0 + org.telegram.messenger.i0.L(10.0f), c2Var.A() + org.telegram.messenger.i0.L(10.0f));
                    staticLayout5.draw(canvas);
                    canvas.translate(0.0f, org.telegram.messenger.i0.L(23.0f));
                    staticLayout4.draw(canvas);
                    canvas.restore();
                }
                if (f16 != 1.0f) {
                    org.telegram.ui.ActionBar.t6.H2.setAlpha(alpha);
                    org.telegram.ui.ActionBar.t6.I2.setAlpha(alpha2);
                    org.telegram.ui.ActionBar.t6.F2.setAlpha(alpha3);
                    canvas.restore();
                }
                x1 x1Var3 = x1Var;
                x1Var3.m = f14;
                x1Var3.l = C;
                x1Var3.n = staticLayout5;
                x1Var3.o = staticLayout4;
            } else {
                x1Var2.l = null;
                x1Var2.n = null;
                x1Var2.o = null;
                q1Var = q1Var2;
                imageReceiver = imageReceiver2;
                f11 = 2.0f;
                f7 = 1.0f;
                f10 = 255.0f;
            }
            float f18 = c2Var.N() ? f7 : c2Var.h1;
            if (f18 > 0.0f) {
                if (c2Var.L() || c2Var.N()) {
                    int L = (int) (((c2Var.M0 / f11) + c2Var.K0) - org.telegram.messenger.i0.L(31.0f));
                    int L2 = (int) ((((c2Var.N0 / f11) + c2Var.L0) - org.telegram.messenger.i0.L(38.0f)) - ((f7 - gr.k.getInterpolation(f18)) * org.telegram.messenger.i0.L(16.0f)));
                    li.k kVar = q1Var.Qb;
                    if (((Drawable) kVar.c) == null) {
                        kVar.c = i0.a.f((Context) kVar.b, R.drawable.livepin);
                    }
                    Drawable drawable2 = (Drawable) kVar.c;
                    z.t(L, L2, drawable2);
                    float f19 = f18 * 5.0f;
                    drawable2.setAlpha((int) (Math.min(f7, f19) * f10));
                    drawable2.draw(canvas);
                    ImageReceiver imageReceiver3 = imageReceiver;
                    imageReceiver3.y0(org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(52.0f));
                    imageReceiver3.setAlpha(Math.min(1.0f, f19));
                    imageReceiver3.h(canvas, null);
                }
            }
        }
    }
}
