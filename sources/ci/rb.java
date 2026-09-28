package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
