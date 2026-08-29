package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pp0 implements TextWatcher {
    public final /* synthetic */ dq0 a;

    public pp0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        dq0 dq0Var = this.a;
        up0 up0Var = dq0Var.G;
        qw0 qw0Var = dq0Var.M;
        x10 x10Var = dq0Var.u0;
        if (!TextUtils.isEmpty(x10Var.r.getText())) {
            dq0Var.K0(false);
        }
        if (dq0Var.w0) {
            String obj = x10Var.r.getText().toString();
            if (obj.length() != 0) {
                if (qw0Var != null) {
                    qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (dq0Var.B.getAdapter() != up0Var) {
                int F0 = dq0.F0(dq0Var);
                qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                qw0Var.e(false, true);
                dq0Var.K0(false);
                up0Var.l();
                if (F0 > 0) {
                    dq0Var.D.h1(0, -F0);
                }
            }
            zp0 zp0Var = dq0Var.I;
            if (zp0Var != null) {
                zp0Var.E(obj);
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
