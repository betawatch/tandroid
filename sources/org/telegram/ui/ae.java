package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ae implements TextWatcher {
    public final /* synthetic */ ke a;

    public ae(ke keVar) {
        this.a = keVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ke keVar = this.a;
        nd ndVar = keVar.i1;
        gi.o oVar = keVar.Y0;
        if (keVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        keVar.X0 = parseLong;
        long j3 = keVar.N0.amount;
        if (parseLong > j3) {
            keVar.X0 = j3;
            keVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            keVar.V0 = false;
        }
        keVar.W0 = keVar.X0 == keVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(ndVar);
        ndVar.run();
        keVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
