package lh;

import ag.j;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bg.g3;
import f2.n;
import f2.r0;
import fh.d2;
import fh.l2;
import g7.e6;
import gh.c0;
import gh.na;
import gh.oa;
import gh.r;
import gh.v7;
import gh.z9;
import java.util.ArrayList;
import kh.b8;
import mh.u3;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ta1;
import org.telegram.ui.w10;
import org.telegram.ui.x10;
import zf.w1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout L;
    public j M;
    public na N;
    public l2 O;
    public final boolean P = A0();
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public j6 S;
    public j6 T;
    public d2 U;
    public kh.d V;
    public ta1 W;
    public kh.d X;
    public kh.d Y;
    public boolean Z;
    public boolean a0;
    public d b0;

    public g() {
        this.I = true;
    }

    public static boolean A0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void w0(g gVar, int i9) {
        l41 G;
        d dVar = gVar.b0;
        if (dVar == null || (G = dVar.G(i9)) == null) {
            return;
        }
        int i10 = G.d;
        if (i10 == -1) {
            gVar.b0.N(true);
            return;
        }
        if (i10 == -2) {
            v7.y(gVar.currentAccount, true).u();
            g3.d0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
        } else if (i10 == -3) {
            v7.y(gVar.currentAccount, true).W();
            gVar.b0.N(true);
        } else if (i10 == -4) {
            if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new u3(gVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void B0(ArrayList arrayList, z41 z41Var) {
        if (getParentActivity() == null) {
            return;
        }
        v7 y10 = v7.y(this.currentAccount, true);
        l2 l2Var = (l2) super.q0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = l2Var;
        arrayList.add(l41Var);
        arrayList.add(l41.k(this.Q));
        boolean z10 = this.P;
        if (z10) {
            j2.y(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y10.O(0);
        this.Z = O;
        if (!O) {
            arrayList.add(l41.l(this.O));
            return;
        }
        if (!z10) {
            arrayList.add(l41.B(null));
        }
        arrayList.add(l41.p(this.N, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void C0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        v7 y10 = v7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p6 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) oa.I0(p6, 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        int i9 = (int) ((p6.amount / 1.0E9d) * d * 100.0d);
        if (i9 > 0) {
            this.T.setText("≈" + BillingController.getInstance().formatCurrency(i9, "USD"));
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
        final int i10 = 0;
        this.U.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: lh.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
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
        final int i11 = 1;
        this.W.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: lh.b
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
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.O = new l2(this, context, 3);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        j jVar = new j(context, 1, 4);
        this.M = jVar;
        ag.a aVar = jVar.b;
        aVar.w = f6.fk;
        aVar.x = f6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.e);
        this.L.addView(this.M, e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        l0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.f(context, 11)), true), this.L, null);
        this.c.setOverScrollMode(2);
        n nVar = new n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.c.setItemAnimator(nVar);
        this.c.setOnItemClickListener(new eh.j(this, 13));
        this.s.addView(new c00(getParentActivity()), e6.c(-1.0f, -1));
        v7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        j6 j6Var = new j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(f6.v0(f6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        eq eqVar = new eq(R.drawable.mini_gram_72, 0);
        eqVar.setOverrideColor(-13397548);
        eqVar.setScale(0.5f, 0.5f);
        eqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.R.setSpan(eqVar, 0, 1, 33);
        this.Q.addView(this.S, e6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        j6 j6Var2 = new j6(getParentActivity(), false, false, false);
        this.T = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        this.T.setTextColor(f6.v0(f6.z6, this.resourceProvider));
        this.Q.addView(this.T, e6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        d2 d2Var = new d2(this, getParentActivity(), 7);
        this.U = d2Var;
        frameLayout2.addView(d2Var);
        boolean z10 = this.P;
        if (z10) {
            kh.d dVar = new kh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.V = dVar;
            dVar.e();
            this.V.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i9 = 0;
            this.V.setOnClickListener(new View.OnClickListener(this) { // from class: lh.a
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            g gVar = this.b;
                            gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.U.addView(this.V, e6.e(-1, 48, 119));
        }
        ta1 ta1Var = new ta1(this, getParentActivity(), 4);
        this.W = ta1Var;
        frameLayout2.addView(ta1Var);
        kh.d dVar2 = new kh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.X = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.X.g(spannableStringBuilder, false, true);
        final int i10 = 1;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: lh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.W.addView(this.X, e6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        kh.d dVar3 = new kh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Y = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i11 = 2;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: lh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        ve.e.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.W.addView(this.Y, e6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, e6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.U.animate().cancel();
        this.W.animate().cancel();
        this.W.setAlpha(this.a0 ? 1.0f : 0.0f);
        this.U.setAlpha(this.a0 ? 0.0f : 1.0f);
        this.W.setVisibility(this.a0 ? 0 : 8);
        this.U.setVisibility(this.a0 ? 8 : 0);
        C0();
        d dVar4 = this.b0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starOptionsLoaded) {
            r0();
            d dVar = this.b0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            k0();
            return;
        }
        if (i9 == NotificationCenter.starTransactionsLoaded) {
            v7 y10 = v7.y(this.currentAccount, true);
            if (this.Z != y10.O(0)) {
                this.Z = y10.O(0);
                r0();
                d dVar2 = this.b0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                k0();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.b0;
            if (dVar3 != null) {
                dVar3.N(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starBalanceUpdated) {
            C0();
        } else if (i9 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            C0();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getNavigationBarColor() {
        return f6.w0(null, f6.i5, false);
    }

    @Override // org.telegram.ui.x10
    public final r0 m0() {
        d dVar = new d(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new b8(this, 3), getResourceProvider());
        this.b0 = dVar;
        dVar.r = false;
        return dVar;
    }

    @Override // org.telegram.ui.x10
    public final w10 n0() {
        return new z9(this, getParentActivity());
    }

    @Override // org.telegram.ui.x10
    public final w1 o0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v7.y(this.currentAccount, true).T(true);
        v7.y(this.currentAccount, true).S();
        v7.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.x10
    public final boolean p0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.x10
    public final View q0(Context context) {
        throw null;
    }
}
