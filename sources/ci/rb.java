package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
