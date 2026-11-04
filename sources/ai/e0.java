package ai;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.e9;
import ci.mb;
import ci.wb;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m9;
import org.telegram.messenger.p9;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e0 extends ma implements p9 {
    public static final /* synthetic */ int t2 = 0;
    public final long Q1;
    public final r31 R1;
    public final ci.c S1;
    public final x T1;
    public final cg.p U1;
    public final w V1;
    public final c0 W1;
    public final c0 X1;
    public final c0 Y1;
    public final org.telegram.ui.Cells.n4 Z1;
    public final org.telegram.ui.Components.h6 a2;
    public final b0 b2;
    public final b0[] c2;
    public final FrameLayout d2;
    public m9 e2;
    public final d0 f2;
    public Runnable g2;
    public long h2;
    public long i2;
    public boolean j2;
    public final wp[] k2;
    public org.telegram.ui.Components.p5 l2;
    public final qe.a m2;
    public final qe.a n2;
    public final wp[] o2;
    public boolean p2;
    public f41 q2;
    public boolean r2;
    public boolean s2;

    public e0(Context context, org.telegram.ui.ActionBar.e6 e6Var, d0 d0Var, m9 m9Var) {
        super(context, null, false, false, 2, e6Var);
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.c2 = new b0[3];
        this.j2 = true;
        this.k2 = new wp[1];
        k kVar = new k(this);
        xq xqVar = xq.h;
        int i3 = 0;
        this.m2 = new qe.a(0, kVar, xqVar, 380L, false);
        this.n2 = new qe.a(0, new k(this), xqVar, 380L, false);
        this.o2 = new wp[1];
        this.e2 = m9Var;
        this.f2 = d0Var;
        long j10 = m9Var.b;
        this.Q1 = j10;
        this.J1 = true;
        this.s1 = 0.2f;
        m9 l10 = q9.c(this.a).l(j10, this);
        this.U1 = new cg.p(new k(this));
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        N();
        s0.d1(this.m1, context, e6Var, l10.d);
        TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(h10.i(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.R1 = r31.j(-1, linearLayout);
        w wVar = new w(this, context, e6Var);
        this.V1 = wVar;
        wVar.P = true;
        this.e2.e();
        m9 m9Var2 = this.e2;
        long j11 = m9Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var2.f;
        long j12 = (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) ? 0L : m9Var2.f.bid_levels.get(0).amount;
        int i10 = j12 > 100000 ? ((((int) j12) * 3) / 2000) * 1000 : j12 > 30000 ? 100000 : 50000;
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
        w wVar2 = this.V1;
        wVar2.f0 = iArr2;
        linearLayout.addView(wVar2, mf.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        c0 c0Var = new c0(context, e6Var);
        this.W1 = c0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i16 = org.telegram.ui.ActionBar.k6.a7;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i16, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0), org.telegram.ui.ActionBar.k6.w0(i16, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        c0Var.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(c0Var, k02, N, null, e6Var);
        c0Var.setOnClickListener(new q(this, i14));
        ((TextView) c0Var.c).setText(bd.M0(2131750383, null));
        c0 c0Var2 = new c0(context, e6Var);
        this.X1 = c0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.w0(i16, this.J0));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
        c0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(c0Var2, d02, N2, null, e6Var);
        ((TextView) c0Var2.c).setText(bd.M0(2131750381, null));
        c0 c0Var3 = new c0(context, e6Var);
        this.Y1 = c0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.w0(i16, this.J0));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        c0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(c0Var3, d03, N3, null, e6Var);
        ((TextView) c0Var3.c).setText(bd.M0(2131750384, null));
        linearLayout2.addView(c0Var, mf.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), mf.l(0.0f, 10, -1));
        linearLayout2.addView(c0Var2, mf.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), mf.l(0.0f, 10, -1));
        linearLayout2.addView(c0Var3, mf.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, mf.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.e.acquired_count > 0) {
            s70 s70Var = new s70(context, e6Var);
            s70Var.setGravity(17);
            s70Var.setTextSize(1, 16.0f);
            int i17 = org.telegram.ui.ActionBar.k6.J6;
            org.telegram.ui.ActionBar.r6.V(s70Var, i17, e6Var);
            org.telegram.ui.ActionBar.r6.H(s70Var, i17, e6Var);
            s70Var.setOnClickListener(new h(this, new boolean[1], e6Var, 1));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(l10.c, s70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(bd.F("Gift2AuctionsItemsBought2", l10.e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            pf.b(s70Var, 0.02f, 1.5f);
            linearLayout.addView(s70Var, mf.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i18 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, i18, 21, 0, 0, false, true, e6Var);
        this.Z1 = n4Var;
        linearLayout.addView(n4Var, mf.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.a2 = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        h6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        h6Var.setSizeableBackground(org.telegram.ui.ActionBar.k6.b0(0, 0, 9, 9));
        h6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new s(this, 0));
        n4Var.addView(h6Var, mf.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        b0 b0Var = new b0(context, e6Var);
        this.b2 = b0Var;
        org.telegram.ui.Components.h6 h6Var2 = b0Var.b;
        org.telegram.ui.ActionBar.r6.r(h6Var2);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i18, this.J0));
        b0Var.c(a22);
        linearLayout.addView(b0Var, mf.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, i18, 21, 15, 0, false, false, e6Var);
        n4Var2.setText(bd.M0(2131750328, null));
        linearLayout.addView(n4Var2, mf.o(-1, -2));
        int i19 = 0;
        while (true) {
            b0[] b0VarArr = this.c2;
            if (i19 >= b0VarArr.length) {
                break;
            }
            b0VarArr[i19] = new b0(context, e6Var);
            int i20 = i19 + 1;
            this.c2[i19].b(i20, true, false);
            this.c2[i19].setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            b0 b0Var2 = this.c2[i19];
            b0Var2.f = i19 < 2;
            b0Var2.setOnClickListener(new t(i3));
            linearLayout.addView(this.c2[i19], mf.o(-1, -2));
            i19 = i20;
        }
        x xVar = new x(0, context, e6Var, true);
        this.T1 = xVar;
        xVar.f();
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i21 = d.leftMargin;
        int i22 = this.u0;
        d.leftMargin = i21 + i22;
        d.rightMargin += i22;
        this.b.addView(xVar, d);
        tj0 tj0Var = this.l1;
        int i23 = this.u0;
        tj0Var.setPadding(i23, 0, i23, org.telegram.messenger.g0.L(64.0f));
        this.l1.setOnItemClickListener(new a(1));
        long j13 = l10.e.bid_amount;
        if (j13 > 0) {
            this.V1.setValue((int) j13);
        } else {
            this.V1.setValue((int) l10.e());
        }
        n1(false);
        this.l1.setOverScrollMode(2);
        ci.c cVar = new ci.c(this.a, context, e6Var);
        this.S1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.c.addView(cVar, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        pf.a(cVar);
        cVar.setOnClickListener(new u(0, context, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        this.c.addView(frameLayout, mf.e(-1, 100, 48));
        j1();
        this.q2.O(false);
    }

    public static void d1(e0 e0Var, int i3) {
        e0Var.V1.f(ei.u.b(e0Var.a, i3, 3), ei.u.b(e0Var.a, i3, 4), true);
        e0Var.l1(e0Var.p2);
        e0Var.m1(e0Var.p2);
        e0Var.i1(e0Var.p2);
        e0Var.f1();
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new c(this, 2), this.J0);
        this.q2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131750352, null);
    }

    @Override // org.telegram.messenger.p9
    public final void c(m9 m9Var) {
        this.e2 = m9Var;
        n1(this.p2);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        q9.c(this.a).n(this.Q1, this);
        this.U1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z10 = this.p2 && !this.J;
        if (this.r2 != z10) {
            this.r2 = z10;
            ci.c cVar = this.S1;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void f1() {
        w wVar = this.V1;
        int value = wVar.getValue();
        if (wVar.getProgress() > 0.99f) {
            wVar.g(bd.M0(2131750330, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e2.e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            wVar.g(bd.M0(2131750325, null));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            wVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            wVar.g(null);
            return;
        }
        wVar.g("+" + bd.E(j12, ','));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    public final void g1(int i3) {
        if (this.s2) {
            return;
        }
        long j10 = this.e2.e.bid_amount;
        long j11 = j10 > 0 ? i3 - j10 : i3;
        if (e9.y(this.a, false).e && e9.y(this.a, false).q(null, false, false).amount < j11) {
            new mb(getContext(), this.J0, j11, 14, null, null, 0L).show();
            return;
        }
        this.s2 = true;
        this.T1.setLoading(true);
        q9.c(this.a).k(this.Q1, this.f2, i3, new r(this, j10, 0));
    }

    public final void h1() {
        FrameLayout frameLayout;
        if (this.s0 == null || this.b == null || (frameLayout = this.d2) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
    }

    public final void i1(boolean z10) {
        long value = this.V1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e2.e;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i3 = 0;
        int i10 = 1;
        x xVar = this.T1;
        if (value == j10) {
            xVar.i(bd.M0(2131747839, null), z10, true);
            xVar.setOnClickListener(new q(this, i3));
            return;
        }
        wp[] wpVarArr = this.o2;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            xVar.i(wb.Y0(false, bd.a0(null, null, 2131750347, bd.E(value, ',')), wpVarArr), z10, true);
        } else {
            xVar.i(wb.Y0(false, bd.a0(null, null, 2131750346, bd.E(value - j10, ',')), wpVarArr), z10, true);
        }
        xVar.setOnClickListener(new q(this, i10));
    }

    public final void j1() {
        int f10 = i0.a.f(this.m2.e, i0.a.f(this.n2.e, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.J0)), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, this.J0));
        this.Z1.setTextColor(f10);
        org.telegram.ui.Components.h6 h6Var = this.a2;
        h6Var.setTextColor(f10);
        this.b2.b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.k6.H1(h6Var.getSizeableBackground(), org.telegram.ui.ActionBar.k6.r1(0.15f, f10), false)) {
            h6Var.invalidate();
        }
    }

    public final void k1(long j10, boolean z10) {
        ((org.telegram.ui.Components.h6) this.X1.b).c(j10 >= 3600 ? org.telegram.messenger.g0.j0((int) j10) : org.telegram.messenger.g0.h0((int) j10, true), z10, true);
    }

    public final void l1(boolean z10) {
        long value = this.V1.getValue();
        m9 m9Var = this.e2;
        int i3 = m9Var.i;
        int c2 = m9Var.c(ConnectionsManager.getInstance(m9Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.e2.e.bid_amount);
        b0 b0Var = this.b2;
        b0Var.a(max, false);
        if (i3 > 0) {
            c2 = Math.min(i3, c2);
        }
        b0Var.b(c2, false, z10);
        m9 m9Var2 = this.e2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var2.f;
        org.telegram.ui.Components.h6 h6Var = this.a2;
        if (tL_starGiftAuctionState != null && c2 > 0 && m9Var2.d.title != null && m9Var2.d() == 1) {
            m9 m9Var3 = this.e2;
            m9Var3.getClass();
            if (!m9Var3.g(ConnectionsManager.getInstance(h10.t0).getCurrentTime())) {
                m9 m9Var4 = this.e2;
                int i10 = m9Var4.f.last_gift_num + c2;
                if (i10 <= m9Var4.d.availability_total) {
                    h6Var.setText(this.e2.d.title + " #" + bd.E(i10, ','));
                    return;
                }
            }
        }
        h6Var.setText(null);
    }

    public final void m1(boolean z10) {
        boolean z11;
        int d = this.e2.d();
        long value = this.V1.getValue();
        long j10 = this.e2.e.bid_amount;
        org.telegram.ui.Cells.n4 n4Var = this.Z1;
        boolean z12 = false;
        if (value <= j10) {
            z11 = true;
            if (d == 2) {
                n4Var.c(bd.M0(2131750377, null), z10);
            } else if (d == 3) {
                n4Var.c(bd.M0(2131750377, null), z10);
            } else if (d == 1) {
                n4Var.c(bd.M0(2131750376, null), z10);
                z11 = false;
                z12 = true;
            } else {
                n4Var.c(bd.M0(2131750379, null), z10);
            }
            this.m2.a(z12, z10);
            this.n2.a(z11, z10);
        }
        n4Var.c(bd.M0(2131750379, null), z10);
        z11 = false;
        this.m2.a(z12, z10);
        this.n2.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void n0() {
        this.p2 = false;
        e1();
        ac.h(this.c);
    }

    public final void n1(boolean z10) {
        org.telegram.ui.ActionBar.d2 Q;
        int i3;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.W1.b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.e2.e();
        sb2.append(e10 < 1000000 ? bd.E(e10, ',') : org.telegram.messenger.g0.o0((int) e10, 1000000));
        int i10 = 0;
        h6Var.c(wb.a1(false, sb2.toString(), 0.78f, this.k2), z10, true);
        if (this.e2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g7 = this.e2.g(currentTime);
            cg.p pVar = this.U1;
            if (g7) {
                long max = Math.max(0, this.e2.f.start_date - currentTime);
                pVar.a(max);
                k1(max, z10);
            } else {
                long max2 = Math.max(0, this.e2.f.next_round_at - currentTime);
                pVar.a(max2);
                k1(max2, z10);
            }
            org.telegram.ui.Components.p5 p5Var = this.l2;
            c0 c0Var = this.Y1;
            if (p5Var == null && this.e2.d.sticker != null) {
                this.l2 = new org.telegram.ui.Components.p5(this.e2.d.sticker.id, ((org.telegram.ui.Components.h6) c0Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.l2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.l2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) bd.E(this.e2.f.gifts_left, ','));
            ((org.telegram.ui.Components.h6) c0Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.X1.c;
            m9 m9Var = this.e2;
            m9Var.getClass();
            if (m9Var.g(ConnectionsManager.getInstance(h10.t0).getCurrentTime())) {
                i3 = 2131750380;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.e2.f;
                i3 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? 2131750382 : 2131750381;
            }
            textView.setText(bd.M0(i3, null));
            b0[] b0VarArr = this.c2;
            int min = Math.min(b0VarArr.length, this.e2.f.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.e2.f.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User a22 = hp.s1(this.a).a2(l10);
                    if (a22 != null) {
                        b0VarArr[i11].c(a22);
                    }
                    b0VarArr[i11].a(this.e2.b(i12), z10);
                    b0VarArr[i11].setOnClickListener(new v(this, longValue, i10));
                    i11 = i12;
                }
            }
        }
        m9 m9Var2 = this.e2;
        long b10 = m9Var2.b(m9Var2.d.gifts_per_round) + 1;
        w wVar = this.V1;
        wVar.setStarsTop(b10);
        wVar.setTopText(bd.G(this.e2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z10);
        m1(z10);
        i1(z10);
        f1();
        long o10 = org.telegram.messenger.m5.o(this.e2.e.peer);
        long j10 = this.e2.e.acquired_count;
        if (this.i2 < j10 && !this.j2 && (Q = LaunchActivity.Q()) != null) {
            long j11 = this.h2;
            if (j11 != 0) {
                wm ra2 = wm.ra(j11);
                ra2.whenFullyVisible(new l(ra2, i10));
                Q.presentFragment(ra2);
                Runnable runnable = this.g2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o10 != 0) {
            this.h2 = o10;
        }
        this.i2 = j10;
        this.j2 = false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            if (this.Z1 == null || this.a2 == null || this.b2 == null) {
                return;
            }
            j1();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.p2 = true;
        e1();
        ac.a(this.c, new y(0));
    }
}
