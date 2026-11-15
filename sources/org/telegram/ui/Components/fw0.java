package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fw0 implements TextWatcher {
    public final /* synthetic */ NumberTextView a;
    public final /* synthetic */ ew0 b;

    public fw0(NumberTextView numberTextView, ew0 ew0Var) {
        this.a = numberTextView;
        this.b = ew0Var;
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
