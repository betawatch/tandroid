package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zq0 implements TextWatcher {
    public final /* synthetic */ mr0 a;

    public zq0(mr0 mr0Var) {
        this.a = mr0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        mr0 mr0Var = this.a;
        er0 er0Var = mr0Var.L;
        ey0 ey0Var = mr0Var.R;
        m20 m20Var = mr0Var.z0;
        if (!TextUtils.isEmpty(m20Var.r.getText())) {
            mr0Var.M0(false);
        }
        if (mr0Var.B0) {
            String obj = m20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (ey0Var != null) {
                    ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (mr0Var.G.getAdapter() != er0Var) {
                int C0 = mr0.C0(mr0Var);
                ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
                ey0Var.e(false, true);
                mr0Var.M0(false);
                er0Var.l();
                if (C0 > 0) {
                    mr0Var.I.h1(0, -C0);
                }
            }
            ir0 ir0Var = mr0Var.N;
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
