package gi;

import aa.n;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.cd;
import bi.dd;
import bi.e5;
import bi.ea;
import bi.ec;
import bi.g;
import bi.gc;
import bi.hc;
import bi.n0;
import bi.pa;
import bi.z;
import c8.ha;
import fi.v9;
import hi.q3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.i0;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.e61;
import org.telegram.ui.o00;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import ug.q1;
import v4.b0;
import v4.k;
import wg.f1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f extends r00 implements ls {
    public FrameLayout R;
    public x6 S;
    public cd T;
    public it0 U;
    public ec V;
    public View W;
    public te.a X;
    public te.a Y;
    public te.a Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public ec g0;
    public final boolean h0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public i6 k0;
    public i6 l0;
    public e5 m0;
    public fi.d n0;
    public e61 o0;
    public fi.d p0;
    public fi.d q0;
    public boolean r0;
    public boolean s0;
    public hc t0;
    public int a0 = -1;
    public final v9 f0 = new v9(this, 7);

    public f() {
        boolean z9;
        t0.u();
        if (r2.a()) {
            z9 = true;
        } else {
            t0.r();
            z9 = false;
        }
        this.h0 = z9;
        this.M = true;
    }

    public static void A0(f fVar, int i7) {
        x31 G;
        hc hcVar = fVar.t0;
        if (hcVar == null || (G = hcVar.G(i7)) == null) {
            return;
        }
        int i10 = G.d;
        if (i10 == -1) {
            fVar.t0.O(true);
            return;
        }
        if (i10 == -2) {
            ea.y(fVar.currentAccount, true).u();
            f1.l1(1, v1.a(fVar.currentAccount).b());
        } else if (i10 == -3) {
            ea.y(fVar.currentAccount, true).V();
            fVar.t0.O(true);
        } else if (i10 == -4) {
            if (qp.s1(fVar.currentAccount).v2()) {
                org.telegram.ui.b.b(fVar.currentAccount);
            } else {
                fVar.presentFragment(new q3(fVar.getUserConfig().e()));
            }
        }
    }

    public final void D0() {
        G0();
        pj0 pj0Var = this.c;
        if (pj0Var == null || this.U == null || pj0Var.getLayoutParams() == null) {
            return;
        }
        int C = q.C(48.0f, this.b0, -g0.L(8.0f));
        int C2 = q.C(48.0f, this.c0, -g0.L(8.0f));
        g0.B3(this.c, 0, C, 0, C2);
        pj0 pj0Var2 = this.c;
        int i7 = -C;
        pj0Var2.setPadding(pj0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.c0 - C2);
        this.U.z(i7, -C2);
    }

    public final void E0(ArrayList arrayList, m41 m41Var) {
        pj0 pj0Var;
        it0 it0Var = this.U;
        boolean z9 = it0Var != null && it0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ea y10 = ea.y(this.currentAccount, true);
        o00 o00Var = (o00) super.o0(getParentActivity());
        x31 x31Var = new x31(-2);
        x31Var.c = o00Var;
        arrayList.add(x31Var);
        arrayList.add(x31.k(this.i0));
        boolean z10 = this.h0;
        if (z10) {
            arrayList.add(x31.C(id.M0(2131749514, null)));
        }
        boolean N = y10.N(0);
        this.r0 = N;
        if (!N) {
            arrayList.add(x31.m(this.g0));
            return;
        }
        if (!z10) {
            arrayList.add(x31.C(null));
        }
        this.a0 = arrayList.size();
        arrayList.add(x31.n(this.V, -2));
        if (!z9 || (pj0Var = this.c) == null) {
            return;
        }
        v9 v9Var = this.f0;
        pj0Var.removeCallbacks(v9Var);
        this.c.post(v9Var);
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 1;
        ea y10 = ea.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().x7.l.b).a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) dd.M0(p10, 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.l0.setText("≈" + r1.i().f(i10, "USD"));
        } else {
            this.l0.setText(id.M0(2131742789, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = n0.g(this.currentAccount).j(getUserConfig().e(), true);
        final int i11 = 0;
        final boolean z9 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.s0 == z9) {
            return;
        }
        this.s0 = z9;
        this.m0.setVisibility(0);
        this.o0.setVisibility(0);
        this.m0.animate().alpha(z9 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: gi.c
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z9) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z9) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        this.o0.animate().alpha(z9 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: gi.c
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        if (z9) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z9) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void G0() {
        if (this.W == null) {
            return;
        }
        int L = g0.L(44.0f) + l.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        H0();
    }

    public final void H0() {
        View view = this.W;
        if (view == null) {
            return;
        }
        te.a aVar = this.X;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f10)) * l.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * g0.L(44.0f)));
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 0;
        this.G = false;
        this.E = g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.U = it0Var;
        final int i10 = 1;
        it0Var.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            r4 r4Var = this.parentLayout;
            this.b0 = (r4Var == null || !((ActionBarLayout) r4Var).S0) ? g0.m : 0;
            this.c0 = g0.n;
        }
        this.U.setGeometry(new n(this, 29));
        this.U.z(-q.C(48.0f, this.b0, -g0.L(8.0f)), -q.C(48.0f, this.c0, -g0.L(8.0f)));
        it0 it0Var2 = this.U;
        it0Var2.getClass();
        this.V = new ec(25, context, it0Var2);
        this.T = new cd(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new ec(3, context, this);
        super.createView(context);
        q00 q00Var = this.s;
        getBaseSimpleGlass().f(q00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        final int i11 = 2;
        getBaseSimpleGlass().o = new g(i11, this, new bi.f(i11, q00Var));
        View tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        it0 it0Var3 = this.U;
        it0Var3.addView(this.W, it0Var3.indexOfChild(tabsContainer), ha.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, i7);
        wq wqVar = wq.h;
        te.a aVar2 = new te.a(0, aVar, wqVar, 380L, false);
        this.X = aVar2;
        this.Y = new te.a(1, new a(this, i10), wqVar, 380L, false);
        this.Z = new te.a(2, new a(this, i11), wqVar, 380L, false);
        aVar2.a(this.c.canScrollVertically(-1) || this.simpleActionBar.u(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new ai.b(this, 13));
        G0();
        fh.g c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        x6 x6Var = new x6(qs.A2, context, false);
        this.S = x6Var;
        x6Var.setStarParticlesView(this.e);
        this.R.addView(this.S, ha.d(qs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(id.M0(2131749512, null), g0.H2(g0.U2(id.M0(2131749513, null), new pa(context, 7)), true), this.R, null);
        this.c.setOverScrollMode(2);
        k kVar = new k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wqVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new ai.k(this, 11));
        this.s.addView(new jz(getParentActivity()), ha.c(-1.0f, -1));
        ea.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        i6 i6Var = new i6(getParentActivity(), false, true, false);
        this.k0 = i6Var;
        i6Var.setTypeface(g0.o());
        this.k0.setTextSize(g0.L(32.0f));
        this.k0.setGravity(17);
        t6.Y(this.k0, m6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        wp wpVar = new wp(R.drawable.mini_gram_72, 0);
        wpVar.d = false;
        wpVar.H = 0.5f;
        wpVar.I = 0.5f;
        wpVar.r = -g0.L(3.0f);
        wpVar.s = 0.0f;
        this.j0.setSpan(wpVar, 0, 1, 33);
        this.i0.addView(this.k0, ha.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        i6 i6Var2 = new i6(getParentActivity(), false, false, false);
        this.l0 = i6Var2;
        i6Var2.setTextSize(g0.L(14.0f));
        this.l0.setGravity(17);
        this.l0.setText(id.M0(2131742789, null));
        t6.Y(this.l0, m6.z6, this.resourceProvider);
        this.i0.addView(this.l0, ha.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        e5 e5Var = new e5(5, getParentActivity(), this);
        this.m0 = e5Var;
        frameLayout2.addView(e5Var);
        boolean z9 = this.h0;
        if (z9) {
            fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.n0 = dVar;
            dVar.f();
            this.n0.i(id.M0(2131744030, null), false, true);
            this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
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
                            vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                            break;
                        case 1:
                            vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                            break;
                        default:
                            fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                            break;
                    }
                }
            });
            this.m0.addView(this.n0, ha.e(-1, 48, qs.E1));
        }
        e61 e61Var = new e61(4, getParentActivity(), this);
        this.o0 = e61Var;
        frameLayout2.addView(e61Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) id.M0(2131744043, null));
        this.p0.i(spannableStringBuilder, false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
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
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        break;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        break;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (z9) {
            this.o0.addView(this.p0, ha.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) id.M0(2131744044, null));
        this.q0.i(spannableStringBuilder2, false, true);
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
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
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        break;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        break;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        break;
                }
            }
        });
        this.o0.addView(this.q0, ha.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, ha.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.o0.animate().cancel();
        this.o0.setAlpha(this.s0 ? 1.0f : 0.0f);
        this.m0.setAlpha(this.s0 ? 0.0f : 1.0f);
        this.o0.setVisibility(this.s0 ? 0 : 8);
        this.m0.setVisibility(this.s0 ? 8 : 0);
        F0();
        hc hcVar = this.t0;
        if (hcVar != null) {
            hcVar.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.v3) {
            u0();
            hc hcVar = this.t0;
            if (hcVar != null) {
                hcVar.O(true);
            }
            h0();
            return;
        }
        if (i7 == qs.z3) {
            ea y10 = ea.y(this.currentAccount, true);
            if (this.r0 != y10.N(0)) {
                this.r0 = y10.N(0);
                u0();
                hc hcVar2 = this.t0;
                if (hcVar2 != null) {
                    hcVar2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == qs.A3) {
            hc hcVar3 = this.t0;
            if (hcVar3 != null) {
                hcVar3.O(true);
                return;
            }
            return;
        }
        if (i7 == qs.y3) {
            F0();
        } else if (i7 == qs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final int getNavigationBarColor() {
        return m6.x0(null, m6.i5, false);
    }

    @Override // org.telegram.ui.r00
    public final void h0() {
        it0 it0Var;
        super.h0();
        if (this.e0 && (it0Var = this.U) != null && this.a0 != -1) {
            it0Var.a();
        }
        this.e0 = false;
    }

    @Override // org.telegram.ui.r00
    public final void i0() {
        this.s.addView(this.U, ha.c(-1.0f, -1));
        this.U.u(this.c, new a(this, 3));
        it0 it0Var = this.U;
        cd cdVar = this.T;
        v61 viewPager = cdVar.getViewPager();
        cd cdVar2 = this.T;
        Objects.requireNonNull(cdVar2);
        it0Var.x(cdVar, viewPager, new di.r4(cdVar2, 17));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.U;
        return it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.r00
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 24), getResourceProvider(), 2);
        this.t0 = hcVar;
        hcVar.r = false;
        return hcVar;
    }

    @Override // org.telegram.ui.r00
    public final b0 l0(Context context) {
        it0 it0Var = this.U;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
    }

    @Override // org.telegram.ui.r00
    public final q1 m0() {
        return new gc(getParentActivity(), 75, 1, 1);
    }

    @Override // org.telegram.ui.r00
    public final boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.r00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.v3);
        qs.f(this.currentAccount).c(this, qs.y3);
        qs.f(this.currentAccount).c(this, qs.z3);
        qs.f(this.currentAccount).c(this, qs.A3);
        qs.f(this.currentAccount).c(this, qs.C3);
        ea.y(this.currentAccount, true).S(true);
        ea.y(this.currentAccount, true).R();
        ea.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        pj0 pj0Var = this.c;
        if (pj0Var != null) {
            pj0Var.removeCallbacks(this.f0);
        }
        qs.f(this.currentAccount).n(this, qs.v3);
        qs.f(this.currentAccount).n(this, qs.y3);
        qs.f(this.currentAccount).n(this, qs.z3);
        qs.f(this.currentAccount).n(this, qs.A3);
        qs.f(this.currentAccount).n(this, qs.C3);
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.d0 = true;
        this.b0 = i10;
        this.c0 = i12;
        D0();
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.r00
    public final float q0() {
        pj0 pj0Var = this.c;
        if (pj0Var == null) {
            return 0.0f;
        }
        return pj0Var.getY();
    }

    @Override // org.telegram.ui.r00
    public final View r0() {
        return this.U;
    }

    @Override // org.telegram.ui.r00
    public final void s0(boolean z9) {
        te.a aVar = this.Z;
        if (aVar == null || aVar.f == z9) {
            return;
        }
        aVar.a(z9, true);
    }

    @Override // org.telegram.ui.r00
    public final void t0(float f10) {
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override // org.telegram.ui.r00
    public final void u0() {
        super.u0();
        it0 it0Var = this.U;
        this.e0 = it0Var != null && it0Var.e0;
        pj0 pj0Var = this.c;
        if (pj0Var == null || this.P < 0) {
            return;
        }
        this.Q -= pj0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.r00
    public final boolean z0() {
        return true;
    }
}
