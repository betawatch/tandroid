package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i0 implements TextWatcher {
    public final /* synthetic */ u0 a;

    public i0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        u0 u0Var = this.a;
        e5 e5Var = u0Var.H;
        if (e5Var != null) {
            e5Var.q(u0Var.e);
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
