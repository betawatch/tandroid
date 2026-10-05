package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class qb implements w2 {
    public final /* synthetic */ kc a;

    public qb(kc kcVar) {
        this.a = kcVar;
    }

    @Override // ci.w2
    public final void setInvert(float f7) {
        kc kcVar = this.a;
        AndroidUtilities.setLightNavigationBar(kcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(kcVar.n, f7 > 0.5f);
    }

    @Override // ci.w2
    public final void invalidate() {
    }
}
