package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
