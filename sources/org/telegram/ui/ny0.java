package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ny0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ py0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(py0 py0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, "", true, false, 1024, i6Var);
        this.F = py0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        py0 py0Var = this.F;
        hi.d dVar = py0Var.s;
        if (dVar != null) {
            dVar.setEnabled(py0Var.d.optional || !TextUtils.isEmpty(py0Var.n.getText()));
        }
    }
}
