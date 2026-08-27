package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ep0 implements TextWatcher {
    public final /* synthetic */ sp0 a;

    public ep0(sp0 sp0Var) {
        this.a = sp0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        sp0 sp0Var = this.a;
        jp0 jp0Var = sp0Var.G;
        iw0 iw0Var = sp0Var.M;
        p10 p10Var = sp0Var.u0;
        if (!TextUtils.isEmpty(p10Var.r.getText())) {
            sp0Var.K0(false);
        }
        if (sp0Var.w0) {
            String obj = p10Var.r.getText().toString();
            if (obj.length() != 0) {
                if (iw0Var != null) {
                    iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                }
            } else if (sp0Var.B.getAdapter() != jp0Var) {
                int F0 = sp0.F0(sp0Var);
                iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                iw0Var.e(false, true);
                sp0Var.K0(false);
                jp0Var.l();
                if (F0 > 0) {
                    sp0Var.D.h1(0, -F0);
                }
            }
            op0 op0Var = sp0Var.I;
            if (op0Var != null) {
                op0Var.E(obj);
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
