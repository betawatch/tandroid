package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jo0 implements TextWatcher {
    public final /* synthetic */ ro0 a;

    public jo0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        ro0 ro0Var = this.a;
        HashMap hashMap = ro0Var.c;
        if (ro0Var.m0) {
            return;
        }
        ro0Var.m0 = true;
        String d = kf.b.d(ro0Var.f[8].getText().toString(), false);
        ro0Var.f[8].setText(d);
        org.telegram.ui.Components.q40 q40Var = (org.telegram.ui.Components.q40) ro0Var.f[9];
        if (d.length() == 0) {
            q40Var.setHintText((String) null);
            q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        z10 = false;
                        str = null;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str3 = d.substring(i10) + ro0Var.f[9].getText().toString();
                        ro0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + ro0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = ro0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || ro0Var.a.indexOf(str4) == -1 || (str2 = (String) ro0Var.d.get(d)) == null) {
                q40Var.setHintText((String) null);
                q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                q40Var.setHintText(str2.replace('X', (char) 8211));
                q40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = ro0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                q40Var.requestFocus();
                q40Var.setText(str);
                q40Var.setSelection(q40Var.length());
            }
        }
        ro0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
