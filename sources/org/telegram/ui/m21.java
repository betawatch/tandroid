package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class m21 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ n21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(n21 n21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.x = n21Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        n21 n21Var = this.x;
        ei.d dVar = n21Var.s;
        if (dVar != null) {
            dVar.setEnabled(n21Var.d.optional || !TextUtils.isEmpty(n21Var.n.getText()));
        }
    }
}
