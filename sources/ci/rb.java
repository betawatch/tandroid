package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class rb implements v2 {
    public final /* synthetic */ lc a;

    public rb(lc lcVar) {
        this.a = lcVar;
    }

    @Override // ci.v2
    public final void setInvert(float f7) {
        lc lcVar = this.a;
        AndroidUtilities.setLightNavigationBar(lcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(lcVar.n, f7 > 0.5f);
    }

    @Override // ci.v2
    public final void invalidate() {
    }
}
