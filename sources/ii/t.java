package ii;

import ai.g1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.e2;
import bi.e3;
import bi.g8;
import bi.k8;
import bi.m3;
import bi.u1;
import c8.ma;
import di.e0;
import di.ob;
import di.pb;
import di.ua;
import di.v6;
import di.y8;
import hi.d7;
import hi.w4;
import j$.util.Objects;
import java.util.ArrayList;
import ki.h3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.d61;
import org.telegram.ui.r00;
import org.telegram.ui.s00;
import org.telegram.ui.uv;
import ug.t1;
import v4.c0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class t extends s00 implements gs {
    public FrameLayout S;
    public m7 T;
    public ob U;
    public tt0 V;
    public m3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public m3 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public o6 l0;
    public o6 m0;
    public e3 n0;
    public hi.e o0;
    public d61 p0;
    public hi.e q0;
    public hi.e r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public g8 v0;
    public int b0 = -1;
    public final hi.l g0 = new hi.l(this, 25);

    public t() {
        boolean z10;
        t0.u();
        if (s2.a()) {
            z10 = true;
        } else {
            t0.r();
            z10 = false;
        }
        this.i0 = z10;
        this.N = true;
    }

    public static void A0(t tVar, int i7) {
        o41 G;
        g8 g8Var = tVar.v0;
        if (g8Var == null || (G = g8Var.G(i7)) == null) {
            return;
        }
        int i10 = G.d;
        if (i10 == -1) {
            tVar.v0.O(true);
            return;
        }
        if (i10 == -2) {
            y8.y(tVar.currentAccount, true).u();
            e2.l1(true, v1.a(tVar.currentAccount).b());
        } else if (i10 == -3) {
            y8.y(tVar.currentAccount, true).U();
            tVar.v0.O(true);
        } else if (i10 == -4) {
            if (np.u1(tVar.currentAccount).A2()) {
                org.telegram.ui.b.b(tVar.currentAccount);
            } else {
                tVar.presentFragment(new h3(tVar.getUserConfig().e()));
            }
        }
    }

    public final void D0() {
        G0();
        ek0 ek0Var = this.c;
        if (ek0Var == null || this.V == null || ek0Var.getLayoutParams() == null) {
            return;
        }
        int D = o10.D(48.0f, this.c0, -g0.L(8.0f));
        int D2 = o10.D(48.0f, this.d0, -g0.L(8.0f));
        g0.z3(this.c, 0, D, 0, D2);
        ek0 ek0Var2 = this.c;
        int i7 = -D;
        ek0Var2.setPadding(ek0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.d0 - D2);
        this.V.z(i7, -D2);
    }

    public final void E0(ArrayList arrayList, c51 c51Var) {
        ek0 ek0Var;
        tt0 tt0Var = this.V;
        boolean z10 = tt0Var != null && tt0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        y8 y10 = y8.y(this.currentAccount, true);
        uv uvVar = (uv) super.o0(getParentActivity());
        o41 o41Var = new o41(-2);
        o41Var.c = uvVar;
        arrayList.add(o41Var);
        arrayList.add(o41.k(this.j0));
        boolean z11 = this.i0;
        if (z11 && !n.c(this.currentAccount)) {
            arrayList.add(o41.C(hd.N0(2131749338, null)));
        }
        boolean M = y10.M(0);
        this.s0 = M;
        if (!M) {
            arrayList.add(o41.m(this.h0));
            return;
        }
        if (!z11 || n.c(this.currentAccount)) {
            arrayList.add(o41.C(null));
        }
        this.b0 = arrayList.size();
        arrayList.add(o41.n(this.W, -2));
        if (!z10 || (ek0Var = this.c) == null) {
            return;
        }
        hi.l lVar = this.g0;
        ek0Var.removeCallbacks(lVar);
        this.c.post(lVar);
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 1;
        y8 y10 = y8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().A7.l.b).a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) pb.M0(p10, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.m0.setText("≈" + r1.i().f(i10, "USD"));
        } else {
            this.m0.setText(hd.N0(2131742523, null));
        }
        final int i11 = 0;
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), false);
        if (this.u0) {
            return;
        }
        final boolean z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.t0 == z10) {
            return;
        }
        this.t0 = z10;
        this.n0.setVisibility(0);
        this.p0.setVisibility(0);
        this.n0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ii.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z10) {
                            this.b.n0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.p0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        this.p0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ii.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        if (z10) {
                            this.b.n0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.p0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void G0() {
        if (this.X == null) {
            return;
        }
        int L = g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        H0();
    }

    public final void H0() {
        View view = this.X;
        if (view == null) {
            return;
        }
        te.a aVar = this.Y;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.Z;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * g0.L(44.0f)));
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        final int i7 = 0;
        this.H = false;
        this.F = g0.L(238.0f);
        tt0 tt0Var = new tt0(context);
        this.V = tt0Var;
        final int i10 = 1;
        tt0Var.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            r4 r4Var = this.parentLayout;
            this.c0 = (r4Var == null || !((ActionBarLayout) r4Var).T0) ? g0.m : 0;
            this.d0 = g0.n;
        }
        int i11 = 4;
        this.V.setGeometry(new w4(this, i11));
        this.V.z(-o10.D(48.0f, this.c0, -g0.L(8.0f)), -o10.D(48.0f, this.d0, -g0.L(8.0f)));
        tt0 tt0Var2 = this.V;
        tt0Var2.getClass();
        this.W = new m3(26, context, tt0Var2);
        this.U = new ob(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new m3(i11, context, this);
        super.createView(context);
        r00 r00Var = this.s;
        getBaseSimpleGlass().f(r00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        final int i12 = 2;
        getBaseSimpleGlass().o = new di.f(i12, this, new di.e(i12, r00Var));
        View tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        tt0 tt0Var3 = this.V;
        tt0Var3.addView(this.X, tt0Var3.indexOfChild(tabsContainer), ma.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        o oVar = new o(this, i7);
        nr nrVar = nr.h;
        te.a aVar = new te.a(0, oVar, nrVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new o(this, i10), nrVar, 380L, false);
        this.a0 = new te.a(2, new o(this, i12), nrVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.x(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new u1(this, 17));
        G0();
        fh.g c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        m7 m7Var = new m7(ls.A2, context, false);
        this.T = m7Var;
        m7Var.setStarParticlesView(this.e);
        this.S.addView(this.T, ma.d(ls.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.N0(2131749335, null), g0.H2(g0.T2(hd.N0(n.c(this.currentAccount) ? 2131749336 : 2131749337, null), new ai.a(context, 9)), true), this.S, null);
        this.c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nrVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new k8(this, 12));
        this.s.addView(new wz(getParentActivity()), ma.c(-1.0f, -1));
        y8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        o6 o6Var = new o6(getParentActivity(), false, true, false);
        this.l0 = o6Var;
        o6Var.setTypeface(g0.o());
        this.l0.setTextSize(g0.L(32.0f));
        this.l0.setGravity(17);
        t6.Y(this.l0, m6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        nq nqVar = new nq(R.drawable.mini_gram_72, 0);
        nqVar.d = false;
        nqVar.I = 0.5f;
        nqVar.J = 0.5f;
        nqVar.r = -g0.L(3.0f);
        nqVar.s = 0.0f;
        this.k0.setSpan(nqVar, 0, 1, 33);
        this.j0.addView(this.l0, ma.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        o6 o6Var2 = new o6(getParentActivity(), false, false, false);
        this.m0 = o6Var2;
        o6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(hd.N0(2131742523, null));
        t6.Y(this.m0, m6.z6, this.resourceProvider);
        this.j0.addView(this.m0, ma.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        e3 e3Var = new e3(6, getParentActivity(), this);
        this.n0 = e3Var;
        frameLayout2.addView(e3Var);
        boolean c11 = n.c(this.currentAccount);
        this.u0 = c11;
        if (c11) {
            this.t0 = true;
        }
        boolean z10 = this.i0;
        if (z10 && !c11) {
            hi.e eVar = new hi.e(getParentActivity(), this.resourceProvider, true);
            eVar.setRoundRadius(24);
            this.o0 = eVar;
            eVar.f();
            this.o0.i(hd.N0(2131743787, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.p
                public final /* synthetic */ t b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i7;
                    t tVar = this.b;
                    switch (i13) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                            break;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                            break;
                        case 2:
                            hi.e eVar2 = tVar.q0;
                            if (eVar2 != null && !eVar2.R) {
                                eVar2.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                bi.o6 o6Var3 = new bi.o6(10, eVar2, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new g1(o6Var3, 13));
                                break;
                            }
                            break;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            break;
                    }
                }
            });
            this.n0.addView(this.o0, ma.e(-1, 48, ls.E1));
        }
        d61 d61Var = new d61(i11, getParentActivity(), this);
        this.p0 = d61Var;
        frameLayout2.addView(d61Var);
        hi.e eVar2 = new hi.e(getParentActivity(), this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.q0 = eVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new nq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.N0(2131743800, null));
        this.q0.i(spannableStringBuilder, false, true);
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.p
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i10;
                t tVar = this.b;
                switch (i13) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                        break;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                        break;
                    case 2:
                        hi.e eVar22 = tVar.q0;
                        if (eVar22 != null && !eVar22.R) {
                            eVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            bi.o6 o6Var3 = new bi.o6(10, eVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new g1(o6Var3, 13));
                            break;
                        }
                        break;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (this.u0) {
            this.q0.i(hd.N0(2131749329, null), false, true);
            this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.p
                public final /* synthetic */ t b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i12;
                    t tVar = this.b;
                    switch (i13) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                            break;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                            break;
                        case 2:
                            hi.e eVar22 = tVar.q0;
                            if (eVar22 != null && !eVar22.R) {
                                eVar22.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                bi.o6 o6Var3 = new bi.o6(10, eVar22, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new g1(o6Var3, 13));
                                break;
                            }
                            break;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            break;
                    }
                }
            });
        }
        if (z10 || this.u0) {
            this.p0.addView(this.q0, ma.q(-1, 48, 17.0f, 1, 0, 0, this.u0 ? 0 : 8, 0));
        }
        hi.e eVar3 = new hi.e(getParentActivity(), this.resourceProvider, true);
        eVar3.setRoundRadius(24);
        this.r0 = eVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new nq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.N0(2131743801, null));
        this.r0.i(spannableStringBuilder2, false, true);
        final int i13 = 3;
        this.r0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.p
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i13;
                t tVar = this.b;
                switch (i132) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                        break;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743785, null), false);
                        break;
                    case 2:
                        hi.e eVar22 = tVar.q0;
                        if (eVar22 != null && !eVar22.R) {
                            eVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            bi.o6 o6Var3 = new bi.o6(10, eVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new g1(o6Var3, 13));
                            break;
                        }
                        break;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (!this.u0) {
            this.p0.addView(this.r0, ma.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.j0.addView(frameLayout2, ma.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(this.t0 ? 1.0f : 0.0f);
        this.n0.setAlpha(this.t0 ? 0.0f : 1.0f);
        this.p0.setVisibility(this.t0 ? 0 : 8);
        this.n0.setVisibility(this.t0 ? 8 : 0);
        F0();
        g8 g8Var = this.v0;
        if (g8Var != null) {
            g8Var.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.x3) {
            u0();
            g8 g8Var = this.v0;
            if (g8Var != null) {
                g8Var.O(true);
            }
            h0();
            return;
        }
        if (i7 == ls.B3) {
            y8 y10 = y8.y(this.currentAccount, true);
            if (this.s0 != y10.M(0)) {
                this.s0 = y10.M(0);
                u0();
                g8 g8Var2 = this.v0;
                if (g8Var2 != null) {
                    g8Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == ls.C3) {
            g8 g8Var3 = this.v0;
            if (g8Var3 != null) {
                g8Var3.O(true);
                return;
            }
            return;
        }
        if (i7 == ls.A3) {
            F0();
        } else if (i7 == ls.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getNavigationBarColor() {
        return m6.x0(null, m6.i5, false);
    }

    @Override // org.telegram.ui.s00
    public final void h0() {
        tt0 tt0Var;
        super.h0();
        if (this.f0 && (tt0Var = this.V) != null && this.b0 != -1) {
            tt0Var.a();
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.s00
    public final void i0() {
        this.s.addView(this.V, ma.c(-1.0f, -1));
        this.V.u(this.c, new o(this, 3));
        tt0 tt0Var = this.V;
        ob obVar = this.U;
        j71 viewPager = obVar.getViewPager();
        ob obVar2 = this.U;
        Objects.requireNonNull(obVar2);
        tt0Var.x(obVar, viewPager, new v6(obVar2, 25));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        tt0 tt0Var = this.V;
        return tt0Var == null || motionEvent == null || tt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.s00
    public final v4.i0 k0() {
        g8 g8Var = new g8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new d7(this, 4), getResourceProvider(), 3);
        this.v0 = g8Var;
        g8Var.r = false;
        return g8Var;
    }

    @Override // org.telegram.ui.s00
    public final c0 l0(Context context) {
        tt0 tt0Var = this.V;
        tt0Var.getClass();
        return new jg.i0(5, tt0Var, false);
    }

    @Override // org.telegram.ui.s00
    public final t1 m0() {
        return new ua(getParentActivity(), 75, 1, 1);
    }

    @Override // org.telegram.ui.s00
    public final boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.s00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        ls.f(this.currentAccount).c(this, ls.x3);
        ls.f(this.currentAccount).c(this, ls.A3);
        ls.f(this.currentAccount).c(this, ls.B3);
        ls.f(this.currentAccount).c(this, ls.C3);
        ls.f(this.currentAccount).c(this, ls.E3);
        y8.y(this.currentAccount, true).R(true);
        y8.y(this.currentAccount, true).Q();
        e0.g(this.currentAccount).j(getUserConfig().e(), true);
        y8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ek0 ek0Var = this.c;
        if (ek0Var != null) {
            ek0Var.removeCallbacks(this.g0);
        }
        ls.f(this.currentAccount).n(this, ls.x3);
        ls.f(this.currentAccount).n(this, ls.A3);
        ls.f(this.currentAccount).n(this, ls.B3);
        ls.f(this.currentAccount).n(this, ls.C3);
        ls.f(this.currentAccount).n(this, ls.E3);
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        D0();
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.s00
    public final float q0() {
        ek0 ek0Var = this.c;
        if (ek0Var == null) {
            return 0.0f;
        }
        return ek0Var.getY();
    }

    @Override // org.telegram.ui.s00
    public final View r0() {
        return this.V;
    }

    @Override // org.telegram.ui.s00
    public final void s0(boolean z10) {
        te.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.s00
    public final void t0(float f10) {
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override // org.telegram.ui.s00
    public final void u0() {
        super.u0();
        tt0 tt0Var = this.V;
        this.f0 = tt0Var != null && tt0Var.f0;
        ek0 ek0Var = this.c;
        if (ek0Var == null || this.Q < 0) {
            return;
        }
        this.R -= ek0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.s00
    public final boolean z0() {
        return true;
    }
}
