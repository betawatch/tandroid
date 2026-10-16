package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
