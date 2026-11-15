package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jy0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ ly0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ly0 ly0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.F = ly0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        ly0 ly0Var = this.F;
        hi.d dVar = ly0Var.s;
        if (dVar != null) {
            dVar.setEnabled(ly0Var.d.optional || !TextUtils.isEmpty(ly0Var.n.getText()));
        }
    }
}
