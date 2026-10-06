package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class be implements TextWatcher {
    public final /* synthetic */ me a;

    public be(me meVar) {
        this.a = meVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        me meVar = this.a;
        qd qdVar = meVar.f1;
        fi.o oVar = meVar.O0;
        if (meVar.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        meVar.N0 = parseLong;
        long j3 = meVar.D0.amount;
        if (parseLong > j3) {
            meVar.N0 = j3;
            meVar.L0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            meVar.L0 = false;
        }
        meVar.M0 = meVar.N0 == meVar.D0.amount;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
