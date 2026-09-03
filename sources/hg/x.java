package hg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x extends h3 {
    public static x e;
    public final t b;
    public final f2 c;
    public boolean d;

    public x(Activity activity, b1 b1Var, f2 f2Var, g6 g6Var, boolean z4) {
        super(activity, g6Var, true, false);
        this.c = f2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(k6.v0(k6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        t tVar = new t(this, getContext(), f2Var, g6Var, b1Var);
        this.b = tVar;
        tVar.setOverScrollMode(2);
        tVar.setClipToPadding(false);
        tVar.setAdapter(new u(b1Var, f2Var));
        tVar.setPosition(0);
        setCustomView(tVar);
        b1Var.q0 = new s(this, 0);
        b1Var.o0 = new f7.b(this, f2Var, false, 9);
        f2Var.r0 = new v(this, b1Var, g6Var);
        f2Var.p0 = new s(this, 1);
        if (!z4) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        ic.a(this.container, new w(0));
    }

    public static void m(org.telegram.ui.ActionBar.p2 p2Var, g6 g6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z4 = g6Var instanceof oh.b;
        org.telegram.ui.ActionBar.p2 x1Var = z4 ? new fg.x1(p2Var) : p2Var;
        x xVar = new x(p2Var.getParentActivity(), new b1(x1Var, j10, prepaidGiveaway), new f2(x1Var, j10), x1Var.getResourceProvider(), z4);
        xVar.show();
        e = xVar;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        t tVar = this.b;
        if (tVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        f2 f2Var = this.c;
        if (f2Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(f2Var.getContainerView());
        }
        tVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
