package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yp0 implements TextWatcher {
    public final /* synthetic */ lq0 a;

    public yp0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        lq0 lq0Var = this.a;
        dq0 dq0Var = lq0Var.H;
        zw0 zw0Var = lq0Var.N;
        d20 d20Var = lq0Var.v0;
        if (!TextUtils.isEmpty(d20Var.r.getText())) {
            lq0Var.K0(false);
        }
        if (lq0Var.x0) {
            String obj = d20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (zw0Var != null) {
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (lq0Var.C.getAdapter() != dq0Var) {
                int F0 = lq0.F0(lq0Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e(false, true);
                lq0Var.K0(false);
                dq0Var.l();
                if (F0 > 0) {
                    lq0Var.E.h1(0, -F0);
                }
            }
            hq0 hq0Var = lq0Var.J;
            if (hq0Var != null) {
                hq0Var.E(obj);
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
