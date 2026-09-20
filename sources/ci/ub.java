package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class ub implements x2 {
    public final /* synthetic */ oc a;

    public ub(oc ocVar) {
        this.a = ocVar;
    }

    @Override // ci.x2
    public final void setInvert(float f7) {
        oc ocVar = this.a;
        AndroidUtilities.setLightNavigationBar(ocVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(ocVar.n, f7 > 0.5f);
    }

    @Override // ci.x2
    public final void invalidate() {
    }
}
