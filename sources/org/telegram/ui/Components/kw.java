package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
