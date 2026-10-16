package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vq0 implements TextWatcher {
    public final /* synthetic */ ir0 a;

    public vq0(ir0 ir0Var) {
        this.a = ir0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ir0 ir0Var = this.a;
        ar0 ar0Var = ir0Var.K;
        wx0 wx0Var = ir0Var.Q;
        o20 o20Var = ir0Var.y0;
        if (!TextUtils.isEmpty(o20Var.r.getText())) {
            ir0Var.L0(false);
        }
        if (ir0Var.A0) {
            String obj = o20Var.r.getText().toString();
            if (obj.length() != 0) {
                if (wx0Var != null) {
                    wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (ir0Var.F.getAdapter() != ar0Var) {
                int G0 = ir0.G0(ir0Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e(false, true);
                ir0Var.L0(false);
                ar0Var.l();
                if (G0 > 0) {
                    ir0Var.H.h1(0, -G0);
                }
            }
            er0 er0Var = ir0Var.M;
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
