package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class j0 implements TextWatcher {
    public final /* synthetic */ v0 a;

    public j0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        v0 v0Var = this.a;
        g5 g5Var = v0Var.H;
        if (g5Var != null) {
            g5Var.q(v0Var.e);
        }
        v0Var.j();
        if (v0Var.g0.isEmpty() || TextUtils.isEmpty(v0Var.e.getText()) || v0Var.h0 < 0) {
            return;
        }
        v0Var.h0 = -1;
        v0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
