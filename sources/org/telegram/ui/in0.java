package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class in0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public in0(kn0 kn0Var, int i10) {
        this.b = kn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        kn0 kn0Var = this.b;
        if (!kn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                kn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(kn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        kn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                kn0Var.H = false;
            }
            if (i10 != kn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = kn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                kn0Var.d[i12].requestFocus();
            }
            int i13 = kn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = kn0Var.getCode();
                if (code.length() == kn0Var.O) {
                    kn0Var.h(null);
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
