package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class bb implements r2 {
    public final /* synthetic */ vb a;

    public bb(vb vbVar) {
        this.a = vbVar;
    }

    @Override // ei.r2
    public final void setInvert(float f7) {
        vb vbVar = this.a;
        AndroidUtilities.setLightNavigationBar(vbVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(vbVar.n, f7 > 0.5f);
    }

    @Override // ei.r2
    public final void invalidate() {
    }
}
