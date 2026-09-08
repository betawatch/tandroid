package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public xa.c b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        xa.c cVar = this.b;
        if (cVar != null) {
            l lVar = ((n) cVar.b).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
