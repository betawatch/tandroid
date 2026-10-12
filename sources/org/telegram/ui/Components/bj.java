package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bj implements TextWatcher {
    public final /* synthetic */ hj a;

    public bj(hj hjVar) {
        this.a = hjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hj hjVar = this.a;
        wi wiVar = hjVar.f0;
        TextUtils.isEmpty(hjVar.y);
        hjVar.y = editable.toString().trim();
        wi wiVar2 = hjVar.a0;
        AndroidUtilities.cancelRunOnUIThread(wiVar2);
        if (!TextUtils.isEmpty(hjVar.y)) {
            String str = hjVar.y;
            hjVar.W = str != null && str.length() >= 0;
            if (!TextUtils.equals(hjVar.V, hjVar.y)) {
                hjVar.L.clear();
                hjVar.b0 = 0;
                hjVar.c0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        if (!TextUtils.isEmpty(hjVar.y)) {
            String str2 = hjVar.y;
            hjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(hjVar.b.M1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(hjVar.e0, hjVar.y)) {
                hjVar.M.clear();
                hjVar.g0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar, 1500L);
        }
        hjVar.S();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
