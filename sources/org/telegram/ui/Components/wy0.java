package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wy0 implements TextWatcher {
    public final /* synthetic */ NumberTextView a;
    public final /* synthetic */ vy0 b;

    public wy0(NumberTextView numberTextView, vy0 vy0Var) {
        this.a = numberTextView;
        this.b = vy0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.b.setErrorText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
