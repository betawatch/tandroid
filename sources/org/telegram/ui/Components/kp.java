package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class kp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ op b;

    public kp(op opVar, ChatThemeController chatThemeController) {
        this.b = opVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        ChatThemeController chatThemeController = this.a;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
        op opVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.e3) opVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new uc(22, this, emojiThemes));
        opVar.b0 = false;
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
