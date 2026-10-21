package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
