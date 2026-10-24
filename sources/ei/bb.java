package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
