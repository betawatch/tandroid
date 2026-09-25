package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lw implements View.OnFocusChangeListener {
    public final /* synthetic */ lz a;

    public lw(lz lzVar) {
        this.a = lzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            lz lzVar = this.a;
            lzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(lzVar.c1).fetchNewEmojiKeywords(lzVar.W0);
        }
    }
}
