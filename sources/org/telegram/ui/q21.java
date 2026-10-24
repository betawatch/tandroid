package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q21 extends org.telegram.ui.Cells.h3 {
    public final /* synthetic */ r21 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q21(r21 r21Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, "", true, false, 1024, g6Var);
        this.E = r21Var;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        r21 r21Var = this.E;
        ei.d dVar = r21Var.s;
        if (dVar != null) {
            dVar.setEnabled(r21Var.d.optional || !TextUtils.isEmpty(r21Var.n.getText()));
        }
    }
}
