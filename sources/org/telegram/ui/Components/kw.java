package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kw implements View.OnFocusChangeListener {
    public final /* synthetic */ kz a;

    public kw(kz kzVar) {
        this.a = kzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            kz kzVar = this.a;
            kzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(kzVar.c1).fetchNewEmojiKeywords(kzVar.W0);
        }
    }
}
