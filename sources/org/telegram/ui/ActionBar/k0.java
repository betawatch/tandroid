package org.telegram.ui.ActionBar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k0 implements TextWatcher {
    public final /* synthetic */ v0 a;

    public k0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        v0 v0Var = this.a;
        e5 e5Var = v0Var.D;
        if (e5Var != null) {
            e5Var.q(v0Var.e);
        }
        v0Var.j();
        if (v0Var.c0.isEmpty() || TextUtils.isEmpty(v0Var.e.getText()) || v0Var.d0 < 0) {
            return;
        }
        v0Var.d0 = -1;
        v0Var.y();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
