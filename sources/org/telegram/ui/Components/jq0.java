package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jq0 implements TextWatcher {
    public final /* synthetic */ wq0 a;

    public jq0(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        wq0 wq0Var = this.a;
        oq0 oq0Var = wq0Var.K;
        lx0 lx0Var = wq0Var.Q;
        b20 b20Var = wq0Var.y0;
        if (!TextUtils.isEmpty(b20Var.r.getText())) {
            wq0Var.K0(false);
        }
        if (wq0Var.A0) {
            String obj = b20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (lx0Var != null) {
                    lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (wq0Var.F.getAdapter() != oq0Var) {
                int F0 = wq0.F0(wq0Var);
                lx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                lx0Var.e(false, true);
                wq0Var.K0(false);
                oq0Var.l();
                if (F0 > 0) {
                    wq0Var.H.h1(0, -F0);
                }
            }
            sq0 sq0Var = wq0Var.M;
            if (sq0Var != null) {
                sq0Var.E(obj);
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
