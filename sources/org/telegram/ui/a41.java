package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ b41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(b41 b41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = b41Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        b41 b41Var = this.x;
        ci.d dVar = b41Var.s;
        if (dVar != null) {
            dVar.setEnabled(b41Var.d.optional || !TextUtils.isEmpty(b41Var.n.getText()));
        }
    }
}
