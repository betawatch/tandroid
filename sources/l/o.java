package l;

import android.view.ActionProvider;
import android.view.View;
import zh.d3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public d3 b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        d3 d3Var = this.b;
        if (d3Var != null) {
            l lVar = ((n) d3Var.a).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
