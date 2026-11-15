package bi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.cb;
import di.mb;
import di.v8;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y extends ja implements u9 {
    public static final /* synthetic */ int w2 = 0;
    public final long T1;
    public final b41 U1;
    public final di.b V1;
    public final s W1;
    public final bg.q X1;
    public final r Y1;
    public final ai.j0 Z1;
    public final ai.j0 a2;
    public final ai.j0 b2;
    public final org.telegram.ui.Cells.n4 c2;
    public final org.telegram.ui.Components.h6 d2;
    public final w e2;
    public final w[] f2;
    public final FrameLayout g2;
    public r9 h2;
    public final x i2;
    public Runnable j2;
    public long k2;
    public long l2;
    public boolean m2;
    public final eq[] n2;
    public org.telegram.ui.Components.p5 o2;
    public final te.a p2;
    public final te.a q2;
    public final eq[] r2;
    public boolean s2;
    public p41 t2;
    public boolean u2;
    public boolean v2;

    public y(Context context, org.telegram.ui.ActionBar.e6 e6Var, x xVar, r9 r9Var) {
        super(context, null, false, false, 2, e6Var);
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f2 = new w[3];
        this.m2 = true;
        this.n2 = new eq[1];
        h hVar = new h(this);
        er erVar = er.h;
        int i7 = 0;
        this.p2 = new te.a(0, hVar, erVar, 380L, false);
        this.q2 = new te.a(0, new h(this), erVar, 380L, false);
        this.r2 = new eq[1];
        this.h2 = r9Var;
        this.i2 = xVar;
        long j3 = r9Var.b;
        this.T1 = j3;
        this.M1 = true;
        this.v1 = 0.2f;
        r9 l10 = v9.c(this.a).l(j3, this);
        this.X1 = new bg.q(new h(this));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        m0.d1(this.p1, context, e6Var, l10.d);
        TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(m10.i(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U1 = b41.j(-1, linearLayout);
        r rVar = new r(this, context, e6Var);
        this.Y1 = rVar;
        rVar.P = true;
        this.h2.e();
        r9 r9Var2 = this.h2;
        long j10 = r9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f;
        long j11 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : r9Var2.f.bid_levels.get(0).amount;
        int i10 = j11 > 100000 ? ((((int) j11) * 3) / 2000) * 1000 : j11 > 30000 ? 100000 : 50000;
        int i11 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 >= 50) {
                z10 = i13 == 50 ? false : z10;
                if (i13 <= i10) {
                    arrayList2.add(Integer.valueOf(i13));
                    if (iArr[i12] == i10) {
                        break;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(i10));
                    break;
                }
            } else {
                z10 = true;
            }
            i12++;
            i11 = 15;
        }
        if (z10) {
            arrayList2.add(0, 50);
        }
        int i14 = 2;
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            iArr2[i15] = ((Integer) arrayList2.get(i15)).intValue();
        }
        r rVar2 = this.Y1;
        rVar2.f0 = iArr2;
        linearLayout.addView(rVar2, c8.ja.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ai.j0 j0Var = new ai.j0(context, e6Var);
        this.Z1 = j0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i16 = org.telegram.ui.ActionBar.j6.a7;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i16, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0), org.telegram.ui.ActionBar.j6.w0(i16, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
        j0Var.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(j0Var, k02, M, null, e6Var);
        j0Var.setOnClickListener(new m(this, i14));
        ((TextView) j0Var.c).setText(hd.M0(2131750375, null));
        ai.j0 j0Var2 = new ai.j0(context, e6Var);
        this.a2 = j0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(i16, this.J0));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
        j0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(j0Var2, d02, M2, null, e6Var);
        ((TextView) j0Var2.c).setText(hd.M0(2131750373, null));
        ai.j0 j0Var3 = new ai.j0(context, e6Var);
        this.b2 = j0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(i16, this.J0));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i16);
        j0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(j0Var3, d03, M3, null, e6Var);
        ((TextView) j0Var3.c).setText(hd.M0(2131750376, null));
        linearLayout2.addView(j0Var, c8.ja.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), c8.ja.l(0.0f, 10, -1));
        linearLayout2.addView(j0Var2, c8.ja.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), c8.ja.l(0.0f, 10, -1));
        linearLayout2.addView(j0Var3, c8.ja.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, c8.ja.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.e.acquired_count > 0) {
            z70 z70Var = new z70(context, e6Var);
            z70Var.setGravity(17);
            z70Var.setTextSize(1, 16.0f);
            int i17 = org.telegram.ui.ActionBar.j6.J6;
            org.telegram.ui.ActionBar.q6.U(z70Var, i17, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var, i17, e6Var);
            z70Var.setOnClickListener(new ah.g(this, new boolean[1], e6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(l10.c, z70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(hd.F("Gift2AuctionsItemsBought2", l10.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            na.b(z70Var, 0.02f, 1.5f);
            linearLayout.addView(z70Var, c8.ja.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i18 = org.telegram.ui.ActionBar.j6.L6;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, i18, 21, 0, 0, false, true, e6Var);
        this.c2 = n4Var;
        linearLayout.addView(n4Var, c8.ja.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.d2 = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        h6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        h6Var.setSizeableBackground(org.telegram.ui.ActionBar.j6.b0(0, 0, 9, 9));
        h6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new a3.f(this, 17));
        n4Var.addView(h6Var, c8.ja.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        w wVar = new w(context, e6Var);
        this.e2 = wVar;
        org.telegram.ui.Components.h6 h6Var2 = wVar.b;
        org.telegram.ui.ActionBar.q6.q(h6Var2);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i18, this.J0));
        wVar.c(a22);
        linearLayout.addView(wVar, c8.ja.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, i18, 21, 15, 0, false, false, e6Var);
        n4Var2.setText(hd.M0(2131750320, null));
        linearLayout.addView(n4Var2, c8.ja.o(-1, -2));
        int i19 = 0;
        while (true) {
            w[] wVarArr = this.f2;
            if (i19 >= wVarArr.length) {
                break;
            }
            wVarArr[i19] = new w(context, e6Var);
            int i20 = i19 + 1;
            this.f2[i19].b(i20, true, false);
            this.f2[i19].setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            w wVar2 = this.f2[i19];
            wVar2.f = i19 < 2;
            wVar2.setOnClickListener(new o(i7));
            linearLayout.addView(this.f2[i19], c8.ja.o(-1, -2));
            i19 = i20;
        }
        s sVar = new s(0, context, e6Var, true);
        this.W1 = sVar;
        sVar.f();
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i21 = d.leftMargin;
        int i22 = this.u0;
        d.leftMargin = i21 + i22;
        d.rightMargin += i22;
        this.b.addView(sVar, d);
        uj0 uj0Var = this.o1;
        int i23 = this.u0;
        uj0Var.setPadding(i23, 0, i23, org.telegram.messenger.g0.L(64.0f));
        this.o1.setOnItemClickListener(new a(1));
        long j12 = l10.e.bid_amount;
        if (j12 > 0) {
            this.Y1.setValue((int) j12);
        } else {
            this.Y1.setValue((int) l10.e());
        }
        n1(false);
        this.o1.setOverScrollMode(2);
        di.b bVar = new di.b(this.a, context, e6Var);
        this.V1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.c.addView(bVar, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        na.a(bVar);
        bVar.setOnClickListener(new p(0, context, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        this.c.addView(frameLayout, c8.ja.e(-1, 100, 48));
        j1();
        this.t2.O(false);
    }

    public static void d1(y yVar, int i7) {
        yVar.Y1.f(fi.t.b(yVar.a, i7, 3), fi.t.b(yVar.a, i7, 4), true);
        yVar.l1(yVar.s2);
        yVar.m1(yVar.s2);
        yVar.i1(yVar.s2);
        yVar.f1();
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new b(this, 2), this.J0);
        this.t2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131750344, null);
    }

    @Override // org.telegram.messenger.u9
    public final void c(r9 r9Var) {
        this.h2 = r9Var;
        n1(this.s2);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        v9.c(this.a).n(this.T1, this);
        this.X1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z10 = this.s2 && !this.J;
        if (this.u2 != z10) {
            this.u2 = z10;
            di.b bVar = this.V1;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                i20.m(bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void f1() {
        r rVar = this.Y1;
        int value = rVar.getValue();
        if (rVar.getProgress() > 0.99f) {
            rVar.g(hd.M0(2131750322, null));
            return;
        }
        long j3 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        if (j3 == j10) {
            rVar.g(hd.M0(2131750317, null));
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
        rVar.g("+" + hd.E(j11, ','));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    public final void g1(int i7) {
        if (this.v2) {
            return;
        }
        long j3 = this.h2.e.bid_amount;
        long j10 = j3 > 0 ? i7 - j3 : i7;
        if (v8.y(this.a, false).e && v8.y(this.a, false).q(null, false, false).amount < j10) {
            new cb(getContext(), this.J0, j10, 14, null, null, 0L).show();
            return;
        }
        this.v2 = true;
        this.W1.setLoading(true);
        v9.c(this.a).k(this.T1, this.i2, i7, new n(this, j3, 0));
    }

    public final void h1() {
        FrameLayout frameLayout;
        if (this.s0 == null || this.b == null || (frameLayout = this.g2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
    }

    public final void i1(boolean z10) {
        long value = this.Y1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h2.e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = 0;
        int i10 = 1;
        s sVar = this.W1;
        if (value == j3) {
            sVar.i(hd.M0(2131747831, null), z10, true);
            sVar.setOnClickListener(new m(this, i7));
            return;
        }
        eq[] eqVarArr = this.r2;
        if (j3 >= value || tL_StarGiftAuctionUserState.returned) {
            sVar.i(mb.Y0(false, hd.a0(null, null, 2131750339, hd.E(value, ',')), eqVarArr), z10, true);
        } else {
            sVar.i(mb.Y0(false, hd.a0(null, null, 2131750338, hd.E(value - j3, ',')), eqVarArr), z10, true);
        }
        sVar.setOnClickListener(new m(this, i10));
    }

    public final void j1() {
        int f10 = i0.a.f(this.p2.e, i0.a.f(this.q2.e, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, this.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, this.J0)), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, this.J0));
        this.c2.setTextColor(f10);
        org.telegram.ui.Components.h6 h6Var = this.d2;
        h6Var.setTextColor(f10);
        this.e2.b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.j6.H1(h6Var.getSizeableBackground(), org.telegram.ui.ActionBar.j6.r1(0.15f, f10), false)) {
            h6Var.invalidate();
        }
    }

    public final void k1(long j3, boolean z10) {
        ((org.telegram.ui.Components.h6) this.a2.b).c(j3 >= 3600 ? org.telegram.messenger.g0.j0((int) j3) : org.telegram.messenger.g0.h0((int) j3, true), z10, true);
    }

    public final void l1(boolean z10) {
        long value = this.Y1.getValue();
        r9 r9Var = this.h2;
        int i7 = r9Var.i;
        int c10 = r9Var.c(ConnectionsManager.getInstance(r9Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.h2.e.bid_amount);
        w wVar = this.e2;
        wVar.a(max, false);
        if (i7 > 0) {
            c10 = Math.min(i7, c10);
        }
        wVar.b(c10, false, z10);
        r9 r9Var2 = this.h2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f;
        org.telegram.ui.Components.h6 h6Var = this.d2;
        if (tL_starGiftAuctionState != null && c10 > 0 && r9Var2.d.title != null && r9Var2.d() == 1) {
            r9 r9Var3 = this.h2;
            r9Var3.getClass();
            if (!r9Var3.g(ConnectionsManager.getInstance(m10.t0).getCurrentTime())) {
                r9 r9Var4 = this.h2;
                int i10 = r9Var4.f.last_gift_num + c10;
                if (i10 <= r9Var4.d.availability_total) {
                    h6Var.setText(this.h2.d.title + " #" + hd.E(i10, ','));
                    return;
                }
            }
        }
        h6Var.setText(null);
    }

    public final void m1(boolean z10) {
        boolean z11;
        int d = this.h2.d();
        long value = this.Y1.getValue();
        long j3 = this.h2.e.bid_amount;
        org.telegram.ui.Cells.n4 n4Var = this.c2;
        boolean z12 = false;
        if (value <= j3) {
            z11 = true;
            if (d == 2) {
                n4Var.c(hd.M0(2131750369, null), z10);
            } else if (d == 3) {
                n4Var.c(hd.M0(2131750369, null), z10);
            } else if (d == 1) {
                n4Var.c(hd.M0(2131750368, null), z10);
                z11 = false;
                z12 = true;
            } else {
                n4Var.c(hd.M0(2131750371, null), z10);
            }
            this.p2.a(z12, z10);
            this.q2.a(z11, z10);
        }
        n4Var.c(hd.M0(2131750371, null), z10);
        z11 = false;
        this.p2.a(z12, z10);
        this.q2.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void n0() {
        this.s2 = false;
        e1();
        xb.h(this.c);
    }

    public final void n1(boolean z10) {
        org.telegram.ui.ActionBar.e2 Q;
        int i7;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.Z1.b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.h2.e();
        sb2.append(e10 < 1000000 ? hd.E(e10, ',') : org.telegram.messenger.g0.o0((int) e10, 1000000));
        int i10 = 0;
        h6Var.c(mb.a1(false, sb2.toString(), 0.78f, this.n2), z10, true);
        if (this.h2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g10 = this.h2.g(currentTime);
            bg.q qVar = this.X1;
            if (g10) {
                long max = Math.max(0, this.h2.f.start_date - currentTime);
                qVar.a(max);
                k1(max, z10);
            } else {
                long max2 = Math.max(0, this.h2.f.next_round_at - currentTime);
                qVar.a(max2);
                k1(max2, z10);
            }
            org.telegram.ui.Components.p5 p5Var = this.o2;
            ai.j0 j0Var = this.b2;
            if (p5Var == null && this.h2.d.sticker != null) {
                this.o2 = new org.telegram.ui.Components.p5(this.h2.d.sticker.id, ((org.telegram.ui.Components.h6) j0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.o2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.o2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) hd.E(this.h2.f.gifts_left, ','));
            ((org.telegram.ui.Components.h6) j0Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.a2.c;
            r9 r9Var = this.h2;
            r9Var.getClass();
            if (r9Var.g(ConnectionsManager.getInstance(m10.t0).getCurrentTime())) {
                i7 = 2131750372;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.h2.f;
                i7 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750374 : 2131750373;
            }
            textView.setText(hd.M0(i7, null));
            w[] wVarArr = this.f2;
            int min = Math.min(wVarArr.length, this.h2.f.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.h2.f.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User a22 = np.s1(this.a).a2(l10);
                    if (a22 != null) {
                        wVarArr[i11].c(a22);
                    }
                    wVarArr[i11].a(this.h2.b(i12), z10);
                    wVarArr[i11].setOnClickListener(new q(this, longValue, i10));
                    i11 = i12;
                }
            }
        }
        r9 r9Var2 = this.h2;
        long b10 = r9Var2.b(r9Var2.d.gifts_per_round) + 1;
        r rVar = this.Y1;
        rVar.setStarsTop(b10);
        rVar.setTopText(hd.G(this.h2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z10);
        m1(z10);
        i1(z10);
        f1();
        long o4 = org.telegram.messenger.m5.o(this.h2.e.peer);
        long j3 = this.h2.e.acquired_count;
        if (this.l2 < j3 && !this.m2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.k2;
            if (j10 != 0) {
                an ua2 = an.ua(j10);
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

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            if (this.c2 == null || this.d2 == null || this.e2 == null) {
                return;
            }
            j1();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        this.s2 = true;
        e1();
        xb.a(this.c, new t(0));
    }
}
