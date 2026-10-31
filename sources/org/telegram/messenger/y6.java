package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y6 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w6 c;
    public final /* synthetic */ TextView[] d;
    public final /* synthetic */ TLRPC.TL_factCheck e;

    public y6(int i10, w6 w6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i10;
        this.c = w6Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        int length = editable.length();
        boolean z10 = true;
        int i10 = this.b;
        if (length > i10) {
            this.a = true;
            editable.delete(i10, editable.length());
            w6 w6Var = this.c;
            i0.E3(w6Var);
            try {
                w6Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
        TextView[] textViewArr = this.d;
        if (textViewArr[0] != null) {
            if (editable.length() <= 0 && this.e != null) {
                z10 = false;
            }
            textViewArr[0].setText(cd.L0(z10 ? 2131751355 : 2131746336, null));
            textViewArr[0].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, z10 ? org.telegram.ui.ActionBar.t6.H5 : org.telegram.ui.ActionBar.t6.q7, false));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
