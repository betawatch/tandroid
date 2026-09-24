package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class an0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public an0(cn0 cn0Var, int i10) {
        this.b = cn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        cn0 cn0Var = this.b;
        if (!cn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                cn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(cn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        cn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                cn0Var.H = false;
            }
            if (i10 != cn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = cn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                cn0Var.d[i12].requestFocus();
            }
            int i13 = cn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = cn0Var.getCode();
                if (code.length() == cn0Var.O) {
                    cn0Var.h(null);
                }
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
