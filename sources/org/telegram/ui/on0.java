package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class on0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ lo0 n;

    public on0(lo0 lo0Var) {
        this.n = lo0Var;
    }

    public final int a(String str) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i10 >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i10]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i10++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        lo0 lo0Var = this.n;
        if (lo0Var.j0) {
            return;
        }
        Long l10 = lo0Var.E0;
        long longValue = l10 != null ? l10.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str);
        boolean z4 = a2 >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(lo0Var.z0.invoice.currency);
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str2 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.parseLong(se.b.d(substring, false)).longValue() * currencyExpDivider;
        long longValue3 = Utilities.parseLong(se.b.d(substring2, false)).longValue();
        String n10 = android.support.v4.media.a.n(longValue3, "");
        String str3 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && n10.length() > str3.length()) {
            longValue3 = Utilities.parseLong(this.e - a2 < n10.length() ? n10.substring(0, str3.length()) : n10.substring(n10.length() - str3.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        lo0Var.E0 = valueOf;
        if (lo0Var.z0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j10 = lo0Var.z0.invoice.max_tip_amount;
            if (longValue4 > j10) {
                lo0Var.E0 = Long.valueOf(j10);
            }
        }
        int selectionStart = lo0Var.f[0].getSelectionStart();
        lo0Var.j0 = true;
        if (lo0Var.E0.longValue() == 0) {
            lo0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = lo0Var.f[0];
            str2 = LocaleController.getInstance().formatCurrencyString(lo0Var.E0.longValue(), false, z4, true, lo0Var.z0.invoice.currency);
            editTextBoldCursor.setText(str2);
        }
        if (longValue < lo0Var.E0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = lo0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != lo0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = lo0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z4 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = lo0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a10 = a(str2);
            if (a10 > 0) {
                lo0Var.f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = lo0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z4;
        lo0Var.L0();
        this.b = null;
        lo0Var.j0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.n.j0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i10;
        boolean z4 = i11 == 1 && i12 == 0;
        this.c = z4;
        if (!z4) {
            return;
        }
        String fixNumbers = LocaleController.fixNumbers(charSequence);
        char charAt = fixNumbers.charAt(i10);
        int a2 = a(fixNumbers);
        String substring = a2 >= 0 ? fixNumbers.substring(a2 + 1) : "";
        long longValue = Utilities.parseLong(se.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a2 <= 0 || i10 <= a2 || longValue != 0) {
                return;
            }
            this.b = fixNumbers.substring(0, a2 - 1);
            return;
        }
        while (true) {
            int i13 = i10 - 1;
            if (i13 < 0) {
                return;
            }
            char charAt2 = fixNumbers.charAt(i13);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
                return;
            }
            i10 = i13;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
