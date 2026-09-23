package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cj implements TextWatcher {
    public final /* synthetic */ hj a;

    public cj(hj hjVar) {
        this.a = hjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hj hjVar = this.a;
        xi xiVar = hjVar.g0;
        TextUtils.isEmpty(hjVar.E);
        hjVar.E = editable.toString().trim();
        xi xiVar2 = hjVar.b0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        if (!TextUtils.isEmpty(hjVar.E)) {
            String str = hjVar.E;
            hjVar.a0 = str != null && str.length() >= 0;
            if (!TextUtils.equals(hjVar.W, hjVar.E)) {
                hjVar.M.clear();
                hjVar.c0 = 0;
                hjVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(hjVar.E)) {
            String str2 = hjVar.E;
            hjVar.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(hjVar.b.J1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(hjVar.f0, hjVar.E)) {
                hjVar.N.clear();
                hjVar.h0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar, 1500L);
        }
        hjVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
