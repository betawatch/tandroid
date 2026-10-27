package bi;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class uc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public k71 Y;
    public boolean Z;

    public uc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, u6Var);
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.k(this, 4));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        aa0 aa0Var = new aa0(context, u6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        aa0Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.B6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new u6(this, 6)));
        aa0Var.setGravity(17);
        aa0Var.setMaxWidth(fi.v3.a(aa0Var.getText(), aa0Var.getPaint()));
        frameLayout.addView(aa0Var, kb1.i(-2, -1, 17));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, u6Var);
        this.containerView.addView(new z00(getContext()), kb1.g(-1.0f, -1));
        k71 k71Var = this.Y;
        if (k71Var != null) {
            k71Var.O(false);
        }
    }

    public static void P(uc ucVar, int i10) {
        u61 G;
        k71 k71Var = ucVar.Y;
        if (k71Var == null || (G = k71Var.G(i10 - 1)) == null) {
            return;
        }
        k71 k71Var2 = ucVar.Y;
        if (G.d == -1) {
            ucVar.Z = !ucVar.Z;
            k71Var2.O(true);
            ucVar.d.w0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(ucVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.I1;
            }
            if (findActivity == null) {
                return;
            }
            ca.y(ucVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new m5(3, ucVar, G), null);
        }
    }

    public static void Q(uc ucVar, u61 u61Var, Boolean bool, String str) {
        if (ucVar.getContext() == null) {
            return;
        }
        ucVar.dismiss();
        ca.y(ucVar.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) u61Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, k71 k71Var) {
        ic.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = ca.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
            arrayList.add(u61.p(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(oc.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = ic.a;
                u61 K = u61.K(ic.class);
                K.d = -1;
                K.l = string;
                K.f = z12;
                K.q = true;
                arrayList.add(K);
            }
        }
        arrayList.add(u61.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k71Var = this.Y) != null) {
            k71Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        jk jkVar;
        long j10 = ca.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.I9() && (jkVar = wnVar.Y) != null) {
                jkVar.L();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 12), this.resourcesProvider);
        this.Y = k71Var;
        k71Var.r = false;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
