// default package

import android.view.ActionProvider;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d27 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public ai4 b;

    public d27(g27 g27Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ai4 ai4Var = this.b;
        if (ai4Var != null) {
            y17 y17Var = ((c27) ai4Var.b).n;
            y17Var.h = true;
            y17Var.p(true);
        }
    }
}
