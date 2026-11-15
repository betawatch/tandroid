package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ oj0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i7 = this.a;
        ek0 ek0Var = this.b;
        switch (i7) {
            case 0:
                if (!ek0Var.a1 && ek0Var.U0 != 0 && ek0Var.Z[0].length() == ek0Var.U0) {
                    ek0Var.M.callOnClick();
                    break;
                }
                break;
            default:
                ArrayList arrayList = ek0Var.V0;
                HashMap hashMap = ek0Var.X0;
                if (!ek0Var.a1) {
                    ek0Var.a1 = true;
                    String d = pf.b.d(ek0Var.Z[1].getText().toString(), false);
                    ek0Var.Z[1].setText(d);
                    org.telegram.ui.Components.y20 y20Var = (org.telegram.ui.Components.y20) ek0Var.Z[2];
                    if (d.length() == 0) {
                        y20Var.setHintText((String) null);
                        y20Var.setHint(org.telegram.messenger.hd.M0(2131747372, null));
                        ek0Var.Z[0].setText(org.telegram.messenger.hd.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str2 = d.substring(i10) + ek0Var.Z[2].getText().toString();
                                        ek0Var.Z[1].setText(substring);
                                        str = str2;
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
                                str = d.substring(1) + ek0Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = ek0Var.Z[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                            y20Var.setHintText((String) null);
                            y20Var.setHint(org.telegram.messenger.hd.M0(2131747372, null));
                            ek0Var.Z[0].setText(org.telegram.messenger.hd.M0(2131742859, null));
                        } else {
                            ek0Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str4 = (String) ek0Var.Y0.get(d);
                            if (str4 != null) {
                                y20Var.setHintText(str4.replace('X', (char) 8211));
                                y20Var.setHint((CharSequence) null);
                            }
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = ek0Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            y20Var.requestFocus();
                            y20Var.setText(str);
                            y20Var.setSelection(y20Var.length());
                        }
                    }
                    ek0Var.a1 = false;
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
