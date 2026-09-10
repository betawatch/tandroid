package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public k0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        w0 w0Var = this.a;
        i5 i5Var = w0Var.H;
        if (i5Var != null) {
            i5Var.q(w0Var.e);
        }
        w0Var.j();
        if (w0Var.g0.isEmpty() || TextUtils.isEmpty(w0Var.e.getText()) || w0Var.h0 < 0) {
            return;
        }
        w0Var.h0 = -1;
        w0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
