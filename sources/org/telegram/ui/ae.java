package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ae implements TextWatcher {
    public final /* synthetic */ ke a;

    public ae(ke keVar) {
        this.a = keVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ke keVar = this.a;
        pd pdVar = keVar.i1;
        ai.t tVar = keVar.Y0;
        if (keVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        keVar.X0 = parseLong;
        long j10 = keVar.N0.amount;
        if (parseLong > j10) {
            keVar.X0 = j10;
            keVar.V0 = true;
            tVar.setText(Long.toString(j10));
            tVar.setSelection(tVar.getText().length());
            keVar.V0 = false;
        }
        keVar.W0 = keVar.X0 == keVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(pdVar);
        pdVar.run();
        keVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
