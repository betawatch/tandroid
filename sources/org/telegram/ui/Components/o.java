package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
