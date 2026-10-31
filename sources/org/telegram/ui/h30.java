package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h30 implements TextWatcher {
    public final /* synthetic */ b50 a;

    public h30(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        b50 b50Var = this.a;
        b50Var.r5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = b50Var.U1;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        b50Var.D1.a();
        b50Var.D1.setText(str);
        b50Var.D1.setTextColor(codePointCount >= i10 ? -1280137 : -1);
        if (codePointCount > i10) {
            org.telegram.messenger.t2.D.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
