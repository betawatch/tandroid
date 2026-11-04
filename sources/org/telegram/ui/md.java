package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        ci.s sVar = xdVar.P0;
        if (xdVar.M0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        xdVar.O0 = parseLong;
        long j10 = xdVar.E0.amount;
        if (parseLong > j10) {
            xdVar.O0 = j10;
            xdVar.M0 = true;
            sVar.setText(Long.toString(j10));
            sVar.setSelection(sVar.getText().length());
            xdVar.M0 = false;
        }
        xdVar.N0 = xdVar.O0 == xdVar.E0.amount;
        org.telegram.messenger.g0.r(ddVar);
        ddVar.run();
        xdVar.N0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
