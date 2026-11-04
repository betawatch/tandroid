package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ik0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ dl0 n;

    public ik0(dl0 dl0Var) {
        this.n = dl0Var;
    }

    public final int a(String str) {
        int i3 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i3 >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i3]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i3++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i3;
        dl0 dl0Var = this.n;
        if (dl0Var.n0) {
            return;
        }
        Long l10 = dl0Var.I0;
        long longValue = l10 != null ? l10.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = org.telegram.messenger.bd.n(editable.toString());
        }
        int a10 = a(str);
        boolean z10 = a10 >= 0;
        String str2 = dl0Var.D0.invoice.currency;
        str2.getClass();
        i3 = 10;
        switch (str2) {
            case "BHD":
            case "IQD":
            case "JOD":
            case "KWD":
            case "LYD":
            case "OMR":
            case "TND":
                i3 = 1000;
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
                i3 = 1;
                break;
            case "CLF":
                i3 = 10000;
                break;
            case "MRO":
                break;
            default:
                i3 = 100;
                break;
        }
        String substring = a10 >= 0 ? str.substring(0, a10) : str;
        String str3 = "";
        String substring2 = a10 >= 0 ? str.substring(a10 + 1) : "";
        long longValue2 = Utilities.A(mf.b.d(substring, false)).longValue() * i3;
        long longValue3 = Utilities.A(mf.b.d(substring2, false)).longValue();
        String p10 = a1.g.p(longValue3, "");
        String str4 = "" + (i3 - 1);
        if (a10 > 0 && p10.length() > str4.length()) {
            longValue3 = Utilities.A(this.e - a10 < p10.length() ? p10.substring(0, str4.length()) : p10.substring(p10.length() - str4.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        dl0Var.I0 = valueOf;
        if (dl0Var.D0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j10 = dl0Var.D0.invoice.max_tip_amount;
            if (longValue4 > j10) {
                dl0Var.I0 = Long.valueOf(j10);
            }
        }
        int selectionStart = dl0Var.f[0].getSelectionStart();
        dl0Var.n0 = true;
        if (dl0Var.I0.longValue() == 0) {
            dl0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = dl0Var.f[0];
            str3 = org.telegram.messenger.bd.E0().q(dl0Var.I0.longValue(), false, z10, true, dl0Var.D0.invoice.currency);
            editTextBoldCursor.setText(str3);
        }
        if (longValue < dl0Var.I0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = dl0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != dl0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = dl0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a10 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = dl0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a11 = a(str3);
            if (a11 > 0) {
                dl0Var.f[0].setSelection(a11 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = dl0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        dl0Var.R0();
        this.b = null;
        dl0Var.n0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (this.n.n0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i3;
        boolean z10 = i10 == 1 && i11 == 0;
        this.c = z10;
        if (!z10) {
            return;
        }
        String n4 = org.telegram.messenger.bd.n(charSequence);
        char charAt = n4.charAt(i3);
        int a10 = a(n4);
        String substring = a10 >= 0 ? n4.substring(a10 + 1) : "";
        long longValue = Utilities.A(mf.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a10 <= 0 || i3 <= a10 || longValue != 0) {
                return;
            }
            this.b = n4.substring(0, a10 - 1);
            return;
        }
        while (true) {
            int i12 = i3 - 1;
            if (i12 < 0) {
                return;
            }
            char charAt2 = n4.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = n4.substring(0, i12) + n4.substring(i3);
                return;
            }
            i3 = i12;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
