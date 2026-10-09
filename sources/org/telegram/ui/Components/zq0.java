package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zq0 implements TextWatcher {
    public final /* synthetic */ mr0 a;

    public zq0(mr0 mr0Var) {
        this.a = mr0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        mr0 mr0Var = this.a;
        er0 er0Var = mr0Var.K;
        ay0 ay0Var = mr0Var.Q;
        s20 s20Var = mr0Var.y0;
        if (!TextUtils.isEmpty(s20Var.r.getText())) {
            mr0Var.L0(false);
        }
        if (mr0Var.A0) {
            String obj = s20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (ay0Var != null) {
                    ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (mr0Var.F.getAdapter() != er0Var) {
                int G0 = mr0.G0(mr0Var);
                ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ay0Var.e(false, true);
                mr0Var.L0(false);
                er0Var.l();
                if (G0 > 0) {
                    mr0Var.H.h1(0, -G0);
                }
            }
            ir0 ir0Var = mr0Var.M;
            if (ir0Var != null) {
                ir0Var.E(obj);
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
