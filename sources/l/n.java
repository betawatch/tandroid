package l;

import android.view.ActionProvider;
import android.view.View;
import jg.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
