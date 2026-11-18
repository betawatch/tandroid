package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ny0 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ py0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(py0 py0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, "", true, false, 1024, i6Var);
        this.F = py0Var;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        py0 py0Var = this.F;
        hi.d dVar = py0Var.s;
        if (dVar != null) {
            dVar.setEnabled(py0Var.d.optional || !TextUtils.isEmpty(py0Var.n.getText()));
        }
    }
}
