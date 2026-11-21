package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
