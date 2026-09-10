package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f41 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ g41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(g41 g41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = g41Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        g41 g41Var = this.x;
        bi.d dVar = g41Var.s;
        if (dVar != null) {
            dVar.setEnabled(g41Var.d.optional || !TextUtils.isEmpty(g41Var.n.getText()));
        }
    }
}
