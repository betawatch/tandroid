package ai;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ed extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public b71 Y;
    public boolean Z;

    public ed(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, g6Var);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new xa(this, 3));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        y90 y90Var = new y90(context, g6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.B6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new a3.d(this, 25)));
        y90Var.setGravity(17);
        y90Var.setMaxWidth(ei.x3.a(y90Var.getText(), y90Var.getPaint()));
        frameLayout.addView(y90Var, w7.z5.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, g6Var);
        this.containerView.addView(new z00(getContext()), w7.z5.c(-1.0f, -1));
        b71 b71Var = this.Y;
        if (b71Var != null) {
            b71Var.N(false);
        }
    }

    public static void P(ed edVar, int i10) {
        m61 G;
        b71 b71Var = edVar.Y;
        if (b71Var == null || (G = b71Var.G(i10 - 1)) == null) {
            return;
        }
        b71 b71Var2 = edVar.Y;
        if (G.d == -1) {
            edVar.Z = !edVar.Z;
            b71Var2.N(true);
            edVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(yc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(edVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.J1;
            }
            if (findActivity == null) {
                return;
            }
            ha.y(edVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new r5(3, edVar, G), null);
        }
    }

    public static void Q(ed edVar, m61 m61Var, Boolean bool, String str) {
        if (edVar.getContext() == null) {
            return;
        }
        edVar.dismiss();
        ha.y(edVar.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, b71 b71Var) {
        i2.o1.q(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = ha.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(yc.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = rc.a;
                m61 J = m61.J(rc.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(m61.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (b71Var = this.Y) != null) {
            b71Var.N(true);
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
        gk gkVar;
        long j10 = ha.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (gkVar = snVar.Y) != null) {
                gkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 9), this.resourcesProvider);
        this.Y = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
