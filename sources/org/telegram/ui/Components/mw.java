package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mw implements View.OnFocusChangeListener {
    public final /* synthetic */ lz a;

    public mw(lz lzVar) {
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
