package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
