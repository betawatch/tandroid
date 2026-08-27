package mh;

import ag.k3;
import ag.p0;
import ag.p1;
import ag.s0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bg.i;
import cg.y2;
import f2.l;
import f2.q0;
import h7.z5;
import hh.c0;
import hh.na;
import hh.oa;
import hh.r;
import hh.u7;
import hh.z9;
import java.util.ArrayList;
import lh.a8;
import nh.s3;
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
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.n41;
import org.telegram.ui.a20;
import org.telegram.ui.ra1;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout L;
    public i M;
    public na N;
    public s0 O;
    public final boolean P = B0();
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public j6 S;
    public j6 T;
    public p1 U;
    public lh.d V;
    public ra1 W;
    public lh.d X;
    public lh.d Y;
    public boolean Z;
    public boolean a0;
    public d b0;

    public g() {
        this.I = true;
    }

    public static boolean B0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void x0(g gVar, int i10) {
        n41 G;
        d dVar = gVar.b0;
        if (dVar == null || (G = dVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            gVar.b0.N(true);
            return;
        }
        if (i11 == -2) {
            u7.y(gVar.currentAccount, true).u();
            y2.e0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
        } else if (i11 == -3) {
            u7.y(gVar.currentAccount, true).W();
            gVar.b0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new s3(gVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void C0(ArrayList arrayList, b51 b51Var) {
        if (getParentActivity() == null) {
            return;
        }
        u7 y10 = u7.y(this.currentAccount, true);
        s0 s0Var = (s0) super.r0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.c = s0Var;
        arrayList.add(n41Var);
        arrayList.add(n41.k(this.Q));
        boolean z10 = this.P;
        if (z10) {
            pa.A(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y10.O(0);
        this.Z = O;
        if (!O) {
            arrayList.add(n41.l(this.O));
            return;
        }
        if (!z10) {
            arrayList.add(n41.B(null));
        }
        arrayList.add(n41.p(this.N, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void D0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        u7 y10 = u7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p6 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) oa.J0(p6, 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        int i10 = (int) ((p6.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.T.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = c0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.a0 == z10) {
            return;
        }
        this.a0 = z10;
        this.U.setVisibility(0);
        this.W.setVisibility(0);
        final int i11 = 0;
        this.U.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: mh.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z10) {
                            this.b.U.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.W.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        final int i12 = 1;
        this.W.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: mh.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z10) {
                            this.b.U.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.b.W.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.O = new s0(this, context, 4);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        i iVar = new i(context, 1, 4);
        this.M = iVar;
        bg.a aVar = iVar.b;
        aVar.w = g6.fk;
        aVar.x = g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.e);
        this.L.addView(this.M, z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.e(context, 11)), true), this.L, null);
        this.c.setOverScrollMode(2);
        l lVar = new l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new p0(this, 15));
        this.s.addView(new f00(getParentActivity()), z5.c(-1.0f, -1));
        u7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        j6 j6Var = new j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(g6.v0(g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        cq cqVar = new cq(R.drawable.mini_gram_72, 0);
        cqVar.setOverrideColor(-13397548);
        cqVar.setScale(0.5f, 0.5f);
        cqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.R.setSpan(cqVar, 0, 1, 33);
        this.Q.addView(this.S, z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        j6 j6Var2 = new j6(getParentActivity(), false, false, false);
        this.T = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        this.T.setTextColor(g6.v0(g6.z6, this.resourceProvider));
        this.Q.addView(this.T, z5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        p1 p1Var = new p1(this, getParentActivity(), 10);
        this.U = p1Var;
        frameLayout2.addView(p1Var);
        boolean z10 = this.P;
        if (z10) {
            lh.d dVar = new lh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.V = dVar;
            dVar.e();
            this.V.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.V.setOnClickListener(new View.OnClickListener(this) { // from class: mh.a
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            g gVar = this.b;
                            gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.U.addView(this.V, z5.e(-1, 48, 119));
        }
        ra1 ra1Var = new ra1(this, getParentActivity(), 5);
        this.W = ra1Var;
        frameLayout2.addView(ra1Var);
        lh.d dVar2 = new lh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.X = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new cq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.X.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: mh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.W.addView(this.X, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        lh.d dVar3 = new lh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Y = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new cq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: mh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        we.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.W.addView(this.Y, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, z5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.U.animate().cancel();
        this.W.animate().cancel();
        this.W.setAlpha(this.a0 ? 1.0f : 0.0f);
        this.U.setAlpha(this.a0 ? 0.0f : 1.0f);
        this.W.setVisibility(this.a0 ? 0 : 8);
        this.U.setVisibility(this.a0 ? 8 : 0);
        D0();
        d dVar4 = this.b0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            d dVar = this.b0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            u7 y10 = u7.y(this.currentAccount, true);
            if (this.Z != y10.O(0)) {
                this.Z = y10.O(0);
                s0();
                d dVar2 = this.b0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.b0;
            if (dVar3 != null) {
                dVar3.N(true);
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
        return g6.w0(null, g6.i5, false);
    }

    @Override // org.telegram.ui.a20
    public final q0 n0() {
        d dVar = new d(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new a8(this, 3), getResourceProvider());
        this.b0 = dVar;
        dVar.r = false;
        return dVar;
    }

    @Override // org.telegram.ui.a20
    public final z10 o0() {
        return new z9(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        u7.y(this.currentAccount, true).T(true);
        u7.y(this.currentAccount, true).S();
        u7.y(this.currentAccount, true).z();
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

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.a20
    public final k3 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.a20
    public final boolean q0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.a20
    public final View r0(Context context) {
        throw null;
    }
}
