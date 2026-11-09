package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oy0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ qy0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(qy0 qy0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.E = qy0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        qy0 qy0Var = this.E;
        fi.d dVar = qy0Var.s;
        if (dVar != null) {
            dVar.setEnabled(qy0Var.d.optional || !TextUtils.isEmpty(qy0Var.n.getText()));
        }
    }
}
