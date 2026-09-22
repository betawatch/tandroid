package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ he(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
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
                n70 n70Var = (n70) this.e;
                n70 n70Var2 = (n70) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.n;
                n70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j3 = this.c;
                long j10 = this.d;
                boolean z10 = notificationsSettings.getBoolean(y0.i(j3, j10, sb2), true);
                notificationsSettings.edit().putBoolean(y0.i(j3, j10, new StringBuilder("sound_enabled_")), !z10).apply();
                n70Var2.u();
                if (org.telegram.ui.Components.vc.a(n2Var)) {
                    org.telegram.ui.Components.vc.S(z10 ? 1 : 0, n2Var, e6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ he(n70 n70Var, int i10, long j3, long j10, n70 n70Var2, bo boVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = n70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.f = n70Var2;
        this.h = boVar;
        this.n = e6Var;
    }
}
