package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g41 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ h41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(h41 h41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.x = h41Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        h41 h41Var = this.x;
        di.d dVar = h41Var.s;
        if (dVar != null) {
            dVar.setEnabled(h41Var.d.optional || !TextUtils.isEmpty(h41Var.n.getText()));
        }
    }
}
