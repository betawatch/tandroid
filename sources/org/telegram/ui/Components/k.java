package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k implements TextWatcher {
    public final /* synthetic */ e0 a;

    public k(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d0 d0Var;
        e0 e0Var = this.a;
        d0 d0Var2 = e0Var.w0;
        if ((d0Var2 != null ? d0Var2.getSelectedTab() : 0) == 1 && (d0Var = e0Var.x0) != null && (d0Var.getSelectedTone() instanceof z)) {
            e0Var.c0();
            e0Var.q0();
            e0Var.p0(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
