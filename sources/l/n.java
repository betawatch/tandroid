package l;

import android.view.ActionProvider;
import android.view.View;
import jg.s0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public s0 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        s0 s0Var = this.b;
        if (s0Var != null) {
            k kVar = ((m) s0Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
