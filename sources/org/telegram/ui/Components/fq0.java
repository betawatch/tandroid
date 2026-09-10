package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fq0 implements TextWatcher {
    public final /* synthetic */ sq0 a;

    public fq0(sq0 sq0Var) {
        this.a = sq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        sq0 sq0Var = this.a;
        kq0 kq0Var = sq0Var.K;
        jx0 jx0Var = sq0Var.Q;
        k20 k20Var = sq0Var.y0;
        if (!TextUtils.isEmpty(k20Var.r.getText())) {
            sq0Var.K0(false);
        }
        if (sq0Var.A0) {
            String obj = k20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (jx0Var != null) {
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (sq0Var.F.getAdapter() != kq0Var) {
                int F0 = sq0.F0(sq0Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e(false, true);
                sq0Var.K0(false);
                kq0Var.l();
                if (F0 > 0) {
                    sq0Var.H.h1(0, -F0);
                }
            }
            oq0 oq0Var = sq0Var.M;
            if (oq0Var != null) {
                oq0Var.E(obj);
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
