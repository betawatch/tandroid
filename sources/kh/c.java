package kh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ha0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends ha0 {
    public final /* synthetic */ e X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, p2 p2Var, long j10) {
        super(p2Var, j10);
        this.X = eVar;
    }

    @Override // org.telegram.ui.Components.s61, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        e eVar = this.X;
        c cVar = eVar.i;
        if (cVar != null && !cVar.R.b) {
            eVar.i = null;
        }
        super.dismiss();
    }
}
