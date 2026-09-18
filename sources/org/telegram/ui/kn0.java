package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn0 b;

    public kn0(mn0 mn0Var, int i10) {
        this.b = mn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        mn0 mn0Var = this.b;
        if (!mn0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                mn0Var.H = true;
                for (int i11 = 0; i11 < Math.min(mn0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        mn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                mn0Var.H = false;
            }
            if (i10 != mn0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = mn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                mn0Var.d[i12].requestFocus();
            }
            int i13 = mn0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = mn0Var.getCode();
                if (code.length() == mn0Var.O) {
                    mn0Var.h(null);
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
