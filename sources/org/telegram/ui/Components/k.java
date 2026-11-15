package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k implements TextWatcher {
    public final /* synthetic */ d0 a;

    public k(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        c0 c0Var;
        d0 d0Var = this.a;
        c0 c0Var2 = d0Var.s2;
        if ((c0Var2 != null ? c0Var2.getSelectedTab() : 0) == 1 && (c0Var = d0Var.t2) != null && (c0Var.getSelectedTone() instanceof z)) {
            d0Var.h1();
            d0Var.v1();
            d0Var.u1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
