package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f = updates_channeldifference;
        this.c = j3;
        this.h = chat;
        this.n = iVar;
        this.b = i10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f, this.c, (TLRPC.Chat) this.h, (a0.i) this.n, this.b, this.d);
                break;
            default:
                b80 b80Var = (b80) this.e;
                b80 b80Var2 = (b80) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.n;
                b80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j3 = this.c;
                long j10 = this.d;
                boolean z10 = notificationsSettings.getBoolean(q.i(j3, j10, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j3, j10, new StringBuilder("sound_enabled_")), !z10).apply();
                b80Var2.u();
                if (org.telegram.ui.Components.yc.a(n2Var)) {
                    org.telegram.ui.Components.yc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ge(b80 b80Var, int i10, long j3, long j10, b80 b80Var2, yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = b80Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.f = b80Var2;
        this.h = ynVar;
        this.n = d6Var;
    }
}
