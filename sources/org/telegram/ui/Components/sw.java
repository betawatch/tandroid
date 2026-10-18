package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
