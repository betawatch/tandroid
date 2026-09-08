package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
