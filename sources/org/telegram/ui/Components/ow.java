package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ow implements View.OnFocusChangeListener {
    public final /* synthetic */ nz a;

    public ow(nz nzVar) {
        this.a = nzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            nz nzVar = this.a;
            nzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(nzVar.c1).fetchNewEmojiKeywords(nzVar.W0);
        }
    }
}
