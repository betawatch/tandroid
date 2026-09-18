package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vp0 implements TextWatcher {
    public final /* synthetic */ iq0 a;

    public vp0(iq0 iq0Var) {
        this.a = iq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        iq0 iq0Var = this.a;
        aq0 aq0Var = iq0Var.K;
        zw0 zw0Var = iq0Var.Q;
        b20 b20Var = iq0Var.y0;
        if (!TextUtils.isEmpty(b20Var.r.getText())) {
            iq0Var.K0(false);
        }
        if (iq0Var.A0) {
            String obj = b20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (zw0Var != null) {
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (iq0Var.F.getAdapter() != aq0Var) {
                int F0 = iq0.F0(iq0Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e(false, true);
                iq0Var.K0(false);
                aq0Var.l();
                if (F0 > 0) {
                    iq0Var.H.h1(0, -F0);
                }
            }
            eq0 eq0Var = iq0Var.M;
            if (eq0Var != null) {
                eq0Var.E(obj);
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
