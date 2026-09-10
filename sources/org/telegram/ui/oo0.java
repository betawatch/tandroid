package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oo0 implements TextWatcher {
    public final /* synthetic */ wo0 a;

    public oo0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        wo0 wo0Var = this.a;
        HashMap hashMap = wo0Var.c;
        if (wo0Var.m0) {
            return;
        }
        wo0Var.m0 = true;
        String d = gf.b.d(wo0Var.f[8].getText().toString(), false);
        wo0Var.f[8].setText(d);
        org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) wo0Var.f[9];
        if (d.length() == 0) {
            p40Var.setHintText((String) null);
            p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
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
                        String str3 = d.substring(i10) + wo0Var.f[9].getText().toString();
                        wo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + wo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = wo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || wo0Var.a.indexOf(str4) == -1 || (str2 = (String) wo0Var.d.get(d)) == null) {
                p40Var.setHintText((String) null);
                p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                p40Var.setHintText(str2.replace('X', (char) 8211));
                p40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = wo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p40Var.requestFocus();
                p40Var.setText(str);
                p40Var.setSelection(p40Var.length());
            }
        }
        wo0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
