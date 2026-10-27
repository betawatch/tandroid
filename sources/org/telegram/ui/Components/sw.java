package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sw implements View.OnFocusChangeListener {
    public final /* synthetic */ sz a;

    public sw(sz szVar) {
        this.a = szVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            sz szVar = this.a;
            szVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(szVar.c1).fetchNewEmojiKeywords(szVar.W0);
        }
    }
}
