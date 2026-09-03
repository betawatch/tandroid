package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class si implements TextWatcher {
    public final /* synthetic */ xi a;

    public si(xi xiVar) {
        this.a = xiVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xi xiVar = this.a;
        ni niVar = xiVar.d0;
        TextUtils.isEmpty(xiVar.B);
        xiVar.B = editable.toString().trim();
        ni niVar2 = xiVar.V;
        AndroidUtilities.cancelRunOnUIThread(niVar2);
        if (!TextUtils.isEmpty(xiVar.B)) {
            String str = xiVar.B;
            xiVar.U = str != null && str.length() >= 0;
            if (!TextUtils.equals(xiVar.T, xiVar.B)) {
                xiVar.J.clear();
                xiVar.W = 0;
                xiVar.a0 = false;
            }
            AndroidUtilities.runOnUIThread(niVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(niVar);
        if (!TextUtils.isEmpty(xiVar.B)) {
            String str2 = xiVar.B;
            xiVar.k0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(xiVar.b.G1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(xiVar.c0, xiVar.B)) {
                xiVar.K.clear();
                xiVar.e0 = false;
            }
            AndroidUtilities.runOnUIThread(niVar, 1500L);
        }
        xiVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
