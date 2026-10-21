package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class sq0 implements TextWatcher {
    public final /* synthetic */ fr0 a;

    public sq0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fr0 fr0Var = this.a;
        xq0 xq0Var = fr0Var.L;
        tx0 tx0Var = fr0Var.R;
        k20 k20Var = fr0Var.z0;
        if (!TextUtils.isEmpty(k20Var.r.getText())) {
            fr0Var.M0(false);
        }
        if (fr0Var.B0) {
            String obj = k20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (tx0Var != null) {
                    tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (fr0Var.G.getAdapter() != xq0Var) {
                int J0 = fr0.J0(fr0Var);
                tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                tx0Var.e(false, true);
                fr0Var.M0(false);
                xq0Var.l();
                if (J0 > 0) {
                    fr0Var.I.h1(0, -J0);
                }
            }
            br0 br0Var = fr0Var.N;
            if (br0Var != null) {
                br0Var.E(obj);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
