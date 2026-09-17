package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class c41 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ d41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(d41 d41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = d41Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        d41 d41Var = this.x;
        di.d dVar = d41Var.s;
        if (dVar != null) {
            dVar.setEnabled(d41Var.d.optional || !TextUtils.isEmpty(d41Var.n.getText()));
        }
    }
}
