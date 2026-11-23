package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l20 implements TextWatcher {
    public final /* synthetic */ f40 a;

    public l20(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        f40 f40Var = this.a;
        f40Var.z5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i7 = f40Var.Y1;
        if (codePointCount + 25 > i7) {
            str = "" + (i7 - codePointCount);
        } else {
            str = null;
        }
        f40Var.H1.a();
        f40Var.H1.setText(str);
        f40Var.H1.setTextColor(codePointCount >= i7 ? -1280137 : -1);
        if (codePointCount > i7) {
            org.telegram.messenger.q2.E.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
