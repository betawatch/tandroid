package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cw0 implements TextWatcher {
    public final /* synthetic */ NumberTextView a;
    public final /* synthetic */ bw0 b;

    public cw0(NumberTextView numberTextView, bw0 bw0Var) {
        this.a = numberTextView;
        this.b = bw0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.b.setErrorText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
