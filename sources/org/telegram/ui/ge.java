package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ge implements TextWatcher {
    public final /* synthetic */ qe a;

    public ge(qe qeVar) {
        this.a = qeVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        qe qeVar = this.a;
        td tdVar = qeVar.i1;
        gi.o oVar = qeVar.Y0;
        if (qeVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        qeVar.X0 = parseLong;
        long j10 = qeVar.N0.amount;
        if (parseLong > j10) {
            qeVar.X0 = j10;
            qeVar.V0 = true;
            oVar.setText(Long.toString(j10));
            oVar.setSelection(oVar.getText().length());
            qeVar.V0 = false;
        }
        qeVar.W0 = qeVar.X0 == qeVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(tdVar);
        tdVar.run();
        qeVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
