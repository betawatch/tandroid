package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hw implements View.OnFocusChangeListener {
    public final /* synthetic */ kz a;

    public hw(kz kzVar) {
        this.a = kzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            kz kzVar = this.a;
            kzVar.T0 = currentKeyboardLanguage;
            MediaDataController.getInstance(kzVar.Z0).fetchNewEmojiKeywords(kzVar.T0);
        }
    }
}
