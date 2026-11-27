// default package

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o28 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ o28(p pVar, byte b) {
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
                    String h = f78.h(pVar.f[8].getText().toString(), false);
                    pVar.f[8].setText(h);
                    gg5 gg5Var = (gg5) pVar.f[9];
                    if (h.length() == 0) {
                        gg5Var.setHintText((String) null);
                        gg5Var.setHint(ob6.M0(2131747099, null));
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
                            gg5Var.setHintText((String) null);
                            gg5Var.setHint(ob6.M0(2131747099, null));
                        } else {
                            gg5Var.setHintText(str2.replace('X', (char) 8211));
                            gg5Var.setHint((CharSequence) null);
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = pVar.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            gg5Var.requestFocus();
                            gg5Var.setText(str);
                            gg5Var.setSelection(gg5Var.length());
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
