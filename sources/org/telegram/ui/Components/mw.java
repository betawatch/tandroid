package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class mw implements View.OnFocusChangeListener {
    public final /* synthetic */ mz a;

    public mw(mz mzVar) {
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
