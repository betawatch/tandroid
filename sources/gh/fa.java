package gh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class fa extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout T;
    public z41 U;
    public boolean V;

    public fa(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, false, 1, b6Var);
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new eh.j(this, 6));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        l80 l80Var = new l80(context, b6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        l80Var.setTextSize(1, 12.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new fh.o1(this, 21)));
        l80Var.setGravity(17);
        l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()));
        frameLayout.addView(l80Var, g7.e6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        this.containerView.addView(new c00(getContext()), g7.e6.c(-1.0f, -1));
        z41 z41Var = this.U;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    public static void O(fa faVar, int i9) {
        l41 G;
        z41 z41Var = faVar.U;
        if (z41Var == null || (G = z41Var.G(i9 - 1)) == null) {
            return;
        }
        z41 z41Var2 = faVar.U;
        if (G.d == -1) {
            faVar.V = !faVar.V;
            z41Var2.N(true);
            faVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(aa.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(faVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            if (findActivity == null) {
                return;
            }
            v7.y(faVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bg.y0(5, faVar, G), null);
        }
    }

    public static void P(fa faVar, l41 l41Var, Boolean bool, String str) {
        if (faVar.getContext() == null) {
            return;
        }
        faVar.dismiss();
        v7.y(faVar.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            oc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l41Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.t0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, oc.a0(U), R.raw.error, 36);
        }
    }

    public final void Q(ArrayList arrayList, z41 z41Var) {
        org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = v7.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
            arrayList.add(l41.n(31));
        } else {
            int i9 = 0;
            int i10 = 1;
            for (int i11 = 0; i11 < z10.size(); i11++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i11);
                if (!tL_starsTopupOption.extended || this.V) {
                    arrayList.add(aa.a(i11, i10, tL_starsTopupOption));
                    i10++;
                } else {
                    i9++;
                }
            }
            boolean z11 = this.V;
            if (!z11 && i9 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.V;
                int i12 = t9.a;
                l41 J = l41.J(t9.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(l41.k(this.T));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if ((i9 == NotificationCenter.starOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) && (z41Var = this.U) != null) {
            z41Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        ak akVar;
        long j10 = v7.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.x9() && (akVar = qnVar.U) != null) {
                akVar.O();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 21), this.resourcesProvider);
        this.U = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
