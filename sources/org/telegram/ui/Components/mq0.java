package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mq0 implements TextWatcher {
    public final /* synthetic */ zq0 a;

    public mq0(zq0 zq0Var) {
        this.a = zq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        zq0 zq0Var = this.a;
        rq0 rq0Var = zq0Var.K;
        tx0 tx0Var = zq0Var.Q;
        f20 f20Var = zq0Var.y0;
        if (!TextUtils.isEmpty(f20Var.r.getText())) {
            zq0Var.H0(false);
        }
        if (zq0Var.A0) {
            String obj = f20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (tx0Var != null) {
                    tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (zq0Var.F.getAdapter() != rq0Var) {
                int s02 = zq0.s0(zq0Var);
                tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                tx0Var.e(false, true);
                zq0Var.H0(false);
                rq0Var.l();
                if (s02 > 0) {
                    zq0Var.H.h1(0, -s02);
                }
            }
            vq0 vq0Var = zq0Var.M;
            if (vq0Var != null) {
                vq0Var.E(obj);
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
