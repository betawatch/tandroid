package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class go0 implements TextWatcher {
    public final /* synthetic */ oo0 a;

    public go0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        oo0 oo0Var = this.a;
        HashMap hashMap = oo0Var.c;
        if (oo0Var.m0) {
            return;
        }
        oo0Var.m0 = true;
        String d = gf.b.d(oo0Var.f[8].getText().toString(), false);
        oo0Var.f[8].setText(d);
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) oo0Var.f[9];
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
                        String str3 = d.substring(i10) + oo0Var.f[9].getText().toString();
                        oo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + oo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = oo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || oo0Var.a.indexOf(str4) == -1 || (str2 = (String) oo0Var.d.get(d)) == null) {
                g40Var.setHintText((String) null);
                g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                g40Var.setHintText(str2.replace('X', (char) 8211));
                g40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = oo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                g40Var.requestFocus();
                g40Var.setText(str);
                g40Var.setSelection(g40Var.length());
            }
        }
        oo0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
