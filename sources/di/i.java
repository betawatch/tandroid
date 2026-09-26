package di;

import ai.f0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.v;
import ci.bb;
import ei.e4;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.l20;
import org.telegram.ui.m20;
import org.telegram.ui.ub1;
import rg.w1;
import s4.h0;
import s4.j;
import tg.m1;
import w7.y5;
import yh.o;
import yh.s5;
import yh.v7;
import yh.w7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class i extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public sg.e Q;
    public v7 R;
    public bb S;
    public final boolean T = B0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public p6 W;
    public p6 X;
    public f0 Y;
    public ci.d Z;
    public ub1 a0;
    public ci.d b0;
    public ci.d c0;
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
        v51 G;
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
            m1.e0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
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

    public final void C0(ArrayList arrayList, j61 j61Var) {
        if (getParentActivity() == null) {
            return;
        }
        s5 y3 = s5.y(this.currentAccount, true);
        bb bbVar = (bb) super.r0(getParentActivity());
        v51 v51Var = new v51(-2);
        v51Var.c = bbVar;
        arrayList.add(v51Var);
        arrayList.add(v51.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            hg.c.n(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.d0 = O;
        if (!O) {
            arrayList.add(v51.l(this.S));
            return;
        }
        if (!z10) {
            arrayList.add(v51.B(null));
        }
        arrayList.add(v51.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void D0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        s5 y3 = s5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) w7.J0(p5, 0.66f, ' '));
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
        this.Y.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: di.c
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
        this.a0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: di.c
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

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new v7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new bb(this, context, 1);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 4);
        this.Q = eVar;
        sg.a aVar = eVar.b;
        aVar.w = h6.fk;
        aVar.x = h6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, y5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new a(context, 0)), true), this.P, null);
        this.c.setOverScrollMode(2);
        j jVar = new j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ai.g(this, 6));
        this.s.addView(new s00(getParentActivity()), y5.c(-1.0f, -1));
        s5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        p6 p6Var = new p6(getParentActivity(), false, true, false);
        this.W = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(h6.v0(h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        pq pqVar = new pq(R.drawable.mini_gram_72, 0);
        pqVar.setOverrideColor(-13397548);
        pqVar.setScale(0.5f, 0.5f);
        pqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(pqVar, 0, 1, 33);
        this.U.addView(this.W, y5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        p6 p6Var2 = new p6(getParentActivity(), false, false, false);
        this.X = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(h6.v0(h6.z6, this.resourceProvider));
        this.U.addView(this.X, y5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        f0 f0Var = new f0(this, getParentActivity(), 3);
        this.Y = f0Var;
        frameLayout2.addView(f0Var);
        boolean z10 = this.T;
        if (z10) {
            ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: di.b
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            i iVar = this.b;
                            iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.Y.addView(this.Z, y5.e(-1, 48, 119));
        }
        ub1 ub1Var = new ub1(this, getParentActivity(), 1);
        this.a0 = ub1Var;
        frameLayout2.addView(ub1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new pq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.b0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: di.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z10) {
            this.a0.addView(this.b0, y5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new pq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.c0.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: di.b
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        nf.f.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        i iVar = this.b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.a0.addView(this.c0, y5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, y5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
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

    @Override // org.telegram.ui.ActionBar.m2
    public final int getNavigationBarColor() {
        return h6.w0(null, h6.i5, false);
    }

    @Override // org.telegram.ui.m20
    public final h0 n0() {
        e eVar = new e(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new v(this, 10), getResourceProvider());
        this.f0 = eVar;
        eVar.r = false;
        return eVar;
    }

    @Override // org.telegram.ui.m20
    public final l20 o0() {
        return new f(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.m2
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.m20
    public final w1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.m20
    public final boolean q0() {
        v7 v7Var = this.R;
        boolean z10 = false;
        if (v7Var != null && (v7Var.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.m20
    public final View r0(Context context) {
        throw null;
    }
}
