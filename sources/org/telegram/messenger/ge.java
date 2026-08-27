package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public /* synthetic */ ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f = updates_channeldifference;
        this.c = j10;
        this.h = chat;
        this.n = hVar;
        this.b = i10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f, this.c, (TLRPC.Chat) this.h, (a0.h) this.n, this.b, this.d);
                break;
            default:
                b70 b70Var = (b70) this.e;
                b70 b70Var2 = (b70) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.n;
                b70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(y1.j(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(y1.j(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                b70Var2.u();
                if (org.telegram.ui.Components.mc.a(n2Var)) {
                    org.telegram.ui.Components.mc.S(z10 ? 1 : 0, n2Var, c6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ge(b70 b70Var, int i10, long j10, long j11, b70 b70Var2, rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = b70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = b70Var2;
        this.h = rnVar;
        this.n = c6Var;
    }
}
