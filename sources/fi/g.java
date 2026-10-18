package fi;

import ah.x;
import ai.ga;
import ai.ic;
import ai.k0;
import ai.ld;
import ai.md;
import ai.q;
import ai.ra;
import ai.wa;
import ai.wc;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gi.u3;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Wallet.s6;
import org.telegram.ui.a20;
import org.telegram.ui.sa1;
import org.telegram.ui.x10;
import org.telegram.ui.z10;
import s4.g0;
import sg.w1;
import ug.m1;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class g extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public s6 Q;
    public ld R;
    public ic S;
    public final boolean T = C0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public q6 W;
    public q6 X;
    public x Y;
    public ei.d Z;
    public sa1 a0;
    public ei.d b0;
    public ei.d c0;
    public boolean d0;
    public boolean e0;
    public d f0;

    public g() {
        this.M = true;
    }

    public static boolean C0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void y0(g gVar, int i10) {
        f61 G;
        d dVar = gVar.f0;
        if (dVar == null || (G = dVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            gVar.f0.N(true);
            return;
        }
        if (i11 == -2) {
            ga.y(gVar.currentAccount, true).u();
            m1.f0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
        } else if (i11 == -3) {
            ga.y(gVar.currentAccount, true).W();
            gVar.f0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new u3(gVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void D0(ArrayList arrayList, s61 s61Var) {
        if (getParentActivity() == null) {
            return;
        }
        ga y3 = ga.y(this.currentAccount, true);
        x10 x10Var = (x10) super.r0(getParentActivity());
        f61 f61Var = new f61(-2);
        f61Var.c = x10Var;
        arrayList.add(f61Var);
        arrayList.add(f61.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            i2.d.B(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.d0 = O;
        if (!O) {
            arrayList.add(f61.l(this.S));
            return;
        }
        if (!z10) {
            arrayList.add(f61.B(null));
        }
        arrayList.add(f61.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void E0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        ga y3 = ga.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) md.K0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.X.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = k0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        this.Y.setVisibility(0);
        this.a0.setVisibility(0);
        final int i11 = 0;
        this.Y.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: fi.b
            public final /* synthetic */ g b;

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
        this.a0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: fi.b
            public final /* synthetic */ g b;

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

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new ld(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new ic(this, context, 2);
        super.createView(context);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        s6 s6Var = new s6(170, context, false);
        this.Q = s6Var;
        s6Var.setStarParticlesView(this.e);
        this.P.addView(this.Q, z5.a(170.0f, 0.0f, 32.0f, 0.0f, 12.0f, 170, 17));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new ra(context, 7)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new wa(this, 10));
        this.s.addView(new z00(getParentActivity()), z5.d(-1.0f, -1));
        ga.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        q6 q6Var = new q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(h6.w0(h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        yq yqVar = new yq(R.drawable.mini_gram_72, 0);
        yqVar.recolorDrawable = false;
        yqVar.setScale(0.5f, 0.5f);
        yqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(yqVar, 0, 1, 33);
        this.U.addView(this.W, z5.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        q6 q6Var2 = new q6(getParentActivity(), false, false, false);
        this.X = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(h6.w0(h6.z6, this.resourceProvider));
        this.U.addView(this.X, z5.a(20.0f, 24.0f, 0.0f, 24.0f, 8.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x xVar = new x(this, getParentActivity(), 5);
        this.Y = xVar;
        frameLayout2.addView(xVar);
        boolean z10 = this.T;
        if (z10) {
            ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            g gVar = this.b;
                            gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.Y.addView(this.Z, z5.e(-1, 48, 119));
        }
        sa1 sa1Var = new sa1(this, getParentActivity(), 3);
        this.a0 = sa1Var;
        frameLayout2.addView(sa1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.b0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.a0.addView(this.b0, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new yq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.c0.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        pf.d.t(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.a0.addView(this.c0, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, z5.a(48.0f, 20.0f, 6.0f, 20.0f, 4.0f, -1, 17));
        this.Y.animate().cancel();
        this.a0.animate().cancel();
        this.a0.setAlpha(this.e0 ? 1.0f : 0.0f);
        this.Y.setAlpha(this.e0 ? 0.0f : 1.0f);
        this.a0.setVisibility(this.e0 ? 0 : 8);
        this.Y.setVisibility(this.e0 ? 8 : 0);
        E0();
        d dVar4 = this.f0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            d dVar = this.f0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            ga y3 = ga.y(this.currentAccount, true);
            if (this.d0 != y3.O(0)) {
                this.d0 = y3.O(0);
                t0();
                d dVar2 = this.f0;
                if (dVar2 != null) {
                    dVar2.N(true);
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
            d dVar3 = this.f0;
            if (dVar3 != null) {
                dVar3.N(true);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        return h6.x0(null, h6.i5, false);
    }

    @Override // org.telegram.ui.a20
    public final g0 n0() {
        d dVar = new d(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 21), getResourceProvider());
        this.f0 = dVar;
        dVar.r = false;
        return dVar;
    }

    @Override // org.telegram.ui.a20
    public final z10 o0() {
        return new wc(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ga.y(this.currentAccount, true).T(true);
        ga.y(this.currentAccount, true).S();
        ga.y(this.currentAccount, true).z();
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
        s6 s6Var = this.Q;
        if (s6Var != null) {
            s6Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        s6 s6Var = this.Q;
        if (s6Var != null) {
            s6Var.setPaused(false);
        }
    }

    @Override // org.telegram.ui.a20
    public final w1 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.a20
    public final boolean q0() {
        ld ldVar = this.R;
        boolean z10 = false;
        if (ldVar != null && (ldVar.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.a20
    public final View r0(Context context) {
        throw null;
    }

    @Override // org.telegram.ui.a20
    public final void s0(float f7) {
        s6 s6Var = this.Q;
        if (s6Var != null) {
            s6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
