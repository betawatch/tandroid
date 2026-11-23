package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public j6.r b;

    public n(r rVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(m mVar) {
        return this.a.onCreateActionView(mVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        j6.r rVar = this.b;
        if (rVar != null) {
            k kVar = ((m) rVar.b).n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
