package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nw implements View.OnFocusChangeListener {
    public final /* synthetic */ mz a;

    public nw(mz mzVar) {
        this.a = mzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            mz mzVar = this.a;
            mzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(mzVar.c1).fetchNewEmojiKeywords(mzVar.W0);
        }
    }
}
