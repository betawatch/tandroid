// default package

import android.view.ActionProvider;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d07 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public z24 b;

    public d07(g07 g07Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        z24 z24Var = this.b;
        if (z24Var != null) {
            yz6 yz6Var = ((c07) z24Var.b).n;
            yz6Var.h = true;
            yz6Var.p(true);
        }
    }
}
