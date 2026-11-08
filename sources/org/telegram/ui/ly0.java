package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ly0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ ny0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(ny0 ny0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.E = ny0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        ny0 ny0Var = this.E;
        fi.d dVar = ny0Var.s;
        if (dVar != null) {
            dVar.setEnabled(ny0Var.d.optional || !TextUtils.isEmpty(ny0Var.n.getText()));
        }
    }
}
