package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fn0 implements TextWatcher {
    public final /* synthetic */ sn0 a;

    public fn0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        sn0 sn0Var = this.a;
        ArrayList arrayList = sn0Var.U0;
        HashMap hashMap = sn0Var.W0;
        if (sn0Var.Z0) {
            return;
        }
        sn0Var.Z0 = true;
        String d = jf.b.d(sn0Var.Y[1].getText().toString(), false);
        sn0Var.Y[1].setText(d);
        org.telegram.ui.Components.s40 s40Var = (org.telegram.ui.Components.s40) sn0Var.Y[2];
        if (d.length() == 0) {
            s40Var.setHintText((String) null);
            s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            sn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
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
                        String str2 = d.substring(i10) + sn0Var.Y[2].getText().toString();
                        sn0Var.Y[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + sn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = sn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                s40Var.setHintText((String) null);
                s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                sn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                sn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) sn0Var.X0.get(d);
                if (str4 != null) {
                    s40Var.setHintText(str4.replace('X', (char) 8211));
                    s40Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = sn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                s40Var.requestFocus();
                s40Var.setText(str);
                s40Var.setSelection(s40Var.length());
            }
        }
        sn0Var.Z0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
