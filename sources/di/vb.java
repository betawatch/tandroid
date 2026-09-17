package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class vb implements x2 {
    public final /* synthetic */ pc a;

    public vb(pc pcVar) {
        this.a = pcVar;
    }

    @Override // di.x2
    public final void setInvert(float f7) {
        pc pcVar = this.a;
        AndroidUtilities.setLightNavigationBar(pcVar.n, f7 > 0.5f);
        AndroidUtilities.setLightStatusBar(pcVar.n, f7 > 0.5f);
    }

    @Override // di.x2
    public final void invalidate() {
    }
}
