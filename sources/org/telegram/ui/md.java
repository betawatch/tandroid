package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class md implements TextWatcher {
    public final /* synthetic */ xd a;

    public md(xd xdVar) {
        this.a = xdVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xd xdVar = this.a;
        dd ddVar = xdVar.g1;
        di.q qVar = xdVar.P0;
        if (xdVar.M0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        xdVar.O0 = parseLong;
        long j3 = xdVar.E0.amount;
        if (parseLong > j3) {
            xdVar.O0 = j3;
            xdVar.M0 = true;
            qVar.setText(Long.toString(j3));
            qVar.setSelection(qVar.getText().length());
            xdVar.M0 = false;
        }
        xdVar.N0 = xdVar.O0 == xdVar.E0.amount;
        org.telegram.messenger.g0.r(ddVar);
        ddVar.run();
        xdVar.N0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
