package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class be implements TextWatcher {
    public final /* synthetic */ me a;

    public be(me meVar) {
        this.a = meVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        me meVar = this.a;
        qd qdVar = meVar.i2;
        fi.o oVar = meVar.R1;
        if (meVar.O1) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        meVar.Q1 = parseLong;
        long j3 = meVar.G1.amount;
        if (parseLong > j3) {
            meVar.Q1 = j3;
            meVar.O1 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            meVar.O1 = false;
        }
        meVar.P1 = meVar.Q1 == meVar.G1.amount;
        AndroidUtilities.cancelRunOnUIThread(qdVar);
        qdVar.run();
        meVar.P1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
