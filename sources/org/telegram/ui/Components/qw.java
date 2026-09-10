package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qw implements View.OnFocusChangeListener {
    public final /* synthetic */ rz a;

    public qw(rz rzVar) {
        this.a = rzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            rz rzVar = this.a;
            rzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(rzVar.c1).fetchNewEmojiKeywords(rzVar.W0);
        }
    }
}
