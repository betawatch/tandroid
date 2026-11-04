package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l implements TextWatcher {
    public final /* synthetic */ e0 a;

    public l(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d0 d0Var;
        e0 e0Var = this.a;
        d0 d0Var2 = e0Var.p2;
        if ((d0Var2 != null ? d0Var2.getSelectedTab() : 0) == 1 && (d0Var = e0Var.q2) != null && (d0Var.getSelectedTone() instanceof a0)) {
            e0Var.h1();
            e0Var.v1();
            e0Var.u1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
