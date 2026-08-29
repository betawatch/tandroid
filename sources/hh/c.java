package hh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.aa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends aa0 {
    public final /* synthetic */ e W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.W = eVar;
    }

    @Override // org.telegram.ui.Components.f61, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.i;
        if (cVar != null && !cVar.Q.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
