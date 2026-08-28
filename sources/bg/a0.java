package bg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a0 extends org.telegram.ui.ActionBar.f3 {
    public static a0 e;
    public final w b;
    public final q2 c;
    public boolean d;

    public a0(Activity activity, h1 h1Var, q2 q2Var, b6 b6Var, boolean z10) {
        super(activity, b6Var, true, false);
        this.c = q2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(f6.v0(f6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        w wVar = new w(this, getContext(), q2Var, b6Var, h1Var);
        this.b = wVar;
        wVar.setOverScrollMode(2);
        wVar.setClipToPadding(false);
        wVar.setAdapter(new x(h1Var, q2Var));
        wVar.setPosition(0);
        setCustomView(wVar);
        h1Var.p0 = new v(this, 0);
        h1Var.n0 = new we.b(9, this, q2Var);
        q2Var.q0 = new y(this, h1Var, b6Var);
        q2Var.o0 = new v(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        gc.a(this.container, new z(0));
    }

    public static void m(org.telegram.ui.ActionBar.o2 o2Var, b6 b6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = b6Var instanceof ih.b;
        org.telegram.ui.ActionBar.o2 i1Var = z10 ? new i1(o2Var) : o2Var;
        a0 a0Var = new a0(o2Var.getParentActivity(), new h1(i1Var, j10, prepaidGiveaway), new q2(i1Var, j10), i1Var.getResourceProvider(), z10);
        a0Var.show();
        e = a0Var;
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
        w wVar = this.b;
        if (wVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        q2 q2Var = this.c;
        if (q2Var.R()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(q2Var.getContainerView());
        }
        wVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
