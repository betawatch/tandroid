package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zi implements TextWatcher {
    public final /* synthetic */ fj a;

    public zi(fj fjVar) {
        this.a = fjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        fj fjVar = this.a;
        ui uiVar = fjVar.f0;
        TextUtils.isEmpty(fjVar.y);
        fjVar.y = editable.toString().trim();
        ui uiVar2 = fjVar.a0;
        AndroidUtilities.cancelRunOnUIThread(uiVar2);
        if (!TextUtils.isEmpty(fjVar.y)) {
            String str = fjVar.y;
            fjVar.W = str != null && str.length() >= 0;
            if (!TextUtils.equals(fjVar.V, fjVar.y)) {
                fjVar.L.clear();
                fjVar.b0 = 0;
                fjVar.c0 = false;
            }
            AndroidUtilities.runOnUIThread(uiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(uiVar);
        if (!TextUtils.isEmpty(fjVar.y)) {
            String str2 = fjVar.y;
            fjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(fjVar.b.M1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(fjVar.e0, fjVar.y)) {
                fjVar.M.clear();
                fjVar.g0 = false;
            }
            AndroidUtilities.runOnUIThread(uiVar, 1500L);
        }
        fjVar.S();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
