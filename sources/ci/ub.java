package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
