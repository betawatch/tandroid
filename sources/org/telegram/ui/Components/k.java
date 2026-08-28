package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        d0 d0Var2 = e0Var.s0;
        if ((d0Var2 != null ? d0Var2.getSelectedTab() : 0) == 1 && (d0Var = e0Var.t0) != null && (d0Var.getSelectedTone() instanceof a0)) {
            e0Var.b0();
            e0Var.p0();
            e0Var.o0(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
