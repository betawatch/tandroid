package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
