package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public nn0(qn0 qn0Var, int i10) {
        this.b = qn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        qn0 qn0Var = this.b;
        if (!qn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                qn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(qn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        qn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                qn0Var.H = false;
            }
            if (i10 != qn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = qn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                qn0Var.d[i12].requestFocus();
            }
            int i13 = qn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = qn0Var.getCode();
                if (code.length() == qn0Var.O) {
                    qn0Var.h(null);
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
