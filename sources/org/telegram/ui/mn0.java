package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public mn0(on0 on0Var, int i10) {
        this.b = on0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        on0 on0Var = this.b;
        if (!on0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                on0Var.H = true;
                for (int i11 = 0; i11 < Math.min(on0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        on0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                on0Var.H = false;
            }
            if (i10 != on0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = on0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                on0Var.d[i12].requestFocus();
            }
            int i13 = on0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = on0Var.getCode();
                if (code.length() == on0Var.O) {
                    on0Var.h(null);
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
