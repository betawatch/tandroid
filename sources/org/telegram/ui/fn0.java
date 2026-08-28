package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fn0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ co0 n;

    public fn0(co0 co0Var) {
        this.n = co0Var;
    }

    public final int a(String str) {
        int i9 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i9 >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i9]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i9++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        co0 co0Var = this.n;
        if (co0Var.i0) {
            return;
        }
        Long l10 = co0Var.D0;
        long longValue = l10 != null ? l10.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str);
        boolean z10 = a2 >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(co0Var.y0.invoice.currency);
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str2 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.parseLong(ne.b.d(substring, false)).longValue() * currencyExpDivider;
        long longValue3 = Utilities.parseLong(ne.b.d(substring2, false)).longValue();
        String m10 = aa.d.m(longValue3, "");
        String str3 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && m10.length() > str3.length()) {
            longValue3 = Utilities.parseLong(this.e - a2 < m10.length() ? m10.substring(0, str3.length()) : m10.substring(m10.length() - str3.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        co0Var.D0 = valueOf;
        if (co0Var.y0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j10 = co0Var.y0.invoice.max_tip_amount;
            if (longValue4 > j10) {
                co0Var.D0 = Long.valueOf(j10);
            }
        }
        int selectionStart = co0Var.f[0].getSelectionStart();
        co0Var.i0 = true;
        if (co0Var.D0.longValue() == 0) {
            co0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = co0Var.f[0];
            str2 = LocaleController.getInstance().formatCurrencyString(co0Var.D0.longValue(), false, z10, true, co0Var.y0.invoice.currency);
            editTextBoldCursor.setText(str2);
        }
        if (longValue < co0Var.D0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = co0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != co0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = co0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = co0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a3 = a(str2);
            if (a3 > 0) {
                co0Var.f[0].setSelection(a3 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = co0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        co0Var.L0();
        this.b = null;
        co0Var.i0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (this.n.i0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i9;
        boolean z10 = i10 == 1 && i11 == 0;
        this.c = z10;
        if (!z10) {
            return;
        }
        String fixNumbers = LocaleController.fixNumbers(charSequence);
        char charAt = fixNumbers.charAt(i9);
        int a2 = a(fixNumbers);
        String substring = a2 >= 0 ? fixNumbers.substring(a2 + 1) : "";
        long longValue = Utilities.parseLong(ne.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a2 <= 0 || i9 <= a2 || longValue != 0) {
                return;
            }
            this.b = fixNumbers.substring(0, a2 - 1);
            return;
        }
        while (true) {
            int i12 = i9 - 1;
            if (i12 < 0) {
                return;
            }
            char charAt2 = fixNumbers.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = fixNumbers.substring(0, i12) + fixNumbers.substring(i9);
                return;
            }
            i9 = i12;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
