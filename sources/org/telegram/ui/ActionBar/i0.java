package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i0 implements TextWatcher {
    public final /* synthetic */ u0 a;

    public i0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.a;
        k5 k5Var = u0Var.H;
        if (k5Var != null) {
            k5Var.q(u0Var.e);
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
