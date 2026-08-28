package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yo implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ cp b;

    public yo(cp cpVar, ChatThemeController chatThemeController) {
        this.b = cpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i9;
        ChatThemeController chatThemeController = this.a;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
        cp cpVar = this.b;
        i9 = ((org.telegram.ui.ActionBar.f3) cpVar).currentAccount;
        NotificationCenter.getInstance(i9).doOnIdle(new org.telegram.ui.wq(28, this, emojiThemes));
        cpVar.X = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
