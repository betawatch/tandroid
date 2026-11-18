package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public g1 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g1 g1Var = this.b;
        if (g1Var != null) {
            k kVar = ((m) g1Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
