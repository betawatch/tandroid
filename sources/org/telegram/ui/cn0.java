package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;

    public cn0(en0 en0Var, int i10) {
        this.b = en0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        en0 en0Var = this.b;
        if (!en0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                en0Var.H = true;
                for (int i11 = 0; i11 < Math.min(en0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        en0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                en0Var.H = false;
            }
            if (i10 != en0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = en0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                en0Var.d[i12].requestFocus();
            }
            int i13 = en0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = en0Var.getCode();
                if (code.length() == en0Var.O) {
                    en0Var.h(null);
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
