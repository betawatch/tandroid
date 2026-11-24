// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b18 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ p n;

    public b18(p pVar) {
        this.n = pVar;
    }

    public final int a(String str) {
        int i = 0;
        while (true) {
            char[] cArr = this.h;
            if (i >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        String str;
        String str2;
        p pVar = this.n;
        if (pVar.n0) {
            return;
        }
        Long l = pVar.I0;
        long longValue = l != null ? l.longValue() : 0L;
        String str3 = this.b;
        if (str3 == null) {
            str3 = jb6.n(editable.toString());
        }
        int a = a(str3);
        boolean z = a >= 0;
        String str4 = pVar.D0.invoice.currency;
        str4.getClass();
        i = 10;
        switch (str4) {
            case "BHD":
            case "IQD":
            case "JOD":
            case "KWD":
            case "LYD":
            case "OMR":
            case "TND":
                i = 1000;
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
                i = 1;
                break;
            case "CLF":
                i = 10000;
                break;
            case "MRO":
                break;
            default:
                i = 100;
                break;
        }
        String str5 = "";
        if (a >= 0) {
            str = str3.substring(0, a);
            str2 = str3.substring(a + 1);
        } else {
            str = str3;
            str2 = "";
        }
        long longValue2 = Utilities.A(r58.h(str, false)).longValue() * i;
        long longValue3 = Utilities.A(r58.h(str2, false)).longValue();
        String valueOf = String.valueOf(longValue3);
        String valueOf2 = String.valueOf(i - 1);
        if (a > 0 && valueOf.length() > valueOf2.length()) {
            longValue3 = Utilities.A(this.e - a < valueOf.length() ? valueOf.substring(0, valueOf2.length()) : valueOf.substring(valueOf.length() - valueOf2.length())).longValue();
        }
        Long valueOf3 = Long.valueOf(longValue2 + longValue3);
        pVar.I0 = valueOf3;
        if (pVar.D0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf3.longValue();
            long j = pVar.D0.invoice.max_tip_amount;
            if (longValue4 > j) {
                pVar.I0 = Long.valueOf(j);
            }
        }
        int selectionStart = pVar.f[0].getSelectionStart();
        pVar.n0 = true;
        long longValue5 = pVar.I0.longValue();
        EditTextBoldCursor[] editTextBoldCursorArr = pVar.f;
        if (longValue5 == 0) {
            editTextBoldCursorArr[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
            str5 = jb6.D0().q(pVar.I0.longValue(), false, z, true, pVar.D0.invoice.currency);
            editTextBoldCursor.setText(str5);
        }
        if (longValue < pVar.I0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = pVar.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != pVar.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = pVar.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z || a < 0) {
            EditTextBoldCursor editTextBoldCursor4 = pVar.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a2 = a(str5);
            EditTextBoldCursor[] editTextBoldCursorArr2 = pVar.f;
            if (a2 > 0) {
                editTextBoldCursorArr2[0].setSelection(a2 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr2[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z;
        pVar.R0();
        this.b = null;
        pVar.n0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.n.n0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i;
        boolean z = i2 == 1 && i3 == 0;
        this.c = z;
        if (!z) {
            return;
        }
        String n = jb6.n(charSequence);
        char charAt = n.charAt(i);
        int a = a(n);
        String substring = a >= 0 ? n.substring(a + 1) : "";
        long longValue = Utilities.A(r58.h(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a <= 0 || i <= a || longValue != 0) {
                return;
            }
            this.b = n.substring(0, a - 1);
            return;
        }
        while (true) {
            int i4 = i - 1;
            if (i4 < 0) {
                return;
            }
            char charAt2 = n.charAt(i4);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = n.substring(0, i4).concat(n.substring(i));
                return;
            }
            i = i4;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
