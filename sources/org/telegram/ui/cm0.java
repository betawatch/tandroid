package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cm0(gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.a = i10;
        this.d = gn0Var;
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
        switch (this.a) {
            case 0:
                gn0.J0((gn0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            case 1:
                gn0.J0((gn0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            default:
                pg.w wVar = (pg.w) this.d;
                pg.x xVar = wVar.f;
                EditTextBoldCursor editTextBoldCursor = wVar.d;
                if (!wVar.e && this.c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.c.toString(), editable.toString())) {
                    String obj = editable.toString();
                    if (obj.length() > 8) {
                        editTextBoldCursor.setText(obj.substring(2, 8).toUpperCase());
                        editTextBoldCursor.setSelection(8);
                        break;
                    } else if (((Pattern) this.b).matcher(editable).find()) {
                        int length = obj.length();
                        if (length != 3) {
                            if (length == 6) {
                                i10 = ((int) Long.parseLong(obj, 16)) - 16777216;
                            } else if (length != 8) {
                                i10 = xVar.f;
                            } else {
                                parseLong = Long.parseLong(obj, 16);
                            }
                            if (i10 == xVar.f) {
                                xVar.m(i10, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj.charAt(0) + obj.charAt(0) + obj.charAt(1) + obj.charAt(1) + obj.charAt(2) + obj.charAt(2), 16);
                        }
                        i10 = (int) parseLong;
                        if (i10 == xVar.f) {
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

    public cm0(pg.w wVar) {
        this.a = 2;
        this.d = wVar;
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
}
