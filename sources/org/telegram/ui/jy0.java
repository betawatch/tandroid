package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
