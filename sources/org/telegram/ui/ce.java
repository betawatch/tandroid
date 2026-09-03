package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ce implements TextWatcher {
    public final /* synthetic */ me a;

    public ce(me meVar) {
        this.a = meVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        me meVar = this.a;
        qd qdVar = meVar.f1;
        lh.n nVar = meVar.V0;
        if (meVar.S0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        meVar.U0 = parseLong;
        long j10 = meVar.K0.amount;
        if (parseLong > j10) {
            meVar.U0 = j10;
            meVar.S0 = true;
            nVar.setText(Long.toString(j10));
            nVar.setSelection(nVar.getText().length());
            meVar.S0 = false;
        }
        meVar.T0 = meVar.U0 == meVar.K0.amount;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.T0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
