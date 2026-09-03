package jh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ga0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends ga0 {
    public final /* synthetic */ e X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, p2 p2Var, long j10) {
        super(p2Var, j10);
        this.X = eVar;
    }

    @Override // org.telegram.ui.Components.q61, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        e eVar = this.X;
        c cVar = eVar.i;
        if (cVar != null && !cVar.R.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
