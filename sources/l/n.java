package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public k2.c0 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k2.c0 c0Var = this.b;
        if (c0Var != null) {
            k kVar = ((m) c0Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
