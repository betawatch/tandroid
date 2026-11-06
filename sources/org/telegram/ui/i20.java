package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i20 implements TextWatcher {
    public final /* synthetic */ c40 a;

    public i20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        c40 c40Var = this.a;
        c40Var.r5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i7 = c40Var.U1;
        if (codePointCount + 25 > i7) {
            str = "" + (i7 - codePointCount);
        } else {
            str = null;
        }
        c40Var.D1.a();
        c40Var.D1.setText(str);
        c40Var.D1.setTextColor(codePointCount >= i7 ? -1280137 : -1);
        if (codePointCount > i7) {
            org.telegram.messenger.p2.D.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
