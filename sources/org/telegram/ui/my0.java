package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ oy0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(oy0 oy0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, "", true, false, 1024, i6Var);
        this.F = oy0Var;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        oy0 oy0Var = this.F;
        hi.e eVar = oy0Var.s;
        if (eVar != null) {
            eVar.setEnabled(oy0Var.d.optional || !TextUtils.isEmpty(oy0Var.n.getText()));
        }
    }
}
