package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hk implements TextWatcher {
    public boolean a;
    public final /* synthetic */ TextView b;

    public hk(kg.x0 x0Var, TextView textView) {
        this.b = textView;
        this.a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.a) {
            this.a = isEmpty;
            this.b.setText(org.telegram.messenger.id.M0(isEmpty ? 2131746322 : 2131754486, null));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
