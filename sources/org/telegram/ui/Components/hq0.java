package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hq0 implements TextWatcher {
    public final /* synthetic */ uq0 a;

    public hq0(uq0 uq0Var) {
        this.a = uq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        uq0 uq0Var = this.a;
        mq0 mq0Var = uq0Var.K;
        ix0 ix0Var = uq0Var.Q;
        c20 c20Var = uq0Var.y0;
        if (!TextUtils.isEmpty(c20Var.r.getText())) {
            uq0Var.K0(false);
        }
        if (uq0Var.A0) {
            String obj = c20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (ix0Var != null) {
                    ix0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (uq0Var.F.getAdapter() != mq0Var) {
                int F0 = uq0.F0(uq0Var);
                ix0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ix0Var.e(false, true);
                uq0Var.K0(false);
                mq0Var.l();
                if (F0 > 0) {
                    uq0Var.H.h1(0, -F0);
                }
            }
            qq0 qq0Var = uq0Var.M;
            if (qq0Var != null) {
                qq0Var.E(obj);
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
