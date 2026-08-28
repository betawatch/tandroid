package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qi implements TextWatcher {
    public final /* synthetic */ vi a;

    public qi(vi viVar) {
        this.a = viVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        vi viVar = this.a;
        li liVar = viVar.c0;
        TextUtils.isEmpty(viVar.A);
        viVar.A = editable.toString().trim();
        li liVar2 = viVar.U;
        AndroidUtilities.cancelRunOnUIThread(liVar2);
        if (!TextUtils.isEmpty(viVar.A)) {
            String str = viVar.A;
            viVar.T = str != null && str.length() >= 0;
            if (!TextUtils.equals(viVar.S, viVar.A)) {
                viVar.I.clear();
                viVar.V = 0;
                viVar.W = false;
            }
            AndroidUtilities.runOnUIThread(liVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(liVar);
        if (!TextUtils.isEmpty(viVar.A)) {
            String str2 = viVar.A;
            viVar.j0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(viVar.b.F1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(viVar.b0, viVar.A)) {
                viVar.J.clear();
                viVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(liVar, 1500L);
        }
        viVar.O();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
