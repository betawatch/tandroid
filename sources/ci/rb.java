package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
