package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pk implements TextWatcher {
    public boolean a;
    public final /* synthetic */ TextView b;

    public pk(kg.x0 x0Var, TextView textView) {
        this.b = textView;
        this.a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.a) {
            this.a = isEmpty;
            this.b.setText(org.telegram.messenger.hd.M0(isEmpty ? 2131746321 : 2131754486, null));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
