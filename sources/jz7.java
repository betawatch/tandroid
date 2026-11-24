// default package

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jz7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz7 b;

    public /* synthetic */ jz7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        int indexOf;
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                if (!xz7Var.a1 && xz7Var.U0 != 0 && xz7Var.Z[0].length() == xz7Var.U0) {
                    xz7Var.M.callOnClick();
                    break;
                }
                break;
            default:
                ArrayList arrayList = xz7Var.V0;
                HashMap hashMap = xz7Var.X0;
                if (!xz7Var.a1) {
                    xz7Var.a1 = true;
                    String h = r58.h(xz7Var.Z[1].getText().toString(), false);
                    xz7Var.Z[1].setText(h);
                    dg5 dg5Var = (dg5) xz7Var.Z[2];
                    if (h.length() == 0) {
                        dg5Var.setHintText((String) null);
                        dg5Var.setHint(jb6.M0(2131747105, null));
                        xz7Var.Z[0].setText(jb6.M0(2131752071, null));
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= 1) {
                                    String substring = h.substring(0, i);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str2 = h.substring(i) + xz7Var.Z[2].getText().toString();
                                        xz7Var.Z[1].setText(substring);
                                        str = str2;
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
                                str = h.substring(1) + xz7Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = xz7Var.Z[1];
                                h = h.substring(0, 1);
                                editTextBoldCursor.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(h);
                        if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                            dg5Var.setHintText((String) null);
                            dg5Var.setHint(jb6.M0(2131747105, null));
                            xz7Var.Z[0].setText(jb6.M0(2131742522, null));
                        } else {
                            xz7Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str4 = (String) xz7Var.Y0.get(h);
                            if (str4 != null) {
                                dg5Var.setHintText(str4.replace('X', (char) 8211));
                                dg5Var.setHint((CharSequence) null);
                            }
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = xz7Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            dg5Var.requestFocus();
                            dg5Var.setText(str);
                            dg5Var.setSelection(dg5Var.length());
                        }
                    }
                    xz7Var.a1 = false;
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
