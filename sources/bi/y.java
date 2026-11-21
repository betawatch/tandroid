package bi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import di.fb;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y extends sa implements t9 {
    public static final /* synthetic */ int w2 = 0;
    public final long T1;
    public final o41 U1;
    public final di.b V1;
    public final s W1;
    public final bg.r X1;
    public final r Y1;
    public final ai.l0 Z1;
    public final ai.l0 a2;
    public final ai.l0 b2;
    public final org.telegram.ui.Cells.o4 c2;
    public final org.telegram.ui.Components.o6 d2;
    public final w e2;
    public final w[] f2;
    public final FrameLayout g2;
    public q9 h2;
    public final x i2;
    public Runnable j2;
    public long k2;
    public long l2;
    public boolean m2;
    public final nq[] n2;
    public org.telegram.ui.Components.y5 o2;
    public final te.a p2;
    public final te.a q2;
    public final nq[] r2;
    public boolean s2;
    public c51 t2;
    public boolean u2;
    public boolean v2;

    public y(Context context, org.telegram.ui.ActionBar.h6 h6Var, x xVar, q9 q9Var) {
        super(context, null, false, false, 2, h6Var);
        int i7;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f2 = new w[3];
        this.m2 = true;
        this.n2 = new nq[1];
        h hVar = new h(this);
        nr nrVar = nr.h;
        int i10 = 0;
        this.p2 = new te.a(0, hVar, nrVar, 380L, false);
        this.q2 = new te.a(0, new h(this), nrVar, 380L, false);
        this.r2 = new nq[1];
        this.h2 = q9Var;
        this.i2 = xVar;
        long j3 = q9Var.b;
        this.T1 = j3;
        this.M1 = true;
        this.v1 = 0.2f;
        q9 l10 = u9.c(this.a).l(j3, this);
        this.X1 = new bg.r(new h(this));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        m0.e1(this.p1, context, h6Var, l10.d);
        TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(j10.i(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U1 = o41.j(-1, linearLayout);
        r rVar = new r(this, context, h6Var);
        this.Y1 = rVar;
        rVar.P = true;
        this.h2.e();
        q9 q9Var2 = this.h2;
        long j10 = q9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var2.f;
        long j11 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : q9Var2.f.bid_levels.get(0).amount;
        int i11 = j11 > 100000 ? ((((int) j11) * 3) / 2000) * 1000 : j11 > 30000 ? 100000 : 50000;
        int i12 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i14 = iArr[i13];
            if (i14 >= 50) {
                z10 = i14 == 50 ? false : z10;
                if (i14 <= i11) {
                    arrayList2.add(Integer.valueOf(i14));
                    if (iArr[i13] == i11) {
                        break;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(i11));
                    break;
                }
            } else {
                z10 = true;
            }
            i13++;
            i12 = 15;
        }
        if (z10) {
            arrayList2.add(0, 50);
        }
        int i15 = 2;
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            iArr2[i16] = ((Integer) arrayList2.get(i16)).intValue();
        }
        r rVar2 = this.Y1;
        rVar2.f0 = iArr2;
        linearLayout.addView(rVar2, ma.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ai.l0 l0Var = new ai.l0(context, h6Var);
        this.Z1 = l0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i17 = org.telegram.ui.ActionBar.m6.a7;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i17, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.J0), org.telegram.ui.ActionBar.m6.w0(i17, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
        l0Var.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(l0Var, k02, M, null, h6Var);
        l0Var.setOnClickListener(new m(this, i15));
        ((TextView) l0Var.c).setText(gd.N0(2131750358, null));
        ai.l0 l0Var2 = new ai.l0(context, h6Var);
        this.a2 = l0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(i17, this.J0));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
        l0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(l0Var2, d02, M2, null, h6Var);
        ((TextView) l0Var2.c).setText(gd.N0(2131750356, null));
        ai.l0 l0Var3 = new ai.l0(context, h6Var);
        this.b2 = l0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(i17, this.J0));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i17);
        l0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(l0Var3, d03, M3, null, h6Var);
        ((TextView) l0Var3.c).setText(gd.N0(2131750359, null));
        linearLayout2.addView(l0Var, ma.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ma.l(0.0f, 10, -1));
        linearLayout2.addView(l0Var2, ma.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ma.l(0.0f, 10, -1));
        linearLayout2.addView(l0Var3, ma.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, ma.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.e.acquired_count > 0) {
            m80 m80Var = new m80(context, h6Var);
            m80Var.setGravity(17);
            m80Var.setTextSize(1, 16.0f);
            int i18 = org.telegram.ui.ActionBar.m6.J6;
            org.telegram.ui.ActionBar.t6.U(m80Var, i18, h6Var);
            org.telegram.ui.ActionBar.t6.G(m80Var, i18, h6Var);
            i7 = 2;
            m80Var.setOnClickListener(new ah.h(this, new boolean[1], h6Var, i7));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(l10.c, m80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            m80Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(gd.F("Gift2AuctionsItemsBought2", l10.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            ra.b(m80Var, 0.02f, 1.5f);
            linearLayout.addView(m80Var, ma.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        } else {
            i7 = 2;
        }
        int i19 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i19, 21, 0, 0, false, true, h6Var);
        this.c2 = o4Var;
        linearLayout.addView(o4Var, ma.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.d2 = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        o6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        o6Var.setSizeableBackground(org.telegram.ui.ActionBar.m6.b0(0, 0, 9, 9));
        o6Var.setHideBackgroundIfEmpty(true);
        o4Var.setOnWidthUpdateListener(new a3.f(this, 18));
        o4Var.addView(o6Var, ma.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        w wVar = new w(context, h6Var);
        this.e2 = wVar;
        org.telegram.ui.Components.o6 o6Var2 = wVar.b;
        org.telegram.ui.ActionBar.t6.q(o6Var2);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i19, this.J0));
        wVar.c(c22);
        linearLayout.addView(wVar, ma.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, i19, 21, 15, 0, false, false, h6Var);
        o4Var2.setText(gd.N0(2131750303, null));
        linearLayout.addView(o4Var2, ma.o(-1, -2));
        int i20 = 0;
        while (true) {
            w[] wVarArr = this.f2;
            if (i20 >= wVarArr.length) {
                break;
            }
            wVarArr[i20] = new w(context, h6Var);
            int i21 = i20 + 1;
            this.f2[i20].b(i21, true, false);
            this.f2[i20].setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            w wVar2 = this.f2[i20];
            wVar2.f = i20 < 2;
            wVar2.setOnClickListener(new o(i10));
            linearLayout.addView(this.f2[i20], ma.o(-1, -2));
            i20 = i21;
        }
        s sVar = new s(0, context, h6Var, true);
        this.W1 = sVar;
        sVar.f();
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = d.leftMargin;
        int i23 = this.u0;
        d.leftMargin = i22 + i23;
        d.rightMargin += i23;
        this.b.addView(sVar, d);
        ek0 ek0Var = this.o1;
        int i24 = this.u0;
        ek0Var.setPadding(i24, 0, i24, org.telegram.messenger.g0.L(64.0f));
        this.o1.setOnItemClickListener(new a(1));
        long j12 = l10.e.bid_amount;
        if (j12 > 0) {
            this.Y1.setValue((int) j12);
        } else {
            this.Y1.setValue((int) l10.e());
        }
        o1(false);
        this.o1.setOverScrollMode(2);
        di.b bVar = new di.b(this.a, context, h6Var);
        this.V1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.c.addView(bVar, ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ra.a(bVar);
        bVar.setOnClickListener(new p(0, context, h6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        this.c.addView(frameLayout, ma.e(-1, 100, 48));
        k1();
        this.t2.O(false);
    }

    public static void e1(y yVar, int i7) {
        yVar.Y1.f(fi.t.b(yVar.a, i7, 3), fi.t.b(yVar.a, i7, 4), true);
        yVar.m1(yVar.s2);
        yVar.n1(yVar.s2);
        yVar.j1(yVar.s2);
        yVar.g1();
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.o1, getContext(), this.a, 0, true, new b(this, 2), this.J0);
        this.t2 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.N0(2131750327, null);
    }

    @Override // org.telegram.messenger.t9
    public final void c(q9 q9Var) {
        this.h2 = q9Var;
        o1(this.s2);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        u9.c(this.a).n(this.T1, this);
        this.X1.b();
        super.dismiss();
    }

    public final void f1() {
        boolean z10 = this.s2 && !this.J;
        if (this.u2 != z10) {
            this.u2 = z10;
            di.b bVar = this.V1;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                n10.n(bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void g0(float f10) {
        super.g0(f10);
        f1();
    }

    public final void g1() {
        r rVar = this.Y1;
        int value = rVar.getValue();
        if (rVar.getProgress() > 0.99f) {
            rVar.g(gd.N0(2131750305, null));
            return;
        }
        long j3 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        if (j3 == j10) {
            rVar.g(gd.N0(2131750300, null));
            return;
        }
        if (j10 <= 0 || tL_StarGiftAuctionUserState.returned) {
            rVar.g(null);
            return;
        }
        long j11 = j3 - j10;
        if (j11 <= 0) {
            rVar.g(null);
            return;
        }
        rVar.g("+" + gd.E(j11, ','));
    }

    public final void h1(int i7) {
        if (this.v2) {
            return;
        }
        long j3 = this.h2.e.bid_amount;
        long j10 = j3 > 0 ? i7 - j3 : i7;
        if (di.y8.y(this.a, false).e && di.y8.y(this.a, false).q(null, false, false).amount < j10) {
            new fb(getContext(), this.J0, j10, 14, null, null, 0L).show();
            return;
        }
        this.v2 = true;
        this.W1.setLoading(true);
        u9.c(this.a).k(this.T1, this.i2, i7, new n(this, j3, 0));
    }

    public final void i1() {
        FrameLayout frameLayout;
        if (this.s0 == null || this.b == null || (frameLayout = this.g2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
    }

    public final void j1(boolean z10) {
        long value = this.Y1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h2.e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = 0;
        int i10 = 1;
        s sVar = this.W1;
        if (value == j3) {
            sVar.i(gd.N0(2131747637, null), z10, true);
            sVar.setOnClickListener(new m(this, i7));
            return;
        }
        nq[] nqVarArr = this.r2;
        if (j3 >= value || tL_StarGiftAuctionUserState.returned) {
            sVar.i(pb.Z0(false, gd.a0(null, null, 2131750322, gd.E(value, ',')), nqVarArr), z10, true);
        } else {
            sVar.i(pb.Z0(false, gd.a0(null, null, 2131750321, gd.E(value - j3, ',')), nqVarArr), z10, true);
        }
        sVar.setOnClickListener(new m(this, i10));
    }

    public final void k1() {
        int f10 = i0.a.f(this.p2.e, i0.a.f(this.q2.e, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.J0)), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, this.J0));
        this.c2.setTextColor(f10);
        org.telegram.ui.Components.o6 o6Var = this.d2;
        o6Var.setTextColor(f10);
        this.e2.b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.m6.H1(o6Var.getSizeableBackground(), org.telegram.ui.ActionBar.m6.r1(0.15f, f10), false)) {
            o6Var.invalidate();
        }
    }

    public final void l1(long j3, boolean z10) {
        ((org.telegram.ui.Components.o6) this.a2.b).c(j3 >= 3600 ? org.telegram.messenger.g0.j0((int) j3) : org.telegram.messenger.g0.h0((int) j3, true), z10, true);
    }

    public final void m1(boolean z10) {
        long value = this.Y1.getValue();
        q9 q9Var = this.h2;
        int i7 = q9Var.i;
        int c10 = q9Var.c(ConnectionsManager.getInstance(q9Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.h2.e.bid_amount);
        w wVar = this.e2;
        wVar.a(max, false);
        if (i7 > 0) {
            c10 = Math.min(i7, c10);
        }
        wVar.b(c10, false, z10);
        q9 q9Var2 = this.h2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var2.f;
        org.telegram.ui.Components.o6 o6Var = this.d2;
        if (tL_starGiftAuctionState != null && c10 > 0 && q9Var2.d.title != null && q9Var2.d() == 1) {
            q9 q9Var3 = this.h2;
            q9Var3.getClass();
            if (!q9Var3.g(ConnectionsManager.getInstance(j10.t0).getCurrentTime())) {
                q9 q9Var4 = this.h2;
                int i10 = q9Var4.f.last_gift_num + c10;
                if (i10 <= q9Var4.d.availability_total) {
                    o6Var.setText(this.h2.d.title + " #" + gd.E(i10, ','));
                    return;
                }
            }
        }
        o6Var.setText(null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void n0() {
        this.s2 = false;
        f1();
        gc.h(this.c);
    }

    public final void n1(boolean z10) {
        boolean z11;
        int d = this.h2.d();
        long value = this.Y1.getValue();
        long j3 = this.h2.e.bid_amount;
        org.telegram.ui.Cells.o4 o4Var = this.c2;
        boolean z12 = false;
        if (value <= j3) {
            z11 = true;
            if (d == 2) {
                o4Var.c(gd.N0(2131750352, null), z10);
            } else if (d == 3) {
                o4Var.c(gd.N0(2131750352, null), z10);
            } else if (d == 1) {
                o4Var.c(gd.N0(2131750351, null), z10);
                z11 = false;
                z12 = true;
            } else {
                o4Var.c(gd.N0(2131750354, null), z10);
            }
            this.p2.a(z12, z10);
            this.q2.a(z11, z10);
        }
        o4Var.c(gd.N0(2131750354, null), z10);
        z11 = false;
        this.p2.a(z12, z10);
        this.q2.a(z11, z10);
    }

    public final void o1(boolean z10) {
        org.telegram.ui.ActionBar.g2 Q;
        int i7;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.Z1.b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.h2.e();
        sb2.append(e10 < 1000000 ? gd.E(e10, ',') : org.telegram.messenger.g0.o0((int) e10, 1000000));
        int i10 = 0;
        o6Var.c(pb.b1(false, sb2.toString(), 0.78f, this.n2), z10, true);
        if (this.h2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g10 = this.h2.g(currentTime);
            bg.r rVar = this.X1;
            if (g10) {
                long max = Math.max(0, this.h2.f.start_date - currentTime);
                rVar.a(max);
                l1(max, z10);
            } else {
                long max2 = Math.max(0, this.h2.f.next_round_at - currentTime);
                rVar.a(max2);
                l1(max2, z10);
            }
            org.telegram.ui.Components.y5 y5Var = this.o2;
            ai.l0 l0Var = this.b2;
            if (y5Var == null && this.h2.d.sticker != null) {
                this.o2 = new org.telegram.ui.Components.y5(this.h2.d.sticker.id, ((org.telegram.ui.Components.o6) l0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.o2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.o2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) gd.E(this.h2.f.gifts_left, ','));
            ((org.telegram.ui.Components.o6) l0Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.a2.c;
            q9 q9Var = this.h2;
            q9Var.getClass();
            if (q9Var.g(ConnectionsManager.getInstance(j10.t0).getCurrentTime())) {
                i7 = 2131750355;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.h2.f;
                i7 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750357 : 2131750356;
            }
            textView.setText(gd.N0(i7, null));
            w[] wVarArr = this.f2;
            int min = Math.min(wVarArr.length, this.h2.f.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.h2.f.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User c22 = mp.u1(this.a).c2(l10);
                    if (c22 != null) {
                        wVarArr[i11].c(c22);
                    }
                    wVarArr[i11].a(this.h2.b(i12), z10);
                    wVarArr[i11].setOnClickListener(new q(this, longValue, i10));
                    i11 = i12;
                }
            }
        }
        q9 q9Var2 = this.h2;
        long b10 = q9Var2.b(q9Var2.d.gifts_per_round) + 1;
        r rVar2 = this.Y1;
        rVar2.setStarsTop(b10);
        rVar2.setTopText(gd.G(this.h2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        m1(z10);
        n1(z10);
        j1(z10);
        g1();
        long o4 = org.telegram.messenger.n5.o(this.h2.e.peer);
        long j3 = this.h2.e.acquired_count;
        if (this.l2 < j3 && !this.m2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.k2;
            if (j10 != 0) {
                bn ua2 = bn.ua(j10);
                ua2.whenFullyVisible(new i(ua2, i10));
                Q.presentFragment(ua2);
                Runnable runnable = this.j2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.k2 = o4;
        }
        this.l2 = j3;
        this.m2 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            if (this.c2 == null || this.d2 == null || this.e2 == null) {
                return;
            }
            k1();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.s2 = true;
        f1();
        gc.a(this.c, new t(0));
    }
}
