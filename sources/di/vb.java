package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
