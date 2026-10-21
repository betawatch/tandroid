package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class i0 implements TextWatcher {
    public final /* synthetic */ u0 a;

    public i0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.a;
        g5 g5Var = u0Var.H;
        if (g5Var != null) {
            g5Var.q(u0Var.e);
        }
        u0Var.j();
        if (u0Var.g0.isEmpty() || TextUtils.isEmpty(u0Var.e.getText()) || u0Var.h0 < 0) {
            return;
        }
        u0Var.h0 = -1;
        u0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
