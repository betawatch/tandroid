package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public a6.m b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a6.m mVar = this.b;
        if (mVar != null) {
            k kVar = ((m) mVar.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
