package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class od implements TextWatcher {
    public final /* synthetic */ zd a;

    public od(zd zdVar) {
        this.a = zdVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        zd zdVar = this.a;
        ed edVar = zdVar.f1;
        bi.v vVar = zdVar.O0;
        if (zdVar.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        zdVar.N0 = parseLong;
        long j3 = zdVar.D0.amount;
        if (parseLong > j3) {
            zdVar.N0 = j3;
            zdVar.L0 = true;
            vVar.setText(Long.toString(j3));
            vVar.setSelection(vVar.getText().length());
            zdVar.L0 = false;
        }
        zdVar.M0 = zdVar.N0 == zdVar.D0.amount;
        org.telegram.messenger.g0.r(edVar);
        edVar.run();
        zdVar.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
