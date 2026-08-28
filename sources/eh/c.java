package eh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.m90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends m90 {
    public final /* synthetic */ e W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.W = eVar;
    }

    @Override // org.telegram.ui.Components.s51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.i;
        if (cVar != null && !cVar.Q.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
