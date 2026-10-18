package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
