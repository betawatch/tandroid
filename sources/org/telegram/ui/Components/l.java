package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l implements TextWatcher {
    public final /* synthetic */ f0 a;

    public l(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        e0 e0Var;
        f0 f0Var = this.a;
        e0 e0Var2 = f0Var.t0;
        if ((e0Var2 != null ? e0Var2.getSelectedTab() : 0) == 1 && (e0Var = f0Var.u0) != null && (e0Var.getSelectedTone() instanceof b0)) {
            f0Var.c0();
            f0Var.q0();
            f0Var.p0(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
