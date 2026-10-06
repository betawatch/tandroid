package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class oq0 implements TextWatcher {
    public final /* synthetic */ br0 a;

    public oq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        br0 br0Var = this.a;
        tq0 tq0Var = br0Var.K;
        ux0 ux0Var = br0Var.Q;
        f20 f20Var = br0Var.y0;
        if (!TextUtils.isEmpty(f20Var.r.getText())) {
            br0Var.H0(false);
        }
        if (br0Var.A0) {
            String obj = f20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (ux0Var != null) {
                    ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (br0Var.F.getAdapter() != tq0Var) {
                int s02 = br0.s0(br0Var);
                ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ux0Var.e(false, true);
                br0Var.H0(false);
                tq0Var.l();
                if (s02 > 0) {
                    br0Var.H.h1(0, -s02);
                }
            }
            xq0 xq0Var = br0Var.M;
            if (xq0Var != null) {
                xq0Var.E(obj);
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
