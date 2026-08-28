package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class cb implements r2 {
    public final /* synthetic */ wb a;

    public cb(wb wbVar) {
        this.a = wbVar;
    }

    @Override // kh.r2
    public final void setInvert(float f10) {
        wb wbVar = this.a;
        AndroidUtilities.setLightNavigationBar(wbVar.n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(wbVar.n, f10 > 0.5f);
    }

    @Override // kh.r2
    public final void invalidate() {
    }
}
