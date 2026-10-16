package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
