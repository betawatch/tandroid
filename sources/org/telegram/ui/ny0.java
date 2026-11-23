package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
