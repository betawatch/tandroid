package l;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public ja.c b;

    public o(s sVar, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    public final View a(n nVar) {
        return this.a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        ja.c cVar = this.b;
        if (cVar != null) {
            l lVar = ((n) cVar.a).n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
