package l;

import android.view.ActionProvider;
import android.view.View;
import ji.h5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public h5 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        h5 h5Var = this.b;
        if (h5Var != null) {
            k kVar = ((m) h5Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
