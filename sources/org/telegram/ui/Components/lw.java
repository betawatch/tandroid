package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class lw implements View.OnFocusChangeListener {
    public final /* synthetic */ kz a;

    public lw(kz kzVar) {
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
