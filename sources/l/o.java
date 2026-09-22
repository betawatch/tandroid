package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public android.support.v4.media.c b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        android.support.v4.media.c cVar = this.b;
        if (cVar != null) {
            l lVar = ((n) cVar.b).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
