package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
