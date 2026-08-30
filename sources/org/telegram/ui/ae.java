package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ae implements TextWatcher {
    public final /* synthetic */ ke a;

    public ae(ke keVar) {
        this.a = keVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ke keVar = this.a;
        od odVar = keVar.f1;
        lh.n nVar = keVar.V0;
        if (keVar.S0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        keVar.U0 = parseLong;
        long j10 = keVar.K0.amount;
        if (parseLong > j10) {
            keVar.U0 = j10;
            keVar.S0 = true;
            nVar.setText(Long.toString(j10));
            nVar.setSelection(nVar.getText().length());
            keVar.S0 = false;
        }
        keVar.T0 = keVar.U0 == keVar.K0.amount;
        AndroidUtilities.cancelRunOnUIThread(odVar);
        odVar.run();
        keVar.T0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
