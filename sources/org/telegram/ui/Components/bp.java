package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ gp b;

    public bp(gp gpVar, ChatThemeController chatThemeController) {
        this.b = gpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.a.getEmojiThemes(7);
        gp gpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.f3) gpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new z2(24, this, emojiThemes));
        gpVar.X = false;
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
