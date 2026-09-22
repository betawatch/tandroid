package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ b41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(b41 b41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.x = b41Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        b41 b41Var = this.x;
        ci.d dVar = b41Var.s;
        if (dVar != null) {
            dVar.setEnabled(b41Var.d.optional || !TextUtils.isEmpty(b41Var.n.getText()));
        }
    }
}
