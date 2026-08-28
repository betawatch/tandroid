package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public k0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        w0 w0Var = this.a;
        e5 e5Var = w0Var.D;
        if (e5Var != null) {
            e5Var.q(w0Var.e);
        }
        w0Var.j();
        if (w0Var.c0.isEmpty() || TextUtils.isEmpty(w0Var.e.getText()) || w0Var.d0 < 0) {
            return;
        }
        w0Var.d0 = -1;
        w0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
