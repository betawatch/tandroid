package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p implements TextWatcher {
    public final /* synthetic */ n0 a;

    public p(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m0 m0Var;
        n0 n0Var = this.a;
        m0 m0Var2 = n0Var.u2;
        if ((m0Var2 != null ? m0Var2.getSelectedTab() : 0) == 1 && (m0Var = n0Var.v2) != null && (m0Var.getSelectedTone() instanceof j0)) {
            n0Var.j1();
            n0Var.C1();
            n0Var.B1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
