package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class pm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm0 b;

    public pm0(rm0 rm0Var, int i10) {
        this.b = rm0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        rm0 rm0Var = this.b;
        if (!rm0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                rm0Var.H = true;
                for (int i11 = 0; i11 < Math.min(rm0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        rm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                rm0Var.H = false;
            }
            if (i10 != rm0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = rm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                rm0Var.d[i12].requestFocus();
            }
            int i13 = rm0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = rm0Var.getCode();
                if (code.length() == rm0Var.O) {
                    rm0Var.h(null);
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
