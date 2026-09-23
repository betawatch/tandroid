package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class io0 implements TextWatcher {
    public final /* synthetic */ qo0 a;

    public io0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        qo0 qo0Var = this.a;
        HashMap hashMap = qo0Var.c;
        if (qo0Var.m0) {
            return;
        }
        qo0Var.m0 = true;
        String d = gf.b.d(qo0Var.f[8].getText().toString(), false);
        qo0Var.f[8].setText(d);
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) qo0Var.f[9];
        if (d.length() == 0) {
            g40Var.setHintText((String) null);
            g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str3 = d.substring(i10) + qo0Var.f[9].getText().toString();
                        qo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + qo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = qo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || qo0Var.a.indexOf(str4) == -1 || (str2 = (String) qo0Var.d.get(d)) == null) {
                g40Var.setHintText((String) null);
                g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                g40Var.setHintText(str2.replace('X', (char) 8211));
                g40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = qo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                g40Var.requestFocus();
                g40Var.setText(str);
                g40Var.setSelection(g40Var.length());
            }
        }
        qo0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
