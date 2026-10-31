package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jk0(ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.a = i10;
        this.d = ll0Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        int i10;
        int i11 = this.a;
        boolean z10 = true;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                ll0.M0((ll0) obj2, (EditTextBoldCursor) obj, this.c, editable, false);
                break;
            case 1:
                ll0 ll0Var = (ll0) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                int i12 = 0;
                while (true) {
                    if (i12 < editable.length()) {
                        char charAt = editable.charAt(i12);
                        if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                            i12++;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10 && !ll0Var.u0) {
                    editTextBoldCursor.setErrorText(org.telegram.messenger.cd.L0(2131747465, null));
                    break;
                } else {
                    ll0Var.t0[intValue] = z10;
                    ll0.M0(ll0Var, editTextBoldCursor, this.c, editable, false);
                    break;
                }
                break;
            case 2:
                ll0.M0((ll0) obj2, (EditTextBoldCursor) obj, this.c, editable, false);
                break;
            default:
                ig.t tVar = (ig.t) obj2;
                ig.u uVar = tVar.f;
                EditTextBoldCursor editTextBoldCursor2 = tVar.d;
                if (!tVar.e && this.c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.c.toString(), editable.toString())) {
                    String obj3 = editable.toString();
                    if (obj3.length() > 8) {
                        editTextBoldCursor2.setText(obj3.substring(2, 8).toUpperCase());
                        editTextBoldCursor2.setSelection(8);
                        break;
                    } else if (((Pattern) obj).matcher(editable).find()) {
                        int length = obj3.length();
                        if (length != 3) {
                            if (length == 6) {
                                i10 = ((int) Long.parseLong(obj3, 16)) - 16777216;
                            } else if (length != 8) {
                                i10 = uVar.m1;
                            } else {
                                parseLong = Long.parseLong(obj3, 16);
                            }
                            if (i10 == uVar.m1) {
                                uVar.I0(i10, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj3.charAt(0) + obj3.charAt(0) + obj3.charAt(1) + obj3.charAt(1) + obj3.charAt(2) + obj3.charAt(2), 16);
                        }
                        i10 = (int) parseLong;
                        if (i10 == uVar.m1) {
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                this.c = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public jk0(ig.t tVar) {
        this.a = 3;
        this.d = tVar;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
