package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class qb implements v2 {
    public final /* synthetic */ kc a;

    public qb(kc kcVar) {
        this.a = kcVar;
    }

    @Override // di.v2
    public final void setInvert(float f7) {
        kc kcVar = this.a;
        AndroidUtilities.setLightNavigationBar(kcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(kcVar.n, f7 > 0.5f);
    }

    @Override // di.v2
    public final void invalidate() {
    }
}
