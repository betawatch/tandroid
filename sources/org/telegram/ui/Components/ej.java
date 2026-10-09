package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ej implements TextWatcher {
    public final /* synthetic */ kj a;

    public ej(kj kjVar) {
        this.a = kjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        kj kjVar = this.a;
        zi ziVar = kjVar.f0;
        TextUtils.isEmpty(kjVar.y);
        kjVar.y = editable.toString().trim();
        zi ziVar2 = kjVar.a0;
        AndroidUtilities.cancelRunOnUIThread(ziVar2);
        if (!TextUtils.isEmpty(kjVar.y)) {
            String str = kjVar.y;
            kjVar.W = str != null && str.length() >= 0;
            if (!TextUtils.equals(kjVar.V, kjVar.y)) {
                kjVar.L.clear();
                kjVar.b0 = 0;
                kjVar.c0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(ziVar);
        if (!TextUtils.isEmpty(kjVar.y)) {
            String str2 = kjVar.y;
            kjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(kjVar.b.M1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(kjVar.e0, kjVar.y)) {
                kjVar.M.clear();
                kjVar.g0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar, 1500L);
        }
        kjVar.S();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
