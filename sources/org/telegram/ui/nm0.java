package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nm0 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ sm0 d;

    public nm0(sm0 sm0Var) {
        this.d = sm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i10;
        nt ntVar;
        sm0 sm0Var = this.d;
        if (sm0Var.o0) {
            return;
        }
        boolean z10 = true;
        EditTextBoldCursor editTextBoldCursor = sm0Var.f[1];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        if (this.a == 3) {
            obj = obj.substring(0, this.c) + obj.substring(this.c + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i11 = 0;
        while (i11 < obj.length()) {
            int i12 = i11 + 1;
            String substring = obj.substring(i11, i12);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i11 = i12;
        }
        sm0Var.o0 = true;
        org.telegram.ui.ActionBar.a7.V(sm0Var.f[1], org.telegram.ui.ActionBar.t6.G6, sm0Var.Y0);
        if (sb2.length() > 4) {
            sb2.setLength(4);
        }
        if (sb2.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb2.length() == 1) {
                int intValue = Utilities.z(sb2.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb2.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb2.length() == 2) {
                int intValue2 = Utilities.z(sb2.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    org.telegram.ui.ActionBar.a7.V(sm0Var.f[1], org.telegram.ui.ActionBar.t6.p7, sm0Var.Y0);
                } else {
                    z10 = false;
                }
                selectionStart++;
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                sm0Var.o0 = false;
            }
            z10 = false;
            if (!z10) {
            }
            if (sb2.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            sm0Var.o0 = false;
        }
        int i13 = sb2.length() > 2 ? 2 : 1;
        String[] strArr = new String[i13];
        strArr[0] = sb2.substring(0, 2);
        if (i13 == 2) {
            strArr[1] = sb2.substring(2);
        }
        if (sb2.length() == 4 && i13 == 2) {
            int intValue3 = Utilities.z(strArr[0]).intValue();
            int intValue4 = Utilities.z(strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i10 = ((org.telegram.ui.ActionBar.k2) sm0Var).currentAccount;
            boolean z11 = org.telegram.messenger.d20.i(i10).d().startsWith("7") || ((ntVar = sm0Var.A0) != null && ntVar.c.equals("7"));
            int i14 = z11 ? 2022 : calendar.get(1);
            int i15 = z11 ? 1 : calendar.get(2) + 1;
            if (intValue4 < i14 || (intValue4 == i14 && intValue3 < i15)) {
                org.telegram.ui.ActionBar.a7.V(sm0Var.f[1], org.telegram.ui.ActionBar.t6.p7, sm0Var.Y0);
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                sm0Var.o0 = false;
            }
            z10 = false;
            if (!z10) {
            }
            if (sb2.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            sm0Var.o0 = false;
        }
        int intValue5 = Utilities.z(strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            org.telegram.ui.ActionBar.a7.V(sm0Var.f[1], org.telegram.ui.ActionBar.t6.p7, sm0Var.Y0);
            if (!z10 && sb2.length() == 4) {
                sm0Var.f[sm0Var.i0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb2.length() == 2) {
                if (sb2.length() > 2 && sb2.charAt(2) != '/') {
                    sb2.insert(2, '/');
                }
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                sm0Var.o0 = false;
            }
            sb2.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            sm0Var.o0 = false;
        }
        z10 = false;
        if (!z10) {
            sm0Var.f[sm0Var.i0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb2.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb2);
        if (selectionStart >= 0) {
        }
        sm0Var.o0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            this.b = TextUtils.indexOf((CharSequence) this.d.f[1].getText(), '/') != -1;
            this.a = 1;
            return;
        }
        if (i11 != 1 || i12 != 0) {
            this.a = -1;
            return;
        }
        if (charSequence.charAt(i10) != '/' || i10 <= 0) {
            this.a = 2;
            return;
        }
        this.b = false;
        this.a = 3;
        this.c = i10 - 1;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
