package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class en0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public en0(gn0 gn0Var, int i10) {
        this.b = gn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        gn0 gn0Var = this.b;
        if (!gn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                gn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(gn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        gn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                gn0Var.H = false;
            }
            if (i10 != gn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = gn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                gn0Var.d[i12].requestFocus();
            }
            int i13 = gn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = gn0Var.getCode();
                if (code.length() == gn0Var.O) {
                    gn0Var.h(null);
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
