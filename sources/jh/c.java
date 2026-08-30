package jh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.fa0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends fa0 {
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
