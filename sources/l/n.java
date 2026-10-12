package l;

import android.view.ActionProvider;
import android.view.View;
import ji.h5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
