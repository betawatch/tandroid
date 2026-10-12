package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ww implements View.OnFocusChangeListener {
    public final /* synthetic */ wz a;

    public ww(wz wzVar) {
        this.a = wzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            wz wzVar = this.a;
            wzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(wzVar.c1).fetchNewEmojiKeywords(wzVar.W0);
        }
    }
}
