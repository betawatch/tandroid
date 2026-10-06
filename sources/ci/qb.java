package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
