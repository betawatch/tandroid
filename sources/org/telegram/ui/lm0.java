package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class lm0 implements TextWatcher {
    public final /* synthetic */ xm0 a;

    public lm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        xm0 xm0Var = this.a;
        ArrayList arrayList = xm0Var.U0;
        HashMap hashMap = xm0Var.W0;
        if (xm0Var.Z0) {
            return;
        }
        xm0Var.Z0 = true;
        String d = jf.b.d(xm0Var.Y[1].getText().toString(), false);
        xm0Var.Y[1].setText(d);
        org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) xm0Var.Y[2];
        if (d.length() == 0) {
            o40Var.setHintText((String) null);
            o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            xm0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
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
                        String str2 = d.substring(i10) + xm0Var.Y[2].getText().toString();
                        xm0Var.Y[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + xm0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = xm0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                o40Var.setHintText((String) null);
                o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                xm0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                xm0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) xm0Var.X0.get(d);
                if (str4 != null) {
                    o40Var.setHintText(str4.replace('X', (char) 8211));
                    o40Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = xm0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                o40Var.requestFocus();
                o40Var.setText(str);
                o40Var.setSelection(o40Var.length());
            }
        }
        xm0Var.Z0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
