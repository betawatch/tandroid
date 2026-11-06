package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ lj0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        String str;
        int indexOf;
        int i7 = this.a;
        bk0 bk0Var = this.b;
        switch (i7) {
            case 0:
                if (!bk0Var.Z0 && bk0Var.T0 != 0 && bk0Var.Y[0].length() == bk0Var.T0) {
                    bk0Var.L.callOnClick();
                    break;
                }
                break;
            default:
                ArrayList arrayList = bk0Var.U0;
                HashMap hashMap = bk0Var.W0;
                if (!bk0Var.Z0) {
                    bk0Var.Z0 = true;
                    String d = pf.b.d(bk0Var.Y[1].getText().toString(), false);
                    bk0Var.Y[1].setText(d);
                    org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) bk0Var.Y[2];
                    if (d.length() == 0) {
                        v20Var.setHintText((String) null);
                        v20Var.setHint(org.telegram.messenger.hd.M0(2131747371, null));
                        bk0Var.Y[0].setText(org.telegram.messenger.hd.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str2 = d.substring(i10) + bk0Var.Y[2].getText().toString();
                                        bk0Var.Y[1].setText(substring);
                                        str = str2;
                                        d = substring;
                                        z9 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z9 = false;
                                    str = null;
                                }
                            }
                            if (!z9) {
                                str = d.substring(1) + bk0Var.Y[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = bk0Var.Y[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z9 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                            v20Var.setHintText((String) null);
                            v20Var.setHint(org.telegram.messenger.hd.M0(2131747371, null));
                            bk0Var.Y[0].setText(org.telegram.messenger.hd.M0(2131742860, null));
                        } else {
                            bk0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                            String str4 = (String) bk0Var.X0.get(d);
                            if (str4 != null) {
                                v20Var.setHintText(str4.replace('X', (char) 8211));
                                v20Var.setHint((CharSequence) null);
                            }
                        }
                        if (!z9) {
                            EditTextBoldCursor editTextBoldCursor2 = bk0Var.Y[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            v20Var.requestFocus();
                            v20Var.setText(str);
                            v20Var.setSelection(v20Var.length());
                        }
                    }
                    bk0Var.Z0 = false;
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
