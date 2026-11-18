package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bl0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ bl0(ml0 ml0Var, int i7) {
        this.a = i7;
        this.b = ml0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i7 = this.a;
        ml0 ml0Var = this.b;
        switch (i7) {
            case 0:
                if (ml0Var.d0 != 0 && editable.length() == ml0Var.d0) {
                    ml0Var.G0(false);
                    break;
                }
                break;
            default:
                HashMap hashMap = ml0Var.c;
                if (!ml0Var.n0) {
                    ml0Var.n0 = true;
                    String d = pf.b.d(ml0Var.f[8].getText().toString(), false);
                    ml0Var.f[8].setText(d);
                    org.telegram.ui.Components.g30 g30Var = (org.telegram.ui.Components.g30) ml0Var.f[9];
                    if (d.length() == 0) {
                        g30Var.setHintText((String) null);
                        g30Var.setHint(org.telegram.messenger.gd.M0(2131747179, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str3 = d.substring(i10) + ml0Var.f[9].getText().toString();
                                        ml0Var.f[8].setText(substring);
                                        str = str3;
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + ml0Var.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = ml0Var.f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str4 = (String) hashMap.get(d);
                        if (str4 == null || ml0Var.a.indexOf(str4) == -1 || (str2 = (String) ml0Var.d.get(d)) == null) {
                            g30Var.setHintText((String) null);
                            g30Var.setHint(org.telegram.messenger.gd.M0(2131747179, null));
                        } else {
                            g30Var.setHintText(str2.replace('X', (char) 8211));
                            g30Var.setHint((CharSequence) null);
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = ml0Var.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            g30Var.requestFocus();
                            g30Var.setText(str);
                            g30Var.setSelection(g30Var.length());
                        }
                    }
                    ml0Var.n0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
