package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b41 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ c41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(c41 c41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = c41Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        c41 c41Var = this.x;
        ci.d dVar = c41Var.s;
        if (dVar != null) {
            dVar.setEnabled(c41Var.d.optional || !TextUtils.isEmpty(c41Var.n.getText()));
        }
    }
}
