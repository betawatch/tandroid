package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
