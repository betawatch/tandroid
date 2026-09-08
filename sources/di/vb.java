package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class vb implements x2 {
    public final /* synthetic */ pc a;

    public vb(pc pcVar) {
        this.a = pcVar;
    }

    @Override // di.x2
    public final void setInvert(float f7) {
        pc pcVar = this.a;
        AndroidUtilities.setLightNavigationBar(pcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(pcVar.n, f7 > 0.5f);
    }

    @Override // di.x2
    public final void invalidate() {
    }
}
