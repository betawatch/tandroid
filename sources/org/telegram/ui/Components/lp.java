package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ pp b;

    public lp(pp ppVar, ChatThemeController chatThemeController) {
        this.b = ppVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        ChatThemeController chatThemeController = this.a;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
        pp ppVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.f3) ppVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new be(19, this, emojiThemes));
        ppVar.b0 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
