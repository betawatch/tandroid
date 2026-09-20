package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ip implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ mp b;

    public ip(mp mpVar, ChatThemeController chatThemeController) {
        this.b = mpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        ChatThemeController chatThemeController = this.a;
        List<org.telegram.ui.ActionBar.d4> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
        mp mpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.f3) mpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new tc(22, this, emojiThemes));
        mpVar.b0 = false;
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
