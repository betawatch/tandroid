package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 implements TextWatcher {
    public final /* synthetic */ w0 a;

    public l0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
