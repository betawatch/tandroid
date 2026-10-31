package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ gm0(sm0 sm0Var, int i10) {
        this.a = i10;
        this.b = sm0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i10 = this.a;
        sm0 sm0Var = this.b;
        switch (i10) {
            case 0:
                if (sm0Var.c0 != 0 && editable.length() == sm0Var.c0) {
                    sm0Var.F0(false);
                    break;
                }
                break;
            default:
                HashMap hashMap = sm0Var.c;
                if (!sm0Var.m0) {
                    sm0Var.m0 = true;
                    String d = af.b.d(sm0Var.f[8].getText().toString(), false);
                    sm0Var.f[8].setText(d);
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) sm0Var.f[9];
                    if (d.length() == 0) {
                        n30Var.setHintText((String) null);
                        n30Var.setHint(org.telegram.messenger.cd.L0(2131747388, null));
                    } else {
                        int i11 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i11 >= 1) {
                                    String substring = d.substring(0, i11);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str3 = d.substring(i11) + sm0Var.f[9].getText().toString();
                                        sm0Var.f[8].setText(substring);
                                        str = str3;
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i11--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + sm0Var.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = sm0Var.f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str4 = (String) hashMap.get(d);
                        if (str4 == null || sm0Var.a.indexOf(str4) == -1 || (str2 = (String) sm0Var.d.get(d)) == null) {
                            n30Var.setHintText((String) null);
                            n30Var.setHint(org.telegram.messenger.cd.L0(2131747388, null));
                        } else {
                            n30Var.setHintText(str2.replace('X', (char) 8211));
                            n30Var.setHint((CharSequence) null);
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = sm0Var.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            n30Var.requestFocus();
                            n30Var.setText(str);
                            n30Var.setSelection(n30Var.length());
                        }
                    }
                    sm0Var.m0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
