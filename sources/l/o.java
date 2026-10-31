package l;

import android.view.ActionProvider;
import android.view.View;
import k2.m0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public m0 b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        m0 m0Var = this.b;
        if (m0Var != null) {
            l lVar = ((n) m0Var.a).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
