package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class up0 implements TextWatcher {
    public final /* synthetic */ hq0 a;

    public up0(hq0 hq0Var) {
        this.a = hq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hq0 hq0Var = this.a;
        zp0 zp0Var = hq0Var.K;
        xw0 xw0Var = hq0Var.Q;
        b20 b20Var = hq0Var.y0;
        if (!TextUtils.isEmpty(b20Var.r.getText())) {
            hq0Var.K0(false);
        }
        if (hq0Var.A0) {
            String obj = b20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (xw0Var != null) {
                    xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (hq0Var.F.getAdapter() != zp0Var) {
                int F0 = hq0.F0(hq0Var);
                xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                xw0Var.e(false, true);
                hq0Var.K0(false);
                zp0Var.l();
                if (F0 > 0) {
                    hq0Var.H.h1(0, -F0);
                }
            }
            dq0 dq0Var = hq0Var.M;
            if (dq0Var != null) {
                dq0Var.E(obj);
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
