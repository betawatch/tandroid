package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xv implements View.OnFocusChangeListener {
    public final /* synthetic */ wy a;

    public xv(wy wyVar) {
        this.a = wyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            wy wyVar = this.a;
            wyVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(wyVar.Y0).fetchNewEmojiKeywords(wyVar.S0);
        }
    }
}
