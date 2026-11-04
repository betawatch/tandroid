package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d20 implements TextWatcher {
    public final /* synthetic */ x30 a;

    public d20(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        x30 x30Var = this.a;
        x30Var.s5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i3 = x30Var.V1;
        if (codePointCount + 25 > i3) {
            str = "" + (i3 - codePointCount);
        } else {
            str = null;
        }
        x30Var.E1.a();
        x30Var.E1.setText(str);
        x30Var.E1.setTextColor(codePointCount >= i3 ? -1280137 : -1);
        if (codePointCount > i3) {
            org.telegram.messenger.p2.E.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
