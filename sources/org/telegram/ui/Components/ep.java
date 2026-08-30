package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ep implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ kp b;

    public ep(kp kpVar, ChatThemeController chatThemeController) {
        this.b = kpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.e4> emojiThemes = this.a.getEmojiThemes(7);
        kp kpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.g3) kpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new il(3, this, emojiThemes));
        kpVar.Y = false;
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
