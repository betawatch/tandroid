package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ij0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ ij0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i3 = this.a;
        yj0 yj0Var = this.b;
        switch (i3) {
            case 0:
                if (!yj0Var.a1 && yj0Var.U0 != 0 && yj0Var.Z[0].length() == yj0Var.U0) {
                    yj0Var.M.callOnClick();
                    break;
                }
                break;
            default:
                ArrayList arrayList = yj0Var.V0;
                HashMap hashMap = yj0Var.X0;
                if (!yj0Var.a1) {
                    yj0Var.a1 = true;
                    String d = mf.b.d(yj0Var.Z[1].getText().toString(), false);
                    yj0Var.Z[1].setText(d);
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) yj0Var.Z[2];
                    if (d.length() == 0) {
                        r20Var.setHintText((String) null);
                        r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                        yj0Var.Z[0].setText(org.telegram.messenger.bd.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str2 = d.substring(i10) + yj0Var.Z[2].getText().toString();
                                        yj0Var.Z[1].setText(substring);
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
                                str = d.substring(1) + yj0Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = yj0Var.Z[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                            r20Var.setHintText((String) null);
                            r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                            yj0Var.Z[0].setText(org.telegram.messenger.bd.M0(2131742869, null));
                        } else {
                            yj0Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str4 = (String) yj0Var.Y0.get(d);
                            if (str4 != null) {
                                r20Var.setHintText(str4.replace('X', (char) 8211));
                                r20Var.setHint((CharSequence) null);
                            }
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            r20Var.requestFocus();
                            r20Var.setText(str);
                            r20Var.setSelection(r20Var.length());
                        }
                    }
                    yj0Var.a1 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
