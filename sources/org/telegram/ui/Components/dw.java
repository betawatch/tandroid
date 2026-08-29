package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dw implements View.OnFocusChangeListener {
    public final /* synthetic */ fz a;

    public dw(fz fzVar) {
        this.a = fzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            fz fzVar = this.a;
            fzVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(fzVar.Y0).fetchNewEmojiKeywords(fzVar.S0);
        }
    }
}
