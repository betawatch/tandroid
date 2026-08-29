package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ti implements TextWatcher {
    public final /* synthetic */ yi a;

    public ti(yi yiVar) {
        this.a = yiVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        yi yiVar = this.a;
        oi oiVar = yiVar.c0;
        TextUtils.isEmpty(yiVar.A);
        yiVar.A = editable.toString().trim();
        oi oiVar2 = yiVar.U;
        AndroidUtilities.cancelRunOnUIThread(oiVar2);
        if (!TextUtils.isEmpty(yiVar.A)) {
            String str = yiVar.A;
            yiVar.T = str != null && str.length() >= 0;
            if (!TextUtils.equals(yiVar.S, yiVar.A)) {
                yiVar.I.clear();
                yiVar.V = 0;
                yiVar.W = false;
            }
            AndroidUtilities.runOnUIThread(oiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(oiVar);
        if (!TextUtils.isEmpty(yiVar.A)) {
            String str2 = yiVar.A;
            yiVar.j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(yiVar.b.F1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(yiVar.b0, yiVar.A)) {
                yiVar.J.clear();
                yiVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(oiVar, 1500L);
        }
        yiVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
