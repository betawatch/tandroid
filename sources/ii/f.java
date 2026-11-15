package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.b6;
import bi.g2;
import bi.o2;
import bi.x5;
import bi.z4;
import c8.ja;
import di.e0;
import di.kb;
import di.lb;
import di.qa;
import di.t;
import di.u8;
import di.z6;
import fh.g;
import hi.e1;
import hi.q4;
import j$.util.Objects;
import java.util.ArrayList;
import ki.n3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.o00;
import org.telegram.ui.p00;
import org.telegram.ui.rv;
import org.telegram.ui.z51;
import ug.s1;
import v4.b0;
import v4.h0;
import wg.c1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f extends p00 implements is {
    public FrameLayout S;
    public w6 T;
    public kb U;
    public it0 V;
    public o2 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public o2 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public h6 l0;
    public h6 m0;
    public g2 n0;
    public hi.d o0;
    public z51 p0;
    public hi.d q0;
    public hi.d r0;
    public boolean s0;
    public boolean t0;
    public x5 u0;
    public int b0 = -1;
    public final e1 g0 = new e1(this, 21);

    public f() {
        boolean z10;
        t0.u();
        if (r2.a()) {
            z10 = true;
        } else {
            t0.r();
            z10 = false;
        }
        this.i0 = z10;
        this.N = true;
    }

    public static void A0(f fVar, int i7) {
        b41 G;
        x5 x5Var = fVar.u0;
        if (x5Var == null || (G = x5Var.G(i7)) == null) {
            return;
        }
        int i10 = G.d;
        if (i10 == -1) {
            fVar.u0.O(true);
            return;
        }
        if (i10 == -2) {
            u8.y(fVar.currentAccount, true).u();
            c1.l1(1, v1.a(fVar.currentAccount).b());
        } else if (i10 == -3) {
            u8.y(fVar.currentAccount, true).V();
            fVar.u0.O(true);
        } else if (i10 == -4) {
            if (np.s1(fVar.currentAccount).v2()) {
                org.telegram.ui.b.b(fVar.currentAccount);
            } else {
                fVar.presentFragment(new n3(fVar.getUserConfig().e()));
            }
        }
    }

    public final void D0() {
        G0();
        uj0 uj0Var = this.c;
        if (uj0Var == null || this.V == null || uj0Var.getLayoutParams() == null) {
            return;
        }
        int C = i20.C(48.0f, this.c0, -g0.L(8.0f));
        int C2 = i20.C(48.0f, this.d0, -g0.L(8.0f));
        g0.A3(this.c, 0, C, 0, C2);
        uj0 uj0Var2 = this.c;
        int i7 = -C;
        uj0Var2.setPadding(uj0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.d0 - C2);
        this.V.z(i7, -C2);
    }

    public final void E0(ArrayList arrayList, p41 p41Var) {
        uj0 uj0Var;
        it0 it0Var = this.V;
        boolean z10 = it0Var != null && it0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        u8 y10 = u8.y(this.currentAccount, true);
        rv rvVar = (rv) super.o0(getParentActivity());
        b41 b41Var = new b41(-2);
        b41Var.c = rvVar;
        arrayList.add(b41Var);
        arrayList.add(b41.k(this.j0));
        boolean z11 = this.i0;
        if (z11) {
            arrayList.add(b41.C(hd.M0(2131749514, null)));
        }
        boolean N = y10.N(0);
        this.s0 = N;
        if (!N) {
            arrayList.add(b41.m(this.h0));
            return;
        }
        if (!z11) {
            arrayList.add(b41.C(null));
        }
        this.b0 = arrayList.size();
        arrayList.add(b41.n(this.W, -2));
        if (!z10 || (uj0Var = this.c) == null) {
            return;
        }
        e1 e1Var = this.g0;
        uj0Var.removeCallbacks(e1Var);
        this.c.post(e1Var);
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 1;
        u8 y10 = u8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().y7.l.b).a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) lb.M0(p10, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.m0.setText("≈" + r1.i().f(i10, "USD"));
        } else {
            this.m0.setText(hd.M0(2131742789, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), true);
        final int i11 = 0;
        final boolean z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.t0 == z10) {
            return;
        }
        this.t0 = z10;
        this.n0.setVisibility(0);
        this.p0.setVisibility(0);
        this.n0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ii.c
            public final /* synthetic */ f b;

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
        this.p0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ii.c
            public final /* synthetic */ f b;

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
        int L = g0.L(44.0f) + k.getCurrentActionBarHeight() + this.c0;
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
        view.setTranslationY(((-(1.0f - f10)) * k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * g0.L(44.0f)));
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        final int i7 = 0;
        this.H = false;
        this.F = g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.V = it0Var;
        final int i10 = 1;
        it0Var.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            o4 o4Var = this.parentLayout;
            this.c0 = (o4Var == null || !((ActionBarLayout) o4Var).T0) ? g0.m : 0;
            this.d0 = g0.n;
        }
        this.V.setGeometry(new gc.b(this, 8));
        this.V.z(-i20.C(48.0f, this.c0, -g0.L(8.0f)), -i20.C(48.0f, this.d0, -g0.L(8.0f)));
        it0 it0Var2 = this.V;
        it0Var2.getClass();
        this.W = new o2(26, context, it0Var2);
        this.U = new kb(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new o2(4, context, this);
        super.createView(context);
        o00 o00Var = this.s;
        getBaseSimpleGlass().f(o00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        final int i11 = 2;
        getBaseSimpleGlass().o = new di.f(i11, this, new di.e(i11, o00Var));
        View tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        it0 it0Var3 = this.V;
        it0Var3.addView(this.X, it0Var3.indexOfChild(tabsContainer), ja.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        a aVar = new a(this, i7);
        er erVar = er.h;
        te.a aVar2 = new te.a(0, aVar, erVar, 380L, false);
        this.Y = aVar2;
        this.Z = new te.a(1, new a(this, i10), erVar, 380L, false);
        this.a0 = new te.a(2, new a(this, i11), erVar, 380L, false);
        aVar2.a(this.c.canScrollVertically(-1) || this.simpleActionBar.v(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new z4(this, 16));
        G0();
        g c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        o4 o4Var2 = this.parentLayout;
        if (o4Var2 != null && ((ActionBarLayout) o4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        w6 w6Var = new w6(ns.A2, context, false);
        this.T = w6Var;
        w6Var.setStarParticlesView(this.e);
        this.S.addView(this.T, ja.d(ns.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.M0(2131749512, null), g0.H2(g0.U2(hd.M0(2131749513, null), new ai.a(context, 9)), true), this.S, null);
        this.c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new b6(this, 12));
        this.s.addView(new nz(getParentActivity()), ja.c(-1.0f, -1));
        u8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        h6 h6Var = new h6(getParentActivity(), false, true, false);
        this.l0 = h6Var;
        h6Var.setTypeface(g0.o());
        this.l0.setTextSize(g0.L(32.0f));
        this.l0.setGravity(17);
        q6.Y(this.l0, j6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        eq eqVar = new eq(R.drawable.mini_gram_72, 0);
        eqVar.d = false;
        eqVar.I = 0.5f;
        eqVar.J = 0.5f;
        eqVar.r = -g0.L(3.0f);
        eqVar.s = 0.0f;
        this.k0.setSpan(eqVar, 0, 1, 33);
        this.j0.addView(this.l0, ja.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        h6 h6Var2 = new h6(getParentActivity(), false, false, false);
        this.m0 = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(hd.M0(2131742789, null));
        q6.Y(this.m0, j6.z6, this.resourceProvider);
        this.j0.addView(this.m0, ja.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        g2 g2Var = new g2(6, getParentActivity(), this);
        this.n0 = g2Var;
        frameLayout2.addView(g2Var);
        boolean z10 = this.i0;
        if (z10) {
            hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.o0 = dVar;
            dVar.f();
            this.o0.i(hd.M0(2131744030, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.b
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i7;
                    f fVar = this.b;
                    switch (i12) {
                        case 0:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                            break;
                        case 1:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                            break;
                        default:
                            fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                            break;
                    }
                }
            });
            this.n0.addView(this.o0, ja.e(-1, 48, ns.E1));
        }
        z51 z51Var = new z51(5, getParentActivity(), this);
        this.p0 = z51Var;
        frameLayout2.addView(z51Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131744043, null));
        this.q0.i(spannableStringBuilder, false, true);
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                f fVar = this.b;
                switch (i12) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        break;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        break;
                    default:
                        fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (z10) {
            this.p0.addView(this.q0, ja.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        hi.d dVar3 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.r0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.M0(2131744044, null));
        this.r0.i(spannableStringBuilder2, false, true);
        this.r0.setOnClickListener(new View.OnClickListener(this) { // from class: ii.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                f fVar = this.b;
                switch (i12) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        break;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        break;
                    default:
                        fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                        break;
                }
            }
        });
        this.p0.addView(this.r0, ja.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, ja.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(this.t0 ? 1.0f : 0.0f);
        this.n0.setAlpha(this.t0 ? 0.0f : 1.0f);
        this.p0.setVisibility(this.t0 ? 0 : 8);
        this.n0.setVisibility(this.t0 ? 8 : 0);
        F0();
        x5 x5Var = this.u0;
        if (x5Var != null) {
            x5Var.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.v3) {
            u0();
            x5 x5Var = this.u0;
            if (x5Var != null) {
                x5Var.O(true);
            }
            h0();
            return;
        }
        if (i7 == ns.z3) {
            u8 y10 = u8.y(this.currentAccount, true);
            if (this.s0 != y10.N(0)) {
                this.s0 = y10.N(0);
                u0();
                x5 x5Var2 = this.u0;
                if (x5Var2 != null) {
                    x5Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == ns.A3) {
            x5 x5Var3 = this.u0;
            if (x5Var3 != null) {
                x5Var3.O(true);
                return;
            }
            return;
        }
        if (i7 == ns.y3) {
            F0();
        } else if (i7 == ns.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final int getNavigationBarColor() {
        return j6.x0(null, j6.i5, false);
    }

    @Override // org.telegram.ui.p00
    public final void h0() {
        it0 it0Var;
        super.h0();
        if (this.f0 && (it0Var = this.V) != null && this.b0 != -1) {
            it0Var.a();
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.p00
    public final void i0() {
        this.s.addView(this.V, ja.c(-1.0f, -1));
        this.V.u(this.c, new a(this, 3));
        it0 it0Var = this.V;
        kb kbVar = this.U;
        w61 viewPager = kbVar.getViewPager();
        kb kbVar2 = this.U;
        Objects.requireNonNull(kbVar2);
        it0Var.x(kbVar, viewPager, new z6(kbVar2, 23));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.V;
        return it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.p00
    public final h0 k0() {
        x5 x5Var = new x5(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 4), getResourceProvider(), 3);
        this.u0 = x5Var;
        x5Var.r = false;
        return x5Var;
    }

    @Override // org.telegram.ui.p00
    public final b0 l0(Context context) {
        it0 it0Var = this.V;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
    }

    @Override // org.telegram.ui.p00
    public final s1 m0() {
        return new qa(getParentActivity(), 75, 1, 1);
    }

    @Override // org.telegram.ui.p00
    public final boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.p00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.v3);
        ns.f(this.currentAccount).c(this, ns.y3);
        ns.f(this.currentAccount).c(this, ns.z3);
        ns.f(this.currentAccount).c(this, ns.A3);
        ns.f(this.currentAccount).c(this, ns.C3);
        u8.y(this.currentAccount, true).S(true);
        u8.y(this.currentAccount, true).R();
        u8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        uj0 uj0Var = this.c;
        if (uj0Var != null) {
            uj0Var.removeCallbacks(this.g0);
        }
        ns.f(this.currentAccount).n(this, ns.v3);
        ns.f(this.currentAccount).n(this, ns.y3);
        ns.f(this.currentAccount).n(this, ns.z3);
        ns.f(this.currentAccount).n(this, ns.A3);
        ns.f(this.currentAccount).n(this, ns.C3);
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        D0();
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.p00
    public final float q0() {
        uj0 uj0Var = this.c;
        if (uj0Var == null) {
            return 0.0f;
        }
        return uj0Var.getY();
    }

    @Override // org.telegram.ui.p00
    public final View r0() {
        return this.V;
    }

    @Override // org.telegram.ui.p00
    public final void s0(boolean z10) {
        te.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.p00
    public final void t0(float f10) {
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override // org.telegram.ui.p00
    public final void u0() {
        super.u0();
        it0 it0Var = this.V;
        this.f0 = it0Var != null && it0Var.f0;
        uj0 uj0Var = this.c;
        if (uj0Var == null || this.Q < 0) {
            return;
        }
        this.R -= uj0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.p00
    public final boolean z0() {
        return true;
    }
}
