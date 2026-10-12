package ei;

import ah.x;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.u;
import di.ab;
import fi.f4;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.ic1;
import org.telegram.ui.u20;
import org.telegram.ui.v20;
import s4.g0;
import sg.x1;
import ug.m1;
import w7.a6;
import zh.n5;
import zh.o7;
import zh.p;
import zh.p7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public b6 Q;
    public o7 R;
    public ab S;
    public final boolean T = C0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public s6 W;
    public s6 X;
    public x Y;
    public di.d Z;
    public ic1 a0;
    public di.d b0;
    public di.d c0;
    public boolean d0;
    public boolean e0;
    public e f0;

    public i() {
        this.M = true;
    }

    public static boolean C0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void y0(i iVar, int i10) {
        l61 G;
        e eVar = iVar.f0;
        if (eVar == null || (G = eVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            iVar.f0.N(true);
            return;
        }
        if (i11 == -2) {
            n5.y(iVar.currentAccount, true).u();
            m1.f0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
        } else if (i11 == -3) {
            n5.y(iVar.currentAccount, true).W();
            iVar.f0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(iVar.currentAccount);
            } else {
                iVar.presentFragment(new f4(iVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void D0(ArrayList arrayList, z61 z61Var) {
        if (getParentActivity() == null) {
            return;
        }
        n5 y3 = n5.y(this.currentAccount, true);
        ab abVar = (ab) super.r0(getParentActivity());
        l61 l61Var = new l61(-2);
        l61Var.c = abVar;
        arrayList.add(l61Var);
        arrayList.add(l61.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            i2.d.y(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.d0 = O;
        if (!O) {
            arrayList.add(l61.l(this.S));
            return;
        }
        if (!z10) {
            arrayList.add(l61.B(null));
        }
        arrayList.add(l61.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void E0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        n5 y3 = n5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) p7.K0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.X.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = p.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        this.Y.setVisibility(0);
        this.a0.setVisibility(0);
        final int i11 = 0;
        this.Y.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ei.c
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z10) {
                            this.b.Y.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.a0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        final int i12 = 1;
        this.a0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ei.c
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z10) {
                            this.b.Y.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.a0.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new o7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new ab(this, context, 1);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        b6 b6Var = new b6(170, context, false);
        this.Q = b6Var;
        b6Var.setStarParticlesView(this.e);
        this.P.addView(this.Q, a6.a(170.0f, 0.0f, 32.0f, 0.0f, 12.0f, 170, 17));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new a(context, 0)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new bi.d(this, 6));
        this.s.addView(new d10(getParentActivity()), a6.d(-1.0f, -1));
        n5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        s6 s6Var = new s6(getParentActivity(), false, true, false);
        this.W = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(g6.w0(g6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        br brVar = new br(R.drawable.mini_gram_72, 0);
        brVar.recolorDrawable = false;
        brVar.setScale(0.5f, 0.5f);
        brVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(brVar, 0, 1, 33);
        this.U.addView(this.W, a6.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        s6 s6Var2 = new s6(getParentActivity(), false, false, false);
        this.X = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(g6.w0(g6.z6, this.resourceProvider));
        this.U.addView(this.X, a6.a(20.0f, 24.0f, 0.0f, 24.0f, 8.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x xVar = new x(this, getParentActivity(), 3);
        this.Y = xVar;
        frameLayout2.addView(xVar);
        boolean z10 = this.T;
        if (z10) {
            di.d dVar = new di.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: ei.b
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            i iVar = this.b;
                            iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.Y.addView(this.Z, a6.e(-1, 48, 119));
        }
        ic1 ic1Var = new ic1(this, getParentActivity(), 1);
        this.a0 = ic1Var;
        frameLayout2.addView(ic1Var);
        di.d dVar2 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new br(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.b0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: ei.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.a0.addView(this.b0, a6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        di.d dVar3 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new br(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.c0.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: ei.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        pf.d.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.a0.addView(this.c0, a6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, a6.a(48.0f, 20.0f, 6.0f, 20.0f, 4.0f, -1, 17));
        this.Y.animate().cancel();
        this.a0.animate().cancel();
        this.a0.setAlpha(this.e0 ? 1.0f : 0.0f);
        this.Y.setAlpha(this.e0 ? 0.0f : 1.0f);
        this.a0.setVisibility(this.e0 ? 0 : 8);
        this.Y.setVisibility(this.e0 ? 8 : 0);
        E0();
        e eVar = this.f0;
        if (eVar != null) {
            eVar.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            e eVar = this.f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            n5 y3 = n5.y(this.currentAccount, true);
            if (this.d0 != y3.O(0)) {
                this.d0 = y3.O(0);
                t0();
                e eVar2 = this.f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f0;
            if (eVar3 != null) {
                eVar3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            E0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final int getNavigationBarColor() {
        return g6.x0(null, g6.i5, false);
    }

    @Override // org.telegram.ui.v20
    public final g0 n0() {
        e eVar = new e(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new u(this, 10), getResourceProvider());
        this.f0 = eVar;
        eVar.r = false;
        return eVar;
    }

    @Override // org.telegram.ui.v20
    public final u20 o0() {
        return new f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        n5.y(this.currentAccount, true).T(true);
        n5.y(this.currentAccount, true).S();
        n5.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        b6 b6Var = this.Q;
        if (b6Var != null) {
            b6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.v20, org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        b6 b6Var = this.Q;
        if (b6Var != null) {
            b6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.v20
    public final x1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.v20
    public final boolean q0() {
        o7 o7Var = this.R;
        boolean z10 = false;
        if (o7Var != null && (o7Var.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.v20
    public final View r0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.v20
    public final void s0(float f7) {
        b6 b6Var = this.Q;
        if (b6Var != null) {
            b6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
