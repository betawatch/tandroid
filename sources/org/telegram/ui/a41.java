package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ b41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(b41 b41Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, "", true, false, 1024, f6Var);
        this.x = b41Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        b41 b41Var = this.x;
        ci.d dVar = b41Var.s;
        if (dVar != null) {
            dVar.setEnabled(b41Var.d.optional || !TextUtils.isEmpty(b41Var.n.getText()));
        }
    }
}
