package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fl0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public fl0(hl0 hl0Var, int i10) {
        this.b = hl0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        hl0 hl0Var = this.b;
        if (!hl0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                hl0Var.H = true;
                for (int i11 = 0; i11 < Math.min(hl0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        hl0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                hl0Var.H = false;
            }
            if (i10 != hl0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = hl0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                hl0Var.d[i12].requestFocus();
            }
            int i13 = hl0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = hl0Var.getCode();
                if (code.length() == hl0Var.O) {
                    hl0Var.h(null);
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
