package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bo0 implements TextWatcher {
    public final /* synthetic */ jo0 a;

    public bo0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z4;
        String str2;
        jo0 jo0Var = this.a;
        HashMap hashMap = jo0Var.c;
        if (jo0Var.j0) {
            return;
        }
        jo0Var.j0 = true;
        String d = se.b.d(jo0Var.f[8].getText().toString(), false);
        jo0Var.f[8].setText(d);
        org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) jo0Var.f[9];
        if (d.length() == 0) {
            h40Var.setHintText((String) null);
            h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z4 = false;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str3 = d.substring(i10) + jo0Var.f[9].getText().toString();
                        jo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z4 = true;
                        break;
                    }
                    i10--;
                }
                if (!z4) {
                    str = d.substring(1) + jo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = jo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z4 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || jo0Var.a.indexOf(str4) == -1 || (str2 = (String) jo0Var.d.get(d)) == null) {
                h40Var.setHintText((String) null);
                h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                h40Var.setHintText(str2.replace('X', (char) 8211));
                h40Var.setHint((CharSequence) null);
            }
            if (!z4) {
                EditTextBoldCursor editTextBoldCursor2 = jo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                h40Var.requestFocus();
                h40Var.setText(str);
                h40Var.setSelection(h40Var.length());
            }
        }
        jo0Var.j0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
