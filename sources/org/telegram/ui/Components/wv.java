package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wv implements View.OnFocusChangeListener {
    public final /* synthetic */ yy a;

    public wv(yy yyVar) {
        this.a = yyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            yy yyVar = this.a;
            yyVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(yyVar.Y0).fetchNewEmojiKeywords(yyVar.S0);
        }
    }
}
