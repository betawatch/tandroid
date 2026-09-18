package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
