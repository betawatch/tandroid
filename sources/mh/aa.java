package mh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class aa extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout U;
    public w51 V;
    public boolean W;

    public aa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, 1, g6Var);
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ag.h(this, 11));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        g90 g90Var = new g90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        g90Var.setTextSize(1, 12.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
        g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new lh.c3(this, 18)));
        g90Var.setGravity(17);
        g90Var.setMaxWidth(qh.e3.a(g90Var.getText(), g90Var.getPaint()));
        frameLayout.addView(g90Var, k7.c6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        this.containerView.addView(new s00(getContext()), k7.c6.c(-1.0f, -1));
        w51 w51Var = this.V;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(aa aaVar, int i10) {
        h51 G;
        w51 w51Var = aaVar.V;
        if (w51Var == null || (G = w51Var.G(i10 - 1)) == null) {
            return;
        }
        w51 w51Var2 = aaVar.V;
        if (G.d == -1) {
            aaVar.W = !aaVar.W;
            w51Var2.N(true);
            aaVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(aaVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.D1;
            }
            if (findActivity == null) {
                return;
            }
            t7.y(aaVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new eh.w(6, aaVar, G), null);
        }
    }

    public static void Q(aa aaVar, h51 h51Var, Boolean bool, String str) {
        if (aaVar.getContext() == null) {
            return;
        }
        aaVar.dismiss();
        t7.y(aaVar.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            qc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h51Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.u0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        yh.r(R.string.TelegramStarsChoose, arrayList);
        ArrayList z4 = t7.y(this.currentAccount, false).z();
        if (z4 == null || z4.isEmpty()) {
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z4.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z4.get(i12);
                if (!tL_starsTopupOption.extended || this.W) {
                    arrayList.add(v9.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z10 = this.W;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.W;
                int i13 = p9.a;
                h51 J = h51.J(p9.class);
                J.d = -1;
                J.l = string;
                J.f = z11;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(h51.k(this.U));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w51Var = this.V) != null) {
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        jk jkVar;
        long j10 = t7.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 22), this.resourcesProvider);
        this.V = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
