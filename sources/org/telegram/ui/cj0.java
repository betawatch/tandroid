package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cj0(dk0 dk0Var, EditTextBoldCursor editTextBoldCursor, String str, int i7) {
        this.a = i7;
        this.d = dk0Var;
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
        int i7;
        int i10 = this.a;
        boolean z9 = true;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                dk0.N0((dk0) obj2, (EditTextBoldCursor) obj, this.c, editable, false);
                break;
            case 1:
                dk0 dk0Var = (dk0) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    if (i11 < editable.length()) {
                        char charAt = editable.charAt(i11);
                        if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                            i11++;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (z9 && !dk0Var.u0) {
                    editTextBoldCursor.setErrorText(org.telegram.messenger.id.M0(2131747449, null));
                    break;
                } else {
                    dk0Var.t0[intValue] = z9;
                    dk0.N0(dk0Var, editTextBoldCursor, this.c, editable, false);
                    break;
                }
                break;
            case 2:
                dk0.N0((dk0) obj2, (EditTextBoldCursor) obj, this.c, editable, false);
                break;
            default:
                sg.p pVar = (sg.p) obj2;
                sg.q qVar = pVar.f;
                EditTextBoldCursor editTextBoldCursor2 = pVar.d;
                if (!pVar.e && this.c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.c.toString(), editable.toString())) {
                    String obj3 = editable.toString();
                    if (obj3.length() > 8) {
                        editTextBoldCursor2.setText(obj3.substring(2, 8).toUpperCase());
                        editTextBoldCursor2.setSelection(8);
                        break;
                    } else if (((Pattern) obj).matcher(editable).find()) {
                        int length = obj3.length();
                        if (length != 3) {
                            if (length == 6) {
                                i7 = ((int) Long.parseLong(obj3, 16)) - 16777216;
                            } else if (length != 8) {
                                i7 = qVar.m1;
                            } else {
                                parseLong = Long.parseLong(obj3, 16);
                            }
                            if (i7 == qVar.m1) {
                                qVar.I0(i7, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj3.charAt(0) + obj3.charAt(0) + obj3.charAt(1) + obj3.charAt(1) + obj3.charAt(2) + obj3.charAt(2), 16);
                        }
                        i7 = (int) parseLong;
                        if (i7 == qVar.m1) {
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
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
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    public cj0(sg.p pVar) {
        this.a = 3;
        this.d = pVar;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
