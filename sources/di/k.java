package di;

import a4.m;
import ai.f0;
import ai.r;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.v;
import ci.ab;
import ci.qc;
import com.google.android.gms.internal.vision.e2;
import ei.f4;
import gg.j0;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.n20;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import org.telegram.ui.xb1;
import rg.y1;
import s4.c0;
import s4.h0;
import tg.m1;
import w7.z5;
import yh.o;
import yh.t5;
import yh.w7;
import yh.x7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class k extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public sg.e Q;
    public w7 R;
    public aw0 S;
    public ab T;
    public View U;
    public le.b V;
    public le.b W;
    public le.b X;
    public int Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public ab e0;
    public LinearLayout g0;
    public SpannableStringBuilder h0;
    public p6 i0;
    public p6 j0;
    public f0 k0;
    public ci.d l0;
    public xb1 m0;
    public ci.d n0;
    public ci.d o0;
    public boolean p0;
    public boolean q0;
    public h r0;
    public int Y = -1;
    public final qc d0 = new qc(this, 4);
    public final boolean f0 = G0();

    public k() {
        this.M = true;
    }

    public static void C0(k kVar, int i10) {
        g61 G;
        h hVar = kVar.r0;
        if (hVar == null || (G = hVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            kVar.r0.N(true);
            return;
        }
        if (i11 == -2) {
            t5.y(kVar.currentAccount, true).u();
            m1.e0(1, BirthdayController.getInstance(kVar.currentAccount).getState());
        } else if (i11 == -3) {
            t5.y(kVar.currentAccount, true).W();
            kVar.r0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(kVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(kVar.currentAccount);
            } else {
                kVar.presentFragment(new f4(kVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public static boolean G0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    @Override // org.telegram.ui.r20
    public final boolean B0() {
        return true;
    }

    public final void H0() {
        K0();
        zl0 zl0Var = this.c;
        if (zl0Var == null || this.S == null || zl0Var.getLayoutParams() == null) {
            return;
        }
        int C = ok.C(48.0f, this.Z, -AndroidUtilities.dp(8.0f));
        int C2 = ok.C(48.0f, this.a0, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(this.c, 0, C, 0, C2);
        zl0 zl0Var2 = this.c;
        int i10 = -C;
        zl0Var2.setPadding(zl0Var2.getPaddingLeft(), i10, this.c.getPaddingRight(), this.a0 - C2);
        this.S.s0(i10, -C2);
    }

    public final void I0(ArrayList arrayList, u61 u61Var) {
        zl0 zl0Var;
        aw0 aw0Var = this.S;
        boolean z10 = aw0Var != null && aw0Var.h1;
        this.Y = -1;
        if (getParentActivity() == null) {
            return;
        }
        t5 y3 = t5.y(this.currentAccount, true);
        n20 n20Var = (n20) super.s0(getParentActivity());
        g61 g61Var = new g61(-2);
        g61Var.c = n20Var;
        arrayList.add(g61Var);
        arrayList.add(g61.k(this.g0));
        boolean z11 = this.f0;
        if (z11) {
            e2.w(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.p0 = O;
        if (!O) {
            arrayList.add(g61.m(this.e0));
            return;
        }
        if (!z11) {
            arrayList.add(g61.B(null));
        }
        this.Y = arrayList.size();
        arrayList.add(g61.l(-2, this.T));
        if (!z10 || (zl0Var = this.c) == null) {
            return;
        }
        qc qcVar = this.d0;
        zl0Var.removeCallbacks(qcVar);
        this.c.post(qcVar);
    }

    public final void J0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        t5 y3 = t5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.h0);
        spannableStringBuilder.append((CharSequence) x7.P0(p5, 0.66f, ' '));
        this.i0.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.j0.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.j0.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = o.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        this.k0.setVisibility(0);
        this.m0.setVisibility(0);
        final int i11 = 0;
        this.k0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: di.d
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z10) {
                            this.b.k0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        final int i12 = 1;
        this.m0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: di.d
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z10) {
                            this.b.k0.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.m0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    public final void K0() {
        if (this.U == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.Z;
        ViewGroup.LayoutParams layoutParams = this.U.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.U.setLayoutParams(layoutParams);
        }
        L0();
    }

    public final void L0() {
        View view = this.U;
        if (view == null) {
            return;
        }
        le.b bVar = this.V;
        float f7 = bVar == null ? 0.0f : bVar.e;
        le.b bVar2 = this.W;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * AndroidUtilities.dp(44.0f)));
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        aw0 aw0Var = new aw0(context);
        this.S = aw0Var;
        aw0Var.setCommonInsetsManagedExternally(true);
        if (!this.b0) {
            c5 c5Var = this.parentLayout;
            this.Z = (c5Var == null || !((ActionBarLayout) c5Var).M0) ? AndroidUtilities.statusBarHeight : 0;
            this.a0 = AndroidUtilities.navigationBarHeight;
        }
        this.S.setGeometry(new m(this, 13));
        this.S.s0(-ok.C(48.0f, this.Z, -AndroidUtilities.dp(8.0f)), -ok.C(48.0f, this.a0, -AndroidUtilities.dp(8.0f)));
        aw0 aw0Var2 = this.S;
        aw0Var2.getClass();
        this.T = new ab(aw0Var2, context, 24);
        this.R = new w7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.S);
        this.e0 = new ab(this, context, 1);
        super.createView(context);
        q20 q20Var = this.s;
        getBaseSimpleGlass().d(q20Var, this.c, this.actionBar, this.resourceProvider);
        this.actionBar.setBackground(null);
        this.y.bringToFront();
        this.actionBar.bringToFront();
        getBaseSimpleGlass().h = this.S;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.R.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().i = new f(0, this, new e(q20Var, 0));
        View tabsContainer = this.R.getTabsContainer();
        View view = new View(getParentActivity());
        this.U = view;
        view.setAlpha(0.0f);
        aw0 aw0Var3 = this.S;
        aw0Var3.addView(this.U, aw0Var3.indexOfChild(tabsContainer), z5.e(-1, 0, 48));
        this.U.setBackground(getBaseSimpleGlass().a(this.U));
        a aVar = new a(this, 0);
        tr trVar = tr.h;
        le.b bVar = new le.b(0, aVar, trVar, 380L, false);
        this.V = bVar;
        this.W = new le.b(1, new a(this, 1), trVar, 380L, false);
        this.X = new le.b(2, new a(this, 2), trVar, 380L, false);
        bVar.a(this.c.canScrollVertically(-1) || this.actionBar.s(), false);
        this.W.a(this.S.h1, false);
        this.c.j(new r(this, 3));
        K0();
        ch.d c10 = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c10.x(eh.b.m(this.resourceProvider));
        c10.y(AndroidUtilities.dp(9.66f));
        c10.z(AndroidUtilities.dp(18.0f));
        tabsContainer.setBackground(c10);
        c5 c5Var2 = this.parentLayout;
        if (c5Var2 != null && ((ActionBarLayout) c5Var2).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 4);
        this.Q = eVar;
        sg.a aVar2 = eVar.b;
        aVar2.w = i6.fk;
        aVar2.x = i6.gk;
        aVar2.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        n0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new b(context, 0)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(trVar);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ai.g(this, 6));
        this.s.addView(new u00(getParentActivity()), z5.c(-1.0f, -1));
        t5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.g0 = linearLayout;
        linearLayout.setOrientation(1);
        this.g0.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        p6 p6Var = new p6(getParentActivity(), false, true, false);
        this.i0 = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        this.i0.setTextSize(AndroidUtilities.dp(32.0f));
        this.i0.setGravity(17);
        this.i0.setTextColor(i6.v0(i6.G6, this.resourceProvider));
        this.h0 = new SpannableStringBuilder("S");
        rq rqVar = new rq(R.drawable.mini_gram_72, 0);
        rqVar.setOverrideColor(-13397548);
        rqVar.setScale(0.5f, 0.5f);
        rqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.h0.setSpan(rqVar, 0, 1, 33);
        this.g0.addView(this.i0, z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        p6 p6Var2 = new p6(getParentActivity(), false, false, false);
        this.j0 = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.j0.setGravity(17);
        this.j0.setText(LocaleController.getString(R.string.YourTonBalance));
        this.j0.setTextColor(i6.v0(i6.z6, this.resourceProvider));
        this.g0.addView(this.j0, z5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        f0 f0Var = new f0(this, getParentActivity(), 3);
        this.k0 = f0Var;
        frameLayout2.addView(f0Var);
        boolean z10 = this.f0;
        if (z10) {
            ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.l0 = dVar;
            dVar.e();
            this.l0.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.l0.setOnClickListener(new View.OnClickListener(this) { // from class: di.c
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            k kVar = this.b;
                            kVar.presentFragment(new yh.g(1, kVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.k0.addView(this.l0, z5.e(-1, 48, 119));
        }
        xb1 xb1Var = new xb1(this, getParentActivity(), 1);
        this.m0 = xb1Var;
        frameLayout2.addView(xb1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.n0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new rq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.n0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: di.c
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        k kVar = this.b;
                        kVar.presentFragment(new yh.g(1, kVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.m0.addView(this.n0, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.o0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new rq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.o0.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: di.c
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        k kVar = this.b;
                        kVar.presentFragment(new yh.g(1, kVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.m0.addView(this.o0, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.g0.addView(frameLayout2, z5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.k0.animate().cancel();
        this.m0.animate().cancel();
        this.m0.setAlpha(this.q0 ? 1.0f : 0.0f);
        this.k0.setAlpha(this.q0 ? 0.0f : 1.0f);
        this.m0.setVisibility(this.q0 ? 0 : 8);
        this.k0.setVisibility(this.q0 ? 8 : 0);
        J0();
        h hVar = this.r0;
        if (hVar != null) {
            hVar.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            w0();
            h hVar = this.r0;
            if (hVar != null) {
                hVar.N(true);
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            t5 y3 = t5.y(this.currentAccount, true);
            if (this.p0 != y3.O(0)) {
                this.p0 = y3.O(0);
                w0();
                h hVar2 = this.r0;
                if (hVar2 != null) {
                    hVar2.N(false);
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            h hVar3 = this.r0;
            if (hVar3 != null) {
                hVar3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            J0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            J0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        return i6.w0(null, i6.i5, false);
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        aw0 aw0Var = this.S;
        return aw0Var == null || motionEvent == null || aw0Var.i0(motionEvent.getX(), motionEvent.getY()) || !this.S.b0() || this.R.getViewPager().b == 0;
    }

    @Override // org.telegram.ui.r20
    public final void l0() {
        aw0 aw0Var;
        super.l0();
        if (this.c0 && (aw0Var = this.S) != null && this.Y != -1) {
            aw0Var.Z();
        }
        this.c0 = false;
    }

    @Override // org.telegram.ui.r20
    public final void m0() {
        this.s.addView(this.S, z5.c(-1.0f, -1));
        this.S.n0(this.c, new a(this, 3));
        aw0 aw0Var = this.S;
        w7 w7Var = this.R;
        g91 viewPager = w7Var.getViewPager();
        w7 w7Var2 = this.R;
        Objects.requireNonNull(w7Var2);
        aw0Var.q0(w7Var, viewPager, new a1.c(w7Var2, 27));
        this.S.r0(this.R.getTabsContainer());
        this.R.getTabsContainer().setLayoutParams(z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        H0();
    }

    @Override // org.telegram.ui.r20
    public final h0 o0() {
        h hVar = new h(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new v(this, 10), getResourceProvider());
        this.r0 = hVar;
        hVar.r = false;
        return hVar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t5.y(this.currentAccount, true).T(true);
        t5.y(this.currentAccount, true).S();
        t5.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        zl0 zl0Var = this.c;
        if (zl0Var != null) {
            zl0Var.removeCallbacks(this.d0);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b0 = true;
        this.Z = i11;
        this.a0 = i13;
        H0();
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.r20
    public final c0 p0(Context context) {
        aw0 aw0Var = this.S;
        aw0Var.getClass();
        return new j0(5, aw0Var, false);
    }

    @Override // org.telegram.ui.r20
    public final y1 q0() {
        return new g(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.r20
    public final boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.r20
    public final View s0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.r20
    public final float t0() {
        zl0 zl0Var = this.c;
        if (zl0Var == null) {
            return 0.0f;
        }
        return zl0Var.getY();
    }

    @Override // org.telegram.ui.r20
    public final View u0() {
        return this.S;
    }

    @Override // org.telegram.ui.r20
    public final void v0(boolean z10) {
        le.b bVar = this.X;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.r20
    public final void w0() {
        super.w0();
        aw0 aw0Var = this.S;
        this.c0 = aw0Var != null && aw0Var.h1;
        zl0 zl0Var = this.c;
        if (zl0Var == null || this.N < 0) {
            return;
        }
        this.O -= zl0Var.getPaddingTop();
    }
}
