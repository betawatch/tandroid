package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class km0 implements TextWatcher {
    public final /* synthetic */ wm0 a;

    public km0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        wm0 wm0Var = this.a;
        ArrayList arrayList = wm0Var.Q0;
        HashMap hashMap = wm0Var.S0;
        if (wm0Var.V0) {
            return;
        }
        wm0Var.V0 = true;
        String d = ne.b.d(wm0Var.U[1].getText().toString(), false);
        wm0Var.U[1].setText(d);
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) wm0Var.U[2];
        if (d.length() == 0) {
            p30Var.setHintText((String) null);
            p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            wm0Var.U[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i9 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i9 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String substring = d.substring(0, i9);
                    if (((String) hashMap.get(substring)) != null) {
                        String str2 = d.substring(i9) + wm0Var.U[2].getText().toString();
                        wm0Var.U[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i9--;
                }
                if (!z10) {
                    str = d.substring(1) + wm0Var.U[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = wm0Var.U[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                p30Var.setHintText((String) null);
                p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                wm0Var.U[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                wm0Var.U[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) wm0Var.T0.get(d);
                if (str4 != null) {
                    p30Var.setHintText(str4.replace('X', (char) 8211));
                    p30Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p30Var.requestFocus();
                p30Var.setText(str);
                p30Var.setSelection(p30Var.length());
            }
        }
        wm0Var.V0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
