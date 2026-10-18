package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
