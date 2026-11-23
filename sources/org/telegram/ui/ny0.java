package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ny0 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ py0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(py0 py0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, "", true, false, 1024, h6Var);
        this.F = py0Var;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        py0 py0Var = this.F;
        hi.e eVar = py0Var.s;
        if (eVar != null) {
            eVar.setEnabled(py0Var.d.optional || !TextUtils.isEmpty(py0Var.n.getText()));
        }
    }
}
