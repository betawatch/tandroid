package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mo0 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ ro0 d;

    public mo0(ro0 ro0Var) {
        this.d = ro0Var;
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
        lt ltVar;
        ro0 ro0Var = this.d;
        if (ro0Var.o0) {
            return;
        }
        boolean z10 = true;
        EditTextBoldCursor editTextBoldCursor = ro0Var.f[1];
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
        ro0Var.o0 = true;
        org.telegram.ui.ActionBar.f7.V(ro0Var.f[1], org.telegram.ui.ActionBar.y6.G6, ro0Var.Y0);
        if (sb2.length() > 4) {
            sb2.setLength(4);
        }
        if (sb2.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb2.length() == 1) {
                int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb2.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb2.length() == 2) {
                int intValue2 = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    org.telegram.ui.ActionBar.f7.V(ro0Var.f[1], org.telegram.ui.ActionBar.y6.p7, ro0Var.Y0);
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
                ro0Var.o0 = false;
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
            ro0Var.o0 = false;
        }
        int i13 = sb2.length() > 2 ? 2 : 1;
        String[] strArr = new String[i13];
        strArr[0] = sb2.substring(0, 2);
        if (i13 == 2) {
            strArr[1] = sb2.substring(2);
        }
        if (sb2.length() == 4 && i13 == 2) {
            int intValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
            int intValue4 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i10 = ((org.telegram.ui.ActionBar.r2) ro0Var).currentAccount;
            boolean z11 = UserConfig.getInstance(i10).getClientPhone().startsWith("7") || ((ltVar = ro0Var.A0) != null && ltVar.c.equals("7"));
            int i14 = z11 ? 2022 : calendar.get(1);
            int i15 = z11 ? 1 : calendar.get(2) + 1;
            if (intValue4 < i14 || (intValue4 == i14 && intValue3 < i15)) {
                org.telegram.ui.ActionBar.f7.V(ro0Var.f[1], org.telegram.ui.ActionBar.y6.p7, ro0Var.Y0);
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                ro0Var.o0 = false;
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
            ro0Var.o0 = false;
        }
        int intValue5 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            org.telegram.ui.ActionBar.f7.V(ro0Var.f[1], org.telegram.ui.ActionBar.y6.p7, ro0Var.Y0);
            if (!z10 && sb2.length() == 4) {
                ro0Var.f[ro0Var.i0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb2.length() == 2) {
                if (sb2.length() > 2 && sb2.charAt(2) != '/') {
                    sb2.insert(2, '/');
                }
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                ro0Var.o0 = false;
            }
            sb2.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            ro0Var.o0 = false;
        }
        z10 = false;
        if (!z10) {
            ro0Var.f[ro0Var.i0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb2.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb2);
        if (selectionStart >= 0) {
        }
        ro0Var.o0 = false;
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
