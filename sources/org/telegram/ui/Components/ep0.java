package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ep0 implements TextWatcher {
    public final /* synthetic */ rp0 a;

    public ep0(rp0 rp0Var) {
        this.a = rp0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        rp0 rp0Var = this.a;
        jp0 jp0Var = rp0Var.G;
        gw0 gw0Var = rp0Var.M;
        m10 m10Var = rp0Var.u0;
        if (!TextUtils.isEmpty(m10Var.r.getText())) {
            rp0Var.K0(false);
        }
        if (rp0Var.w0) {
            String obj = m10Var.r.getText().toString();
            if (obj.length() != 0) {
                if (gw0Var != null) {
                    gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (rp0Var.B.getAdapter() != jp0Var) {
                int E0 = rp0.E0(rp0Var);
                gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                gw0Var.e(false, true);
                rp0Var.K0(false);
                jp0Var.l();
                if (E0 > 0) {
                    rp0Var.D.h1(0, -E0);
                }
            }
            np0 np0Var = rp0Var.I;
            if (np0Var != null) {
                np0Var.E(obj);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
