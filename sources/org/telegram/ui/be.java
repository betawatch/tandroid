package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        fi.o oVar = leVar.Y0;
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
