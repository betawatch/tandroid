package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public bk0(dk0 dk0Var, int i7) {
        this.b = dk0Var;
        this.a = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        dk0 dk0Var = this.b;
        if (!dk0Var.I && (length = editable.length()) >= 1) {
            int i7 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                dk0Var.I = true;
                for (int i10 = 0; i10 < Math.min(dk0Var.P - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        dk0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                dk0Var.I = false;
            }
            if (i7 != dk0Var.P - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = dk0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                dk0Var.d[i11].requestFocus();
            }
            int i12 = dk0Var.P;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = dk0Var.getCode();
                if (code.length() == dk0Var.P) {
                    dk0Var.h(null);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
