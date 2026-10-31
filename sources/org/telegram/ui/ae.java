package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ae implements TextWatcher {
    public final /* synthetic */ le a;

    public ae(le leVar) {
        this.a = leVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        le leVar = this.a;
        nd ndVar = leVar.f1;
        zd zdVar = leVar.O0;
        if (leVar.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        leVar.N0 = parseLong;
        long j10 = leVar.D0.amount;
        if (parseLong > j10) {
            leVar.N0 = j10;
            leVar.L0 = true;
            zdVar.setText(Long.toString(j10));
            zdVar.setSelection(zdVar.getText().length());
            leVar.L0 = false;
        }
        leVar.M0 = leVar.N0 == leVar.D0.amount;
        org.telegram.messenger.i0.r(ndVar);
        ndVar.run();
        leVar.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
