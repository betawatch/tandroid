package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class rb implements w2 {
    public final /* synthetic */ lc a;

    public rb(lc lcVar) {
        this.a = lcVar;
    }

    @Override // ci.w2
    public final void setInvert(float f7) {
        lc lcVar = this.a;
        AndroidUtilities.setLightNavigationBar(lcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(lcVar.n, f7 > 0.5f);
    }

    @Override // ci.w2
    public final void invalidate() {
    }
}
