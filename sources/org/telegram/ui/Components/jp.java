package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ np b;

    public jp(np npVar, ChatThemeController chatThemeController) {
        this.b = npVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        ChatThemeController chatThemeController = this.a;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes((chatThemeController.isGiftThemesFullyLoaded() ? 2 : 0) | 5);
        np npVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.e3) npVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new kd(21, this, emojiThemes));
        npVar.b0 = false;
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
