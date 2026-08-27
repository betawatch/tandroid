package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mi implements TextWatcher {
    public final /* synthetic */ ri a;

    public mi(ri riVar) {
        this.a = riVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ri riVar = this.a;
        hi hiVar = riVar.c0;
        TextUtils.isEmpty(riVar.A);
        riVar.A = editable.toString().trim();
        hi hiVar2 = riVar.U;
        AndroidUtilities.cancelRunOnUIThread(hiVar2);
        if (!TextUtils.isEmpty(riVar.A)) {
            String str = riVar.A;
            riVar.T = str != null && str.length() >= 0;
            if (!TextUtils.equals(riVar.S, riVar.A)) {
                riVar.I.clear();
                riVar.V = 0;
                riVar.W = false;
            }
            AndroidUtilities.runOnUIThread(hiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(hiVar);
        if (!TextUtils.isEmpty(riVar.A)) {
            String str2 = riVar.A;
            riVar.j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(riVar.b.F1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(riVar.b0, riVar.A)) {
                riVar.J.clear();
                riVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(hiVar, 1500L);
        }
        riVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
