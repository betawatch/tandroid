package hi;

import ai.f6;
import ai.j5;
import ai.j6;
import ai.o2;
import ai.s1;
import ai.x2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.cd;
import b8.mf;
import ci.bb;
import ci.e9;
import ci.v;
import ci.vb;
import ci.wb;
import ei.y8;
import ii.q3;
import j$.util.Objects;
import java.util.ArrayList;
import kg.f0;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.k00;
import org.telegram.ui.l00;
import org.telegram.ui.s51;
import u4.b0;
import u4.h0;
import vg.t1;
import xg.e1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends l00 implements cs {
    public FrameLayout S;
    public u6 T;
    public vb U;
    public gt0 V;
    public x2 W;
    public View X;
    public qe.a Y;
    public qe.a Z;
    public qe.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public x2 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public h6 l0;
    public h6 m0;
    public o2 n0;
    public gi.d o0;
    public s51 p0;
    public gi.d q0;
    public gi.d r0;
    public boolean s0;
    public boolean t0;
    public f6 u0;
    public int b0 = -1;
    public final gi.f6 g0 = new gi.f6(this, 13);

    public g() {
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

    public static void A0(g gVar, int i3) {
        r31 G;
        f6 f6Var = gVar.u0;
        if (f6Var == null || (G = f6Var.G(i3)) == null) {
            return;
        }
        int i10 = G.d;
        if (i10 == -1) {
            gVar.u0.O(true);
            return;
        }
        if (i10 == -2) {
            e9.y(gVar.currentAccount, true).u();
            e1.l1(1, v1.a(gVar.currentAccount).b());
        } else if (i10 == -3) {
            e9.y(gVar.currentAccount, true).V();
            gVar.u0.O(true);
        } else if (i10 == -4) {
            if (hp.s1(gVar.currentAccount).v2()) {
                org.telegram.ui.b.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new q3(gVar.getUserConfig().e()));
            }
        }
    }

    public final void D0() {
        G0();
        tj0 tj0Var = this.c;
        if (tj0Var == null || this.V == null || tj0Var.getLayoutParams() == null) {
            return;
        }
        int C = q.C(48.0f, this.c0, -g0.L(8.0f));
        int C2 = q.C(48.0f, this.d0, -g0.L(8.0f));
        g0.B3(this.c, 0, C, 0, C2);
        tj0 tj0Var2 = this.c;
        int i3 = -C;
        tj0Var2.setPadding(tj0Var2.getPaddingLeft(), i3, this.c.getPaddingRight(), this.d0 - C2);
        this.V.z(i3, -C2);
    }

    public final void E0(ArrayList arrayList, f41 f41Var) {
        tj0 tj0Var;
        gt0 gt0Var = this.V;
        boolean z10 = gt0Var != null && gt0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e9 y9 = e9.y(this.currentAccount, true);
        r0 r0Var = (r0) super.o0(getParentActivity());
        r31 r31Var = new r31(-2);
        r31Var.c = r0Var;
        arrayList.add(r31Var);
        arrayList.add(r31.k(this.j0));
        boolean z11 = this.i0;
        if (z11) {
            arrayList.add(r31.C(bd.M0(2131749522, null)));
        }
        boolean N = y9.N(0);
        this.s0 = N;
        if (!N) {
            arrayList.add(r31.m(this.h0));
            return;
        }
        if (!z11) {
            arrayList.add(r31.C(null));
        }
        this.b0 = arrayList.size();
        arrayList.add(r31.n(this.W, -2));
        if (!z10 || (tj0Var = this.c) == null) {
            return;
        }
        gi.f6 f6Var = this.g0;
        tj0Var.removeCallbacks(f6Var);
        this.c.post(f6Var);
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i3 = 1;
        e9 y9 = e9.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().x7.l.b).a;
        TL_stars.StarsAmount p10 = y9.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) wb.M0(p10, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.m0.setText("≈" + r1.i().f(i10, "USD"));
        } else {
            this.m0.setText(bd.M0(2131742799, null));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = ci.i0.g(this.currentAccount).j(getUserConfig().e(), true);
        final int i11 = 0;
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.t0 == z10) {
            return;
        }
        this.t0 = z10;
        this.n0.setVisibility(0);
        this.p0.setVisibility(0);
        this.n0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: hi.c
            public final /* synthetic */ g b;

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
        this.p0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: hi.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
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
        qe.a aVar = this.Y;
        float f10 = aVar == null ? 0.0f : aVar.e;
        qe.a aVar2 = this.Z;
        view.setTranslationY(((-(1.0f - f10)) * k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * g0.L(44.0f)));
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 0;
        this.H = false;
        this.F = g0.L(238.0f);
        gt0 gt0Var = new gt0(context);
        this.V = gt0Var;
        final int i10 = 1;
        gt0Var.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            q4 q4Var = this.parentLayout;
            this.c0 = (q4Var == null || !((ActionBarLayout) q4Var).T0) ? g0.m : 0;
            this.d0 = g0.n;
        }
        this.V.setGeometry(new d(this, i3));
        this.V.z(-q.C(48.0f, this.c0, -g0.L(8.0f)), -q.C(48.0f, this.d0, -g0.L(8.0f)));
        gt0 gt0Var2 = this.V;
        gt0Var2.getClass();
        this.W = new x2(26, context, gt0Var2);
        this.U = new vb(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new x2(4, context, this);
        super.createView(context);
        k00 k00Var = this.s;
        getBaseSimpleGlass().f(k00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().m = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        final int i11 = 2;
        getBaseSimpleGlass().n = new ci.g(i11, this, new ci.f(i11, k00Var));
        View tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        gt0 gt0Var3 = this.V;
        gt0Var3.addView(this.X, gt0Var3.indexOfChild(tabsContainer), mf.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        a aVar = new a(this, 0);
        xq xqVar = xq.h;
        qe.a aVar2 = new qe.a(0, aVar, xqVar, 380L, false);
        this.Y = aVar2;
        this.Z = new qe.a(1, new a(this, 1), xqVar, 380L, false);
        this.a0 = new qe.a(2, new a(this, 2), xqVar, 380L, false);
        aVar2.a(this.c.canScrollVertically(-1) || this.simpleActionBar.s(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new j5(this, 16));
        G0();
        gh.g c2 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c2.p(cd.m(this.resourceProvider));
        c2.q(g0.L(9.66f));
        c2.r(g0.L(18.0f));
        tabsContainer.setBackground(c2);
        q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        u6 u6Var = new u6(hs.A2, context, false);
        this.T = u6Var;
        u6Var.setStarParticlesView(this.e);
        this.S.addView(this.T, mf.d(hs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(bd.M0(2131749520, null), g0.H2(g0.U2(bd.M0(2131749521, null), new s1(context, 8)), true), this.S, null);
        this.c.setOverScrollMode(2);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new j6(this, 12));
        this.s.addView(new gz(getParentActivity()), mf.c(-1.0f, -1));
        e9.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        h6 h6Var = new h6(getParentActivity(), false, true, false);
        this.l0 = h6Var;
        h6Var.setTypeface(g0.o());
        this.l0.setTextSize(g0.L(32.0f));
        this.l0.setGravity(17);
        r6.Z(this.l0, k6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        wp wpVar = new wp(R.drawable.mini_gram_72, 0);
        wpVar.d = false;
        wpVar.I = 0.5f;
        wpVar.J = 0.5f;
        wpVar.r = -g0.L(3.0f);
        wpVar.s = 0.0f;
        this.k0.setSpan(wpVar, 0, 1, 33);
        this.j0.addView(this.l0, mf.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        h6 h6Var2 = new h6(getParentActivity(), false, false, false);
        this.m0 = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(bd.M0(2131742799, null));
        r6.Z(this.m0, k6.z6, this.resourceProvider);
        this.j0.addView(this.m0, mf.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        o2 o2Var = new o2(6, getParentActivity(), this);
        this.n0 = o2Var;
        frameLayout2.addView(o2Var);
        boolean z10 = this.i0;
        if (z10) {
            gi.d dVar = new gi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.o0 = dVar;
            dVar.f();
            this.o0.i(bd.M0(2131744040, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.b
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i3;
                    g gVar = this.b;
                    switch (i12) {
                        case 0:
                            sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                            break;
                        case 1:
                            sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                            break;
                        default:
                            gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                            break;
                    }
                }
            });
            this.n0.addView(this.o0, mf.e(-1, 48, hs.E1));
        }
        s51 s51Var = new s51(5, getParentActivity(), this);
        this.p0 = s51Var;
        frameLayout2.addView(s51Var);
        gi.d dVar2 = new gi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(2131744053, null));
        this.q0.i(spannableStringBuilder, false, true);
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                g gVar = this.b;
                switch (i12) {
                    case 0:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        break;
                    case 1:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        break;
                    default:
                        gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                        break;
                }
            }
        });
        if (z10) {
            this.p0.addView(this.q0, mf.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        gi.d dVar3 = new gi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.r0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) bd.M0(2131744054, null));
        this.r0.i(spannableStringBuilder2, false, true);
        this.r0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                g gVar = this.b;
                switch (i12) {
                    case 0:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        break;
                    case 1:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        break;
                    default:
                        gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                        break;
                }
            }
        });
        this.p0.addView(this.r0, mf.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, mf.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(this.t0 ? 1.0f : 0.0f);
        this.n0.setAlpha(this.t0 ? 0.0f : 1.0f);
        this.p0.setVisibility(this.t0 ? 0 : 8);
        this.n0.setVisibility(this.t0 ? 8 : 0);
        F0();
        f6 f6Var = this.u0;
        if (f6Var != null) {
            f6Var.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.v3) {
            u0();
            f6 f6Var = this.u0;
            if (f6Var != null) {
                f6Var.O(true);
            }
            h0();
            return;
        }
        if (i3 == hs.z3) {
            e9 y9 = e9.y(this.currentAccount, true);
            if (this.s0 != y9.N(0)) {
                this.s0 = y9.N(0);
                u0();
                f6 f6Var2 = this.u0;
                if (f6Var2 != null) {
                    f6Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i3 == hs.A3) {
            f6 f6Var3 = this.u0;
            if (f6Var3 != null) {
                f6Var3.O(true);
                return;
            }
            return;
        }
        if (i3 == hs.y3) {
            F0();
        } else if (i3 == hs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final int getNavigationBarColor() {
        return k6.x0(null, k6.i5, false);
    }

    @Override // org.telegram.ui.l00
    public final void h0() {
        gt0 gt0Var;
        super.h0();
        if (this.f0 && (gt0Var = this.V) != null && this.b0 != -1) {
            gt0Var.a();
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.l00
    public final void i0() {
        this.s.addView(this.V, mf.c(-1.0f, -1));
        this.V.u(this.c, new a(this, 3));
        gt0 gt0Var = this.V;
        vb vbVar = this.U;
        n61 viewPager = vbVar.getViewPager();
        vb vbVar2 = this.U;
        Objects.requireNonNull(vbVar2);
        gt0Var.x(vbVar, viewPager, new y8(vbVar2, 12));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gt0 gt0Var = this.V;
        return gt0Var == null || motionEvent == null || gt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.l00
    public final h0 k0() {
        f6 f6Var = new f6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new gi.q4(this, 4), getResourceProvider(), 3);
        this.u0 = f6Var;
        f6Var.r = false;
        return f6Var;
    }

    @Override // org.telegram.ui.l00
    public final b0 l0(Context context) {
        gt0 gt0Var = this.V;
        gt0Var.getClass();
        return new f0(5, gt0Var, false);
    }

    @Override // org.telegram.ui.l00
    public final t1 m0() {
        return new bb(getParentActivity(), 75, 1, 1);
    }

    @Override // org.telegram.ui.l00
    public final boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.l00
    public final View o0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.v3);
        hs.f(this.currentAccount).c(this, hs.y3);
        hs.f(this.currentAccount).c(this, hs.z3);
        hs.f(this.currentAccount).c(this, hs.A3);
        hs.f(this.currentAccount).c(this, hs.C3);
        e9.y(this.currentAccount, true).S(true);
        e9.y(this.currentAccount, true).R();
        e9.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        tj0 tj0Var = this.c;
        if (tj0Var != null) {
            tj0Var.removeCallbacks(this.g0);
        }
        hs.f(this.currentAccount).n(this, hs.v3);
        hs.f(this.currentAccount).n(this, hs.y3);
        hs.f(this.currentAccount).n(this, hs.z3);
        hs.f(this.currentAccount).n(this, hs.A3);
        hs.f(this.currentAccount).n(this, hs.C3);
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        D0();
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.l00
    public final float q0() {
        tj0 tj0Var = this.c;
        if (tj0Var == null) {
            return 0.0f;
        }
        return tj0Var.getY();
    }

    @Override // org.telegram.ui.l00
    public final View r0() {
        return this.V;
    }

    @Override // org.telegram.ui.l00
    public final void s0(boolean z10) {
        qe.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.l00
    public final void t0(float f10) {
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override // org.telegram.ui.l00
    public final void u0() {
        super.u0();
        gt0 gt0Var = this.V;
        this.f0 = gt0Var != null && gt0Var.f0;
        tj0 tj0Var = this.c;
        if (tj0Var == null || this.Q < 0) {
            return;
        }
        this.R -= tj0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.l00
    public final boolean z0() {
        return true;
    }
}
