package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class sw implements View.OnFocusChangeListener {
    public final /* synthetic */ tz a;

    public sw(tz tzVar) {
        this.a = tzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            tz tzVar = this.a;
            tzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(tzVar.c1).fetchNewEmojiKeywords(tzVar.W0);
        }
    }
}
