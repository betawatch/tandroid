package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public g6.d0 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z9) {
        g6.d0 d0Var = this.b;
        if (d0Var != null) {
            k kVar = ((m) d0Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
