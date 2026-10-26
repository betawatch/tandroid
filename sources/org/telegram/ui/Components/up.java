package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class up implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ yp b;

    public up(yp ypVar, ChatThemeController chatThemeController) {
        this.b = ypVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.h4> emojiThemes = this.a.getEmojiThemes(7);
        yp ypVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.k3) ypVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new so(1, this, emojiThemes));
        ypVar.a0 = false;
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
