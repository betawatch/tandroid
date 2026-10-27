package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ zp b;

    public vp(zp zpVar, ChatThemeController chatThemeController) {
        this.b = zpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.h4> emojiThemes = this.a.getEmojiThemes(7);
        zp zpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.k3) zpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new so(1, this, emojiThemes));
        zpVar.a0 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
