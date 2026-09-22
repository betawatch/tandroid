package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class ub implements x2 {
    public final /* synthetic */ oc a;

    public ub(oc ocVar) {
        this.a = ocVar;
    }

    @Override // ci.x2
    public final void setInvert(float f7) {
        oc ocVar = this.a;
        AndroidUtilities.setLightNavigationBar(ocVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(ocVar.n, f7 > 0.5f);
    }

    @Override // ci.x2
    public final void invalidate() {
    }
}
