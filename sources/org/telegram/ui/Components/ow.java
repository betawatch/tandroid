package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ow implements View.OnFocusChangeListener {
    public final /* synthetic */ nz a;

    public ow(nz nzVar) {
        this.a = nzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            nz nzVar = this.a;
            nzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(nzVar.c1).fetchNewEmojiKeywords(nzVar.W0);
        }
    }
}
