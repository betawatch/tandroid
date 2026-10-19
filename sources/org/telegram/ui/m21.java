package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
