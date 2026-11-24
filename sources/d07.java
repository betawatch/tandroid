// default package

import android.view.ActionProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
