package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        f0 f0Var2 = g0Var.w0;
        if ((f0Var2 != null ? f0Var2.getSelectedTab() : 0) == 1 && (f0Var = g0Var.x0) != null && (f0Var.getSelectedTone() instanceof a0)) {
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
