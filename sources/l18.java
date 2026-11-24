// default package

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l18 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ l18(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        String str2;
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.d0 != 0 && editable.length() == pVar.d0) {
                    pVar.G0(false);
                    break;
                }
                break;
            default:
                HashMap hashMap = pVar.c;
                if (!pVar.n0) {
                    pVar.n0 = true;
                    String h = r58.h(pVar.f[8].getText().toString(), false);
                    pVar.f[8].setText(h);
                    dg5 dg5Var = (dg5) pVar.f[9];
                    if (h.length() == 0) {
                        dg5Var.setHintText((String) null);
                        dg5Var.setHint(jb6.M0(2131747105, null));
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= 1) {
                                    String substring = h.substring(0, i);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str3 = h.substring(i) + pVar.f[9].getText().toString();
                                        pVar.f[8].setText(substring);
                                        str = str3;
                                        h = substring;
                                        z = true;
                                    } else {
                                        i--;
                                    }
                                } else {
                                    z = false;
                                    str = null;
                                }
                            }
                            if (!z) {
                                str = h.substring(1) + pVar.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = pVar.f[8];
                                h = h.substring(0, 1);
                                editTextBoldCursor.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        String str4 = (String) hashMap.get(h);
                        if (str4 == null || pVar.a.indexOf(str4) == -1 || (str2 = (String) pVar.d.get(h)) == null) {
                            dg5Var.setHintText((String) null);
                            dg5Var.setHint(jb6.M0(2131747105, null));
                        } else {
                            dg5Var.setHintText(str2.replace('X', (char) 8211));
                            dg5Var.setHint((CharSequence) null);
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = pVar.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            dg5Var.requestFocus();
                            dg5Var.setText(str);
                            dg5Var.setSelection(dg5Var.length());
                        }
                    }
                    pVar.n0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
