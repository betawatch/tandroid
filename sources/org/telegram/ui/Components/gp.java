package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ lp b;

    public gp(lp lpVar, ChatThemeController chatThemeController) {
        this.b = lpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.d4> emojiThemes = this.a.getEmojiThemes(7);
        lp lpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.f3) lpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new uc(21, this, emojiThemes));
        lpVar.b0 = false;
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
