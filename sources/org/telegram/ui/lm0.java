package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lm0 implements TextWatcher {
    public final /* synthetic */ xm0 a;

    public lm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        xm0 xm0Var = this.a;
        ArrayList arrayList = xm0Var.Q0;
        HashMap hashMap = xm0Var.S0;
        if (xm0Var.V0) {
            return;
        }
        xm0Var.V0 = true;
        String d = oe.b.d(xm0Var.U[1].getText().toString(), false);
        xm0Var.U[1].setText(d);
        org.telegram.ui.Components.u30 u30Var = (org.telegram.ui.Components.u30) xm0Var.U[2];
        if (d.length() == 0) {
            u30Var.setHintText((String) null);
            u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            xm0Var.U[0].setText(LocaleController.getString(R.string.ChooseCountry));
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
                        String str2 = d.substring(i10) + xm0Var.U[2].getText().toString();
                        xm0Var.U[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + xm0Var.U[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = xm0Var.U[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                u30Var.setHintText((String) null);
                u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                xm0Var.U[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                xm0Var.U[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) xm0Var.T0.get(d);
                if (str4 != null) {
                    u30Var.setHintText(str4.replace('X', (char) 8211));
                    u30Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = xm0Var.U[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                u30Var.requestFocus();
                u30Var.setText(str);
                u30Var.setSelection(u30Var.length());
            }
        }
        xm0Var.V0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
