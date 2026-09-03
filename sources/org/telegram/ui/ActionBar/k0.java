package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public k0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        w0 w0Var = this.a;
        h5 h5Var = w0Var.E;
        if (h5Var != null) {
            h5Var.q(w0Var.e);
        }
        w0Var.j();
        if (w0Var.d0.isEmpty() || TextUtils.isEmpty(w0Var.e.getText()) || w0Var.e0 < 0) {
            return;
        }
        w0Var.e0 = -1;
        w0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
