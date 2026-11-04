package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class by0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ dy0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.F = dy0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        dy0 dy0Var = this.F;
        gi.d dVar = dy0Var.s;
        if (dVar != null) {
            dVar.setEnabled(dy0Var.d.optional || !TextUtils.isEmpty(dy0Var.n.getText()));
        }
    }
}
