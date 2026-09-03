package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o31 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ p31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(p31 p31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.x = p31Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        p31 p31Var = this.x;
        qh.d dVar = p31Var.s;
        if (dVar != null) {
            dVar.setEnabled(p31Var.d.optional || !TextUtils.isEmpty(p31Var.n.getText()));
        }
    }
}
