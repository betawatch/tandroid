package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l implements TextWatcher {
    public final /* synthetic */ g0 a;

    public l(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f0 f0Var;
        g0 g0Var = this.a;
        f0 f0Var2 = g0Var.s0;
        if ((f0Var2 != null ? f0Var2.getSelectedTab() : 0) == 1 && (f0Var = g0Var.t0) != null && (f0Var.getSelectedTone() instanceof c0)) {
            g0Var.c0();
            g0Var.q0();
            g0Var.p0(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
