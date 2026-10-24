package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class sp implements ResultCallback {
    public final /* synthetic */ ChatThemeController a;
    public final /* synthetic */ wp b;

    public sp(wp wpVar, ChatThemeController chatThemeController) {
        this.b = wpVar;
        this.a = chatThemeController;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        int i10;
        List<org.telegram.ui.ActionBar.f4> emojiThemes = this.a.getEmojiThemes(7);
        wp wpVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.h3) wpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ee(21, this, emojiThemes));
        wpVar.a0 = false;
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
