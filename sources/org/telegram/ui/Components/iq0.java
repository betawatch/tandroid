package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class iq0 implements TextWatcher {
    public final /* synthetic */ vq0 a;

    public iq0(vq0 vq0Var) {
        this.a = vq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vq0 vq0Var = this.a;
        nq0 nq0Var = vq0Var.K;
        kx0 kx0Var = vq0Var.Q;
        b20 b20Var = vq0Var.y0;
        if (!TextUtils.isEmpty(b20Var.r.getText())) {
            vq0Var.K0(false);
        }
        if (vq0Var.A0) {
            String obj = b20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (kx0Var != null) {
                    kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (vq0Var.F.getAdapter() != nq0Var) {
                int F0 = vq0.F0(vq0Var);
                kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                kx0Var.e(false, true);
                vq0Var.K0(false);
                nq0Var.l();
                if (F0 > 0) {
                    vq0Var.H.h1(0, -F0);
                }
            }
            rq0 rq0Var = vq0Var.M;
            if (rq0Var != null) {
                rq0Var.E(obj);
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
