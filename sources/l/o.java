package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public a4.m b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.b;
        if (mVar != null) {
            l lVar = ((n) mVar.b).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
