package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class an0 implements TextWatcher {
    public final /* synthetic */ nn0 a;

    public an0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        nn0 nn0Var = this.a;
        ArrayList arrayList = nn0Var.U0;
        HashMap hashMap = nn0Var.W0;
        if (nn0Var.Z0) {
            return;
        }
        nn0Var.Z0 = true;
        String d = hf.b.d(nn0Var.Y[1].getText().toString(), false);
        nn0Var.Y[1].setText(d);
        org.telegram.ui.Components.w40 w40Var = (org.telegram.ui.Components.w40) nn0Var.Y[2];
        if (d.length() == 0) {
            w40Var.setHintText((String) null);
            w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            nn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
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
                        String str2 = d.substring(i10) + nn0Var.Y[2].getText().toString();
                        nn0Var.Y[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + nn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = nn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                w40Var.setHintText((String) null);
                w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                nn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                nn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) nn0Var.X0.get(d);
                if (str4 != null) {
                    w40Var.setHintText(str4.replace('X', (char) 8211));
                    w40Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = nn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                w40Var.requestFocus();
                w40Var.setText(str);
                w40Var.setSelection(w40Var.length());
            }
        }
        nn0Var.Z0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
