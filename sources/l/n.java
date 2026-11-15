package l;

import android.view.ActionProvider;
import android.view.View;
import hi.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public l0 b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        l0 l0Var = this.b;
        if (l0Var != null) {
            k kVar = ((m) l0Var.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
