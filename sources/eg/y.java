package eg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y extends f3 {
    public static y e;
    public final u b;
    public final g2 c;
    public boolean d;

    public y(Activity activity, c1 c1Var, g2 g2Var, c6 c6Var, boolean z10) {
        super(activity, c6Var, true, false);
        this.c = g2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(g6.v0(g6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        u uVar = new u(this, getContext(), g2Var, c6Var, c1Var);
        this.b = uVar;
        uVar.setOverScrollMode(2);
        uVar.setClipToPadding(false);
        uVar.setAdapter(new v(c1Var, g2Var));
        uVar.setPosition(0);
        setCustomView(uVar);
        c1Var.p0 = new t(this, 0);
        c1Var.n0 = new ze.b(this, g2Var, false);
        g2Var.q0 = new w(this, c1Var, c6Var);
        g2Var.o0 = new t(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        mc.a(this.container, new x(0));
    }

    public static void m(org.telegram.ui.ActionBar.o2 o2Var, c6 c6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = c6Var instanceof lh.b;
        org.telegram.ui.ActionBar.o2 z1Var = z10 ? new cg.z1(o2Var) : o2Var;
        y yVar = new y(o2Var.getParentActivity(), new c1(z1Var, j10, prepaidGiveaway), new g2(z1Var, j10), z1Var.getResourceProvider(), z10);
        yVar.show();
        e = yVar;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        u uVar = this.b;
        if (uVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        g2 g2Var = this.c;
        if (g2Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(g2Var.getContainerView());
        }
        uVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
