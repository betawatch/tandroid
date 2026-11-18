package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wk implements TextWatcher {
    public boolean a;
    public final /* synthetic */ TextView b;

    public wk(kg.a1 a1Var, TextView textView) {
        this.b = textView;
        this.a = TextUtils.isEmpty(a1Var.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.a) {
            this.a = isEmpty;
            this.b.setText(org.telegram.messenger.gd.M0(isEmpty ? 2131746126 : 2131754484, null));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
