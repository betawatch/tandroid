package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class no0 implements TextWatcher {
    public final /* synthetic */ vo0 a;

    public no0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        vo0 vo0Var = this.a;
        HashMap hashMap = vo0Var.c;
        if (vo0Var.m0) {
            return;
        }
        vo0Var.m0 = true;
        String d = hf.b.d(vo0Var.f[8].getText().toString(), false);
        vo0Var.f[8].setText(d);
        org.telegram.ui.Components.w40 w40Var = (org.telegram.ui.Components.w40) vo0Var.f[9];
        if (d.length() == 0) {
            w40Var.setHintText((String) null);
            w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
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
                        String str3 = d.substring(i10) + vo0Var.f[9].getText().toString();
                        vo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + vo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = vo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || vo0Var.a.indexOf(str4) == -1 || (str2 = (String) vo0Var.d.get(d)) == null) {
                w40Var.setHintText((String) null);
                w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                w40Var.setHintText(str2.replace('X', (char) 8211));
                w40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = vo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                w40Var.requestFocus();
                w40Var.setText(str);
                w40Var.setSelection(w40Var.length());
            }
        }
        vo0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
