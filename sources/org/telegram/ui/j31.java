package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ l31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(l31 l31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.x = l31Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        l31 l31Var = this.x;
        qh.d dVar = l31Var.s;
        if (dVar != null) {
            dVar.setEnabled(l31Var.d.optional || !TextUtils.isEmpty(l31Var.n.getText()));
        }
    }
}
