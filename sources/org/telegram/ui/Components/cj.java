package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class cj implements TextWatcher {
    public final /* synthetic */ ij a;

    public cj(ij ijVar) {
        this.a = ijVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ij ijVar = this.a;
        xi xiVar = ijVar.f0;
        TextUtils.isEmpty(ijVar.y);
        ijVar.y = editable.toString().trim();
        xi xiVar2 = ijVar.a0;
        AndroidUtilities.cancelRunOnUIThread(xiVar2);
        if (!TextUtils.isEmpty(ijVar.y)) {
            String str = ijVar.y;
            ijVar.W = str != null && str.length() >= 0;
            if (!TextUtils.equals(ijVar.V, ijVar.y)) {
                ijVar.L.clear();
                ijVar.b0 = 0;
                ijVar.c0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(xiVar);
        if (!TextUtils.isEmpty(ijVar.y)) {
            String str2 = ijVar.y;
            ijVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(ijVar.b.J1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(ijVar.e0, ijVar.y)) {
                ijVar.M.clear();
                ijVar.g0 = false;
            }
            AndroidUtilities.runOnUIThread(xiVar, 1500L);
        }
        ijVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
