package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o31 extends org.telegram.ui.Cells.h3 {
    public final /* synthetic */ p31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(p31 p31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = p31Var;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        p31 p31Var = this.x;
        ph.d dVar = p31Var.s;
        if (dVar != null) {
            dVar.setEnabled(p31Var.d.optional || !TextUtils.isEmpty(p31Var.n.getText()));
        }
    }
}
