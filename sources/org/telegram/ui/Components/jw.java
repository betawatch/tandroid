package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jw implements View.OnFocusChangeListener {
    public final /* synthetic */ mz a;

    public jw(mz mzVar) {
        this.a = mzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            mz mzVar = this.a;
            mzVar.T0 = currentKeyboardLanguage;
            MediaDataController.getInstance(mzVar.Z0).fetchNewEmojiKeywords(mzVar.T0);
        }
    }
}
