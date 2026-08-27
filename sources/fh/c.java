package fh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.q90;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c extends q90 {
    public final /* synthetic */ e W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, n2 n2Var, long j10) {
        super(n2Var, j10);
        this.W = eVar;
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.i;
        if (cVar != null && !cVar.Q.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
