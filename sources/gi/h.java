package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b6.i;
import bh.r;
import bi.ca;
import bi.cc;
import bi.cd;
import bi.dd;
import bi.m0;
import bi.ra;
import bi.y;
import fi.ua;
import hi.d4;
import ig.j0;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.b20;
import org.telegram.ui.d3;
import org.telegram.ui.e20;
import org.telegram.ui.f20;
import org.telegram.ui.za1;
import s4.c0;
import s4.h0;
import s4.l;
import tg.x1;
import vg.n1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends f20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout R;
    public m6 S;
    public cd T;
    public mw0 U;
    public cc V;
    public View W;
    public oe.b X;
    public oe.b Y;
    public oe.b Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public cc g0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public s6 k0;
    public s6 l0;
    public r m0;
    public fi.d n0;
    public za1 o0;
    public fi.d p0;
    public fi.d q0;
    public boolean r0;
    public boolean s0;
    public e t0;
    public int a0 = -1;
    public final ua f0 = new ua(this, 5);
    public final boolean h0 = z0();

    public h() {
        this.M = true;
    }

    public static void w0(h hVar, int i10) {
        u61 G;
        e eVar = hVar.t0;
        if (eVar == null || (G = eVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            hVar.t0.O(true);
            return;
        }
        if (i11 == -2) {
            ca.y(hVar.currentAccount, true).u();
            n1.e0(1, BirthdayController.getInstance(hVar.currentAccount).getState());
        } else if (i11 == -3) {
            ca.y(hVar.currentAccount, true).W();
            hVar.t0.O(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(hVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(hVar.currentAccount);
            } else {
                hVar.presentFragment(new d4(hVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public static boolean z0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public final void A0() {
        D0();
        nm0 nm0Var = this.c;
        if (nm0Var == null || this.U == null || nm0Var.getLayoutParams() == null) {
            return;
        }
        int g7 = d3.g(48.0f, this.b0, -AndroidUtilities.dp(8.0f));
        int g10 = d3.g(48.0f, this.c0, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(this.c, 0, g7, 0, g10);
        nm0 nm0Var2 = this.c;
        int i10 = -g7;
        nm0Var2.setPadding(nm0Var2.getPaddingLeft(), i10, this.c.getPaddingRight(), this.c0 - g10);
        this.U.z(i10, -g10);
    }

    public final void B0(ArrayList arrayList, k71 k71Var) {
        nm0 nm0Var;
        mw0 mw0Var = this.U;
        boolean z10 = mw0Var != null && mw0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ca y3 = ca.y(this.currentAccount, true);
        b20 b20Var = (b20) super.k0(getParentActivity());
        u61 u61Var = new u61(-2);
        u61Var.c = b20Var;
        arrayList.add(u61Var);
        arrayList.add(u61.k(this.i0));
        boolean z11 = this.h0;
        if (z11) {
            ic.a.z(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.r0 = O;
        if (!O) {
            arrayList.add(u61.m(this.g0));
            return;
        }
        if (!z11) {
            arrayList.add(u61.C(null));
        }
        this.a0 = arrayList.size();
        arrayList.add(u61.n(this.V, -2));
        if (!z10 || (nm0Var = this.c) == null) {
            return;
        }
        ua uaVar = this.f0;
        nm0Var.removeCallbacks(uaVar);
        this.c.post(uaVar);
    }

    public final void C0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        ca y3 = ca.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p10 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) dd.I0(p10, 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.l0.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.l0.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = m0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.s0 == z10) {
            return;
        }
        this.s0 = z10;
        this.m0.setVisibility(0);
        this.o0.setVisibility(0);
        final int i11 = 0;
        this.m0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: gi.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        final int i12 = 1;
        this.o0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: gi.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.o0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void D0() {
        if (this.W == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + k.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.W.setLayoutParams(layoutParams);
        }
        E0();
    }

    public final void E0() {
        View view = this.W;
        if (view == null) {
            return;
        }
        oe.b bVar = this.X;
        float f7 = bVar == null ? 0.0f : bVar.e;
        oe.b bVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f7)) * k.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * AndroidUtilities.dp(44.0f)));
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        mw0 mw0Var = new mw0(context);
        this.U = mw0Var;
        mw0Var.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            j5 j5Var = this.parentLayout;
            this.b0 = (j5Var == null || !((ActionBarLayout) j5Var).S0) ? AndroidUtilities.statusBarHeight : 0;
            this.c0 = AndroidUtilities.navigationBarHeight;
        }
        this.U.setGeometry(new i(this, 23));
        this.U.z(-d3.g(48.0f, this.b0, -AndroidUtilities.dp(8.0f)), -d3.g(48.0f, this.c0, -AndroidUtilities.dp(8.0f)));
        mw0 mw0Var2 = this.U;
        mw0Var2.getClass();
        this.V = new cc(mw0Var2, context, 24);
        this.T = new cd(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new cc(this, context, 2);
        super.createView(context);
        e20 e20Var = this.s;
        getBaseSimpleGlass().e(e20Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.y.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().h = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().i = new bi.g(2, this, new bi.f(2, e20Var));
        View tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        mw0 mw0Var3 = this.U;
        mw0Var3.addView(this.W, mw0Var3.indexOfChild(tabsContainer), kb1.i(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        ds dsVar = ds.h;
        oe.b bVar = new oe.b(0, aVar, dsVar, 380L, false);
        this.X = bVar;
        this.Y = new oe.b(1, new a(this, 1), dsVar, 380L, false);
        this.Z = new oe.b(2, new a(this, 2), dsVar, 380L, false);
        bVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.o(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new ai.b(this, 11));
        D0();
        eh.d c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        tabsContainer.setBackground(c10);
        j5 j5Var2 = this.parentLayout;
        if (j5Var2 != null && ((ActionBarLayout) j5Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        m6 m6Var = new m6(170, context, false);
        this.S = m6Var;
        m6Var.setStarParticlesView(this.e);
        this.R.addView(this.S, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        f0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new ra(context, 7)), true), this.R, null);
        this.c.setOverScrollMode(2);
        l lVar = new l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new ai.k(this, 11));
        this.s.addView(new z00(getParentActivity()), kb1.g(-1.0f, -1));
        ca.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        s6 s6Var = new s6(getParentActivity(), false, true, false);
        this.k0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.k0.setTextSize(AndroidUtilities.dp(32.0f));
        this.k0.setGravity(17);
        f7.Z(this.k0, y6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        zq zqVar = new zq(R.drawable.mini_gram_72, 0);
        zqVar.recolorDrawable = false;
        zqVar.setScale(0.5f, 0.5f);
        zqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.j0.setSpan(zqVar, 0, 1, 33);
        this.i0.addView(this.k0, kb1.h(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        s6 s6Var2 = new s6(getParentActivity(), false, false, false);
        this.l0 = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.l0.setGravity(17);
        this.l0.setText(LocaleController.getString(R.string.YourTonBalance));
        f7.Z(this.l0, y6.z6, this.resourceProvider);
        this.i0.addView(this.l0, kb1.h(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        r rVar = new r(this, getParentActivity(), 5);
        this.m0 = rVar;
        frameLayout2.addView(rVar);
        boolean z10 = this.h0;
        if (z10) {
            fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.n0 = dVar;
            dVar.f();
            this.n0.i(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            h hVar = this.b;
                            hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.m0.addView(this.n0, kb1.i(-1, 48, 119));
        }
        za1 za1Var = new za1(this, getParentActivity(), 4);
        this.o0 = za1Var;
        frameLayout2.addView(za1Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.p0.i(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        h hVar = this.b;
                        hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.o0.addView(this.p0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new zq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.q0.i(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: gi.b
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        qf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        h hVar = this.b;
                        hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.o0.addView(this.q0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, kb1.h(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.o0.animate().cancel();
        this.o0.setAlpha(this.s0 ? 1.0f : 0.0f);
        this.m0.setAlpha(this.s0 ? 0.0f : 1.0f);
        this.o0.setVisibility(this.s0 ? 0 : 8);
        this.m0.setVisibility(this.s0 ? 8 : 0);
        C0();
        e eVar = this.t0;
        if (eVar != null) {
            eVar.O(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.f20
    public final void d0() {
        mw0 mw0Var;
        super.d0();
        if (this.e0 && (mw0Var = this.U) != null && this.a0 != -1) {
            mw0Var.a();
        }
        this.e0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            q0();
            e eVar = this.t0;
            if (eVar != null) {
                eVar.O(true);
            }
            d0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            ca y3 = ca.y(this.currentAccount, true);
            if (this.r0 != y3.O(0)) {
                this.r0 = y3.O(0);
                q0();
                e eVar2 = this.t0;
                if (eVar2 != null) {
                    eVar2.O(false);
                }
                d0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.t0;
            if (eVar3 != null) {
                eVar3.O(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            C0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            C0();
        }
    }

    @Override // org.telegram.ui.f20
    public final void e0() {
        this.s.addView(this.U, kb1.g(-1.0f, -1));
        this.U.u(this.c, new a(this, 3));
        mw0 mw0Var = this.U;
        cd cdVar = this.T;
        v91 viewPager = cdVar.getViewPager();
        cd cdVar2 = this.T;
        Objects.requireNonNull(cdVar2);
        mw0Var.x(cdVar, viewPager, new e1.c(cdVar2, 12));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        A0();
    }

    @Override // org.telegram.ui.f20
    public final h0 g0() {
        e eVar = new e(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 24), getResourceProvider());
        this.t0 = eVar;
        eVar.r = false;
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getNavigationBarColor() {
        return y6.x0(null, y6.i5, false);
    }

    @Override // org.telegram.ui.f20
    public final c0 h0(Context context) {
        mw0 mw0Var = this.U;
        mw0Var.getClass();
        return new j0(5, mw0Var, false);
    }

    @Override // org.telegram.ui.f20
    public final x1 i0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        mw0 mw0Var = this.U;
        return mw0Var == null || motionEvent == null || mw0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.f20
    public final boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.f20
    public final View k0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.f20
    public final float m0() {
        nm0 nm0Var = this.c;
        if (nm0Var == null) {
            return 0.0f;
        }
        return nm0Var.getY();
    }

    @Override // org.telegram.ui.f20
    public final View n0() {
        return this.U;
    }

    @Override // org.telegram.ui.f20
    public final void o0(boolean z10) {
        oe.b bVar = this.Z;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.botStarsUpdated);
        ca.y(this.currentAccount, true).T(true);
        ca.y(this.currentAccount, true).S();
        ca.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm0 nm0Var = this.c;
        if (nm0Var != null) {
            nm0Var.removeCallbacks(this.f0);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d0 = true;
        this.b0 = i11;
        this.c0 = i13;
        A0();
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.f20
    public final void p0(float f7) {
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setHeaderTilt(f7 * 70.0f);
        }
    }

    @Override // org.telegram.ui.f20
    public final void q0() {
        super.q0();
        mw0 mw0Var = this.U;
        this.e0 = mw0Var != null && mw0Var.e0;
        nm0 nm0Var = this.c;
        if (nm0Var == null || this.P < 0) {
            return;
        }
        this.Q -= nm0Var.getPaddingTop();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.f20
    public final boolean v0() {
        return true;
    }
}
