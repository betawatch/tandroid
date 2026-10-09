package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ax implements View.OnFocusChangeListener {
    public final /* synthetic */ a00 a;

    public ax(a00 a00Var) {
        this.a = a00Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            a00 a00Var = this.a;
            a00Var.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(a00Var.c1).fetchNewEmojiKeywords(a00Var.W0);
        }
    }
}
