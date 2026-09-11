package ei;

import ah.y;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.u;
import di.eb;
import fi.e4;
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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.cc1;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import s4.h0;
import s4.j;
import sg.z1;
import ug.n1;
import w7.x5;
import zh.o;
import zh.s5;
import zh.u7;
import zh.v7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class i extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public tg.e Q;
    public u7 R;
    public eb S;
    public final boolean T = B0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public q6 W;
    public q6 X;
    public y Y;
    public di.d Z;
    public cc1 a0;
    public di.d b0;
    public di.d c0;
    public boolean d0;
    public boolean e0;
    public e f0;

    public i() {
        this.M = true;
    }

    public static boolean B0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void x0(i iVar, int i10) {
        h51 G;
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
            s5.y(iVar.currentAccount, true).u();
            n1.e0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
        } else if (i11 == -3) {
            s5.y(iVar.currentAccount, true).W();
            iVar.f0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(iVar.currentAccount);
            } else {
                iVar.presentFragment(new e4(iVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void C0(ArrayList arrayList, v51 v51Var) {
        if (getParentActivity() == null) {
            return;
        }
        s5 y3 = s5.y(this.currentAccount, true);
        eb ebVar = (eb) super.r0(getParentActivity());
        h51 h51Var = new h51(-2);
        h51Var.c = ebVar;
        arrayList.add(h51Var);
        arrayList.add(h51.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            i2.g.A(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.d0 = O;
        if (!O) {
            arrayList.add(h51.l(this.S));
            return;
        }
        if (!z10) {
            arrayList.add(h51.B(null));
        }
        arrayList.add(h51.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void D0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        s5 y3 = s5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) v7.J0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.X.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = o.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
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

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new u7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new eb(this, context, 1);
        super.createView(context);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        tg.e eVar = new tg.e(context, 1, 4);
        this.Q = eVar;
        tg.a aVar = eVar.b;
        aVar.w = j6.fk;
        aVar.x = j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new a(context, 0)), true), this.P, null);
        this.c.setOverScrollMode(2);
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new bi.d(this, 6));
        this.s.addView(new r00(getParentActivity()), x5.c(-1.0f, -1));
        s5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        q6 q6Var = new q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(j6.v0(j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        nq nqVar = new nq(R.drawable.mini_gram_72, 0);
        nqVar.setOverrideColor(-13397548);
        nqVar.setScale(0.5f, 0.5f);
        nqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(nqVar, 0, 1, 33);
        this.U.addView(this.W, x5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        q6 q6Var2 = new q6(getParentActivity(), false, false, false);
        this.X = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(j6.v0(j6.z6, this.resourceProvider));
        this.U.addView(this.X, x5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        y yVar = new y(this, getParentActivity(), 4);
        this.Y = yVar;
        frameLayout2.addView(yVar);
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
                            of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            i iVar = this.b;
                            iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.Y.addView(this.Z, x5.e(-1, 48, 119));
        }
        cc1 cc1Var = new cc1(this, getParentActivity(), 1);
        this.a0 = cc1Var;
        frameLayout2.addView(cc1Var);
        di.d dVar2 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new nq(R.drawable.mini_topup, 2), 0, 1, 33);
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
                        of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.a0.addView(this.b0, x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        di.d dVar3 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new nq(R.drawable.mini_stats, 2), 0, 1, 33);
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
                        of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        of.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.a0.addView(this.c0, x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, x5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.Y.animate().cancel();
        this.a0.animate().cancel();
        this.a0.setAlpha(this.e0 ? 1.0f : 0.0f);
        this.Y.setAlpha(this.e0 ? 0.0f : 1.0f);
        this.a0.setVisibility(this.e0 ? 0 : 8);
        this.Y.setVisibility(this.e0 ? 8 : 0);
        D0();
        e eVar2 = this.f0;
        if (eVar2 != null) {
            eVar2.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
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
            s5 y3 = s5.y(this.currentAccount, true);
            if (this.d0 != y3.O(0)) {
                this.d0 = y3.O(0);
                s0();
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
            D0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            D0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        return j6.w0(null, j6.i5, false);
    }

    @Override // org.telegram.ui.r20
    public final h0 n0() {
        e eVar = new e(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new u(this, 10), getResourceProvider());
        this.f0 = eVar;
        eVar.r = false;
        return eVar;
    }

    @Override // org.telegram.ui.r20
    public final q20 o0() {
        return new f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        s5.y(this.currentAccount, true).T(true);
        s5.y(this.currentAccount, true).S();
        s5.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        tg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        tg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.r20
    public final z1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.r20
    public final boolean q0() {
        u7 u7Var = this.R;
        boolean z10 = false;
        if (u7Var != null && (u7Var.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.r20
    public final View r0(Context context) {
        throw null;
    }
}
