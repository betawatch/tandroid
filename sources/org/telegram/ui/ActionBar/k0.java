package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public k0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        w0 w0Var = this.a;
        h5 h5Var = w0Var.H;
        if (h5Var != null) {
            h5Var.q(w0Var.e);
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
