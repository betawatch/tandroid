package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ed implements l3 {
    public final /* synthetic */ ce a;

    public ed(ce ceVar) {
        this.a = ceVar;
    }

    @Override // bi.l3
    public final void setInvert(float f7) {
        ce ceVar = this.a;
        AndroidUtilities.setLightNavigationBar(ceVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(ceVar.n, f7 > 0.5f);
    }

    @Override // bi.l3
    public final void invalidate() {
    }
}
