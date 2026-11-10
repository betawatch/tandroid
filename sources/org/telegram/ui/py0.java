package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class py0 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ ry0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(ry0 ry0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, "", true, false, 1024, h6Var);
        this.E = ry0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        ry0 ry0Var = this.E;
        fi.d dVar = ry0Var.s;
        if (dVar != null) {
            dVar.setEnabled(ry0Var.d.optional || !TextUtils.isEmpty(ry0Var.n.getText()));
        }
    }
}
