package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
