package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k implements TextWatcher {
    public final /* synthetic */ f0 a;

    public k(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        e0 e0Var;
        f0 f0Var = this.a;
        e0 e0Var2 = f0Var.r2;
        if ((e0Var2 != null ? e0Var2.getSelectedTab() : 0) == 1 && (e0Var = f0Var.s2) != null && (e0Var.getSelectedTone() instanceof a0)) {
            f0Var.h1();
            f0Var.v1();
            f0Var.u1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
