package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class up implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ zp b;

    public up(zp zpVar, ChatThemeController chatThemeController) {
        this.b = zpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.a.getEmojiThemes(7);
        zp zpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.e3) zpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new sk(7, this, emojiThemes));
        zpVar.b0 = false;
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
