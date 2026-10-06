package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
