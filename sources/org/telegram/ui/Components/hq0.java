package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        jx0 jx0Var = uq0Var.Q;
        b20 b20Var = uq0Var.y0;
        if (!TextUtils.isEmpty(b20Var.r.getText())) {
            uq0Var.K0(false);
        }
        if (uq0Var.A0) {
            String obj = b20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (jx0Var != null) {
                    jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (uq0Var.F.getAdapter() != mq0Var) {
                int F0 = uq0.F0(uq0Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e(false, true);
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
