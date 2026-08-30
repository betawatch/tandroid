package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h31 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ j31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h31(j31 j31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = j31Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        j31 j31Var = this.x;
        ph.d dVar = j31Var.s;
        if (dVar != null) {
            dVar.setEnabled(j31Var.d.optional || !TextUtils.isEmpty(j31Var.n.getText()));
        }
    }
}
