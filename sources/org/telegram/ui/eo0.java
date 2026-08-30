package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class eo0 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ jo0 d;

    public eo0(jo0 jo0Var) {
        this.d = jo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i10;
        st stVar;
        jo0 jo0Var = this.d;
        if (jo0Var.l0) {
            return;
        }
        boolean z4 = true;
        EditTextBoldCursor editTextBoldCursor = jo0Var.f[1];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        if (this.a == 3) {
            obj = obj.substring(0, this.c) + obj.substring(this.c + 1);
            selectionStart--;
        }
        StringBuilder sb = new StringBuilder(obj.length());
        int i11 = 0;
        while (i11 < obj.length()) {
            int i12 = i11 + 1;
            String substring = obj.substring(i11, i12);
            if ("0123456789".contains(substring)) {
                sb.append(substring);
            }
            i11 = i12;
        }
        jo0Var.l0 = true;
        jo0Var.f[1].setTextColor(jo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        if (sb.length() > 4) {
            sb.setLength(4);
        }
        if (sb.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb.length() == 1) {
                int intValue = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb.length() == 2) {
                int intValue2 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    jo0Var.f[1].setTextColor(jo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                } else {
                    z4 = false;
                }
                selectionStart++;
                if (!z4) {
                }
                if (sb.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                }
                jo0Var.l0 = false;
            }
            z4 = false;
            if (!z4) {
            }
            if (sb.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            jo0Var.l0 = false;
        }
        int i13 = sb.length() > 2 ? 2 : 1;
        String[] strArr = new String[i13];
        strArr[0] = sb.substring(0, 2);
        if (i13 == 2) {
            strArr[1] = sb.substring(2);
        }
        if (sb.length() == 4 && i13 == 2) {
            int intValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
            int intValue4 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i10 = ((org.telegram.ui.ActionBar.p2) jo0Var).currentAccount;
            boolean z10 = UserConfig.getInstance(i10).getClientPhone().startsWith("7") || ((stVar = jo0Var.x0) != null && stVar.c.equals("7"));
            int i14 = z10 ? 2022 : calendar.get(1);
            int i15 = z10 ? 1 : calendar.get(2) + 1;
            if (intValue4 < i14 || (intValue4 == i14 && intValue3 < i15)) {
                jo0Var.f[1].setTextColor(jo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                if (!z4) {
                }
                if (sb.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                }
                jo0Var.l0 = false;
            }
            z4 = false;
            if (!z4) {
            }
            if (sb.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            jo0Var.l0 = false;
        }
        int intValue5 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            jo0Var.f[1].setTextColor(jo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            if (!z4 && sb.length() == 4) {
                jo0Var.f[jo0Var.f0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb.length() == 2) {
                if (sb.length() > 2 && sb.charAt(2) != '/') {
                    sb.insert(2, '/');
                }
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                jo0Var.l0 = false;
            }
            sb.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            jo0Var.l0 = false;
        }
        z4 = false;
        if (!z4) {
            jo0Var.f[jo0Var.f0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb);
        if (selectionStart >= 0) {
        }
        jo0Var.l0 = false;
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
