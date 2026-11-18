package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o implements TextWatcher {
    public final /* synthetic */ m0 a;

    public o(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        l0 l0Var;
        m0 m0Var = this.a;
        l0 l0Var2 = m0Var.u2;
        if ((l0Var2 != null ? l0Var2.getSelectedTab() : 0) == 1 && (l0Var = m0Var.v2) != null && (l0Var.getSelectedTone() instanceof i0)) {
            m0Var.j1();
            m0Var.C1();
            m0Var.B1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
