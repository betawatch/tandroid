package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mk0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ hl0 n;

    public mk0(hl0 hl0Var) {
        this.n = hl0Var;
    }

    public final int a(String str) {
        int i7 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i7 >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i7]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i7++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i7;
        hl0 hl0Var = this.n;
        if (hl0Var.m0) {
            return;
        }
        Long l10 = hl0Var.H0;
        long longValue = l10 != null ? l10.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = org.telegram.messenger.id.n(editable.toString());
        }
        int a10 = a(str);
        boolean z9 = a10 >= 0;
        String str2 = hl0Var.C0.invoice.currency;
        str2.getClass();
        i7 = 10;
        switch (str2) {
            case "BHD":
            case "IQD":
            case "JOD":
            case "KWD":
            case "LYD":
            case "OMR":
            case "TND":
                i7 = 1000;
                break;
            case "BIF":
            case "BYR":
            case "CLP":
            case "CVE":
            case "DJF":
            case "GNF":
            case "ISK":
            case "JPY":
            case "KMF":
            case "KRW":
            case "MGA":
            case "PYG":
            case "RWF":
            case "UGX":
            case "UYI":
            case "VND":
            case "VUV":
            case "XAF":
            case "XOF":
            case "XPF":
                i7 = 1;
                break;
            case "CLF":
                i7 = 10000;
                break;
            case "MRO":
                break;
            default:
                i7 = 100;
                break;
        }
        String substring = a10 >= 0 ? str.substring(0, a10) : str;
        String str3 = "";
        String substring2 = a10 >= 0 ? str.substring(a10 + 1) : "";
        long longValue2 = Utilities.A(pf.b.d(substring, false)).longValue() * i7;
        long longValue3 = Utilities.A(pf.b.d(substring2, false)).longValue();
        String o4 = a8.p0.o(longValue3, "");
        String str4 = "" + (i7 - 1);
        if (a10 > 0 && o4.length() > str4.length()) {
            longValue3 = Utilities.A(this.e - a10 < o4.length() ? o4.substring(0, str4.length()) : o4.substring(o4.length() - str4.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        hl0Var.H0 = valueOf;
        if (hl0Var.C0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j3 = hl0Var.C0.invoice.max_tip_amount;
            if (longValue4 > j3) {
                hl0Var.H0 = Long.valueOf(j3);
            }
        }
        int selectionStart = hl0Var.f[0].getSelectionStart();
        hl0Var.m0 = true;
        if (hl0Var.H0.longValue() == 0) {
            hl0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = hl0Var.f[0];
            str3 = org.telegram.messenger.id.E0().q(hl0Var.H0.longValue(), false, z9, true, hl0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str3);
        }
        if (longValue < hl0Var.H0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = hl0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != hl0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = hl0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z9 || a10 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = hl0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a11 = a(str3);
            if (a11 > 0) {
                hl0Var.f[0].setSelection(a11 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = hl0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z9;
        hl0Var.R0();
        this.b = null;
        hl0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.n.m0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i7;
        boolean z9 = i10 == 1 && i11 == 0;
        this.c = z9;
        if (!z9) {
            return;
        }
        String n10 = org.telegram.messenger.id.n(charSequence);
        char charAt = n10.charAt(i7);
        int a10 = a(n10);
        String substring = a10 >= 0 ? n10.substring(a10 + 1) : "";
        long longValue = Utilities.A(pf.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a10 <= 0 || i7 <= a10 || longValue != 0) {
                return;
            }
            this.b = n10.substring(0, a10 - 1);
            return;
        }
        while (true) {
            int i12 = i7 - 1;
            if (i12 < 0) {
                return;
            }
            char charAt2 = n10.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = n10.substring(0, i12) + n10.substring(i7);
                return;
            }
            i7 = i12;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
