package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o21 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ p21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o21(p21 p21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.x = p21Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        p21 p21Var = this.x;
        ei.d dVar = p21Var.s;
        if (dVar != null) {
            dVar.setEnabled(p21Var.d.optional || !TextUtils.isEmpty(p21Var.n.getText()));
        }
    }
}
