package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class be implements TextWatcher {
    public final /* synthetic */ le a;

    public be(le leVar) {
        this.a = leVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        le leVar = this.a;
        od odVar = leVar.i1;
        ei.o oVar = leVar.Y0;
        if (leVar.V0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        leVar.X0 = parseLong;
        long j3 = leVar.N0.amount;
        if (parseLong > j3) {
            leVar.X0 = j3;
            leVar.V0 = true;
            oVar.setText(Long.toString(j3));
            oVar.setSelection(oVar.getText().length());
            leVar.V0 = false;
        }
        leVar.W0 = leVar.X0 == leVar.N0.amount;
        AndroidUtilities.cancelRunOnUIThread(odVar);
        odVar.run();
        leVar.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
