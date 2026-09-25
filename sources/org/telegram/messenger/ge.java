package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y70;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                y70 y70Var = (y70) this.e;
                y70 y70Var2 = (y70) this.f;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.n;
                y70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j3 = this.c;
                long j10 = this.d;
                boolean z10 = notificationsSettings.getBoolean(f0.i(j3, j10, sb2), true);
                notificationsSettings.edit().putBoolean(f0.i(j3, j10, new StringBuilder("sound_enabled_")), !z10).apply();
                y70Var2.u();
                if (org.telegram.ui.Components.xc.a(m2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ge(y70 y70Var, int i10, long j3, long j10, y70 y70Var2, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = y70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.f = y70Var2;
        this.h = wnVar;
        this.n = d6Var;
    }
}
