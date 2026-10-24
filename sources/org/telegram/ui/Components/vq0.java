package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class vq0 implements TextWatcher {
    public final /* synthetic */ ir0 a;

    public vq0(ir0 ir0Var) {
        this.a = ir0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ir0 ir0Var = this.a;
        ar0 ar0Var = ir0Var.L;
        wx0 wx0Var = ir0Var.R;
        k20 k20Var = ir0Var.z0;
        if (!TextUtils.isEmpty(k20Var.r.getText())) {
            ir0Var.P0(false);
        }
        if (ir0Var.B0) {
            String obj = k20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (wx0Var != null) {
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (ir0Var.G.getAdapter() != ar0Var) {
                int O0 = ir0.O0(ir0Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e(false, true);
                ir0Var.P0(false);
                ar0Var.l();
                if (O0 > 0) {
                    ir0Var.I.h1(0, -O0);
                }
            }
            er0 er0Var = ir0Var.N;
            if (er0Var != null) {
                er0Var.E(obj);
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
