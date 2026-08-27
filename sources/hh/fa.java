package hh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class fa extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout T;
    public b51 U;
    public boolean V;

    public fa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, 1, c6Var);
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ag.p0(this, 8));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        p80 p80Var = new p80(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new y9(this, 2)));
        p80Var.setGravity(17);
        p80Var.setMaxWidth(lh.w3.a(p80Var.getText(), p80Var.getPaint()));
        frameLayout.addView(p80Var, h7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        this.containerView.addView(new f00(getContext()), h7.z5.c(-1.0f, -1));
        b51 b51Var = this.U;
        if (b51Var != null) {
            b51Var.N(false);
        }
    }

    public static void P(fa faVar, int i10) {
        n41 G;
        b51 b51Var = faVar.U;
        if (b51Var == null || (G = b51Var.G(i10 - 1)) == null) {
            return;
        }
        b51 b51Var2 = faVar.U;
        if (G.d == -1) {
            faVar.V = !faVar.V;
            b51Var2.N(true);
            faVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(aa.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(faVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null) {
                return;
            }
            u7.y(faVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new cg.u0(5, faVar, G), null);
        }
    }

    public static void Q(fa faVar, n41 n41Var, Boolean bool, String str) {
        if (faVar.getContext() == null) {
            return;
        }
        faVar.dismiss();
        u7.y(faVar.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            mc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) n41Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.t0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, mc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, b51 b51Var) {
        org.telegram.ui.Cells.pa.o(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = u7.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
            arrayList.add(n41.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.V) {
                    arrayList.add(aa.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.V;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.V;
                int i13 = s9.a;
                n41 J = n41.J(s9.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(n41.k(this.T));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (b51Var = this.U) != null) {
            b51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        ck ckVar;
        long j10 = u7.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof rn) {
            rn rnVar = (rn) R;
            if (rnVar.x9() && (ckVar = rnVar.U) != null) {
                ckVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 21), this.resourcesProvider);
        this.U = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
