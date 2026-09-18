package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
