package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p70;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ le(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
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
                p70 p70Var = (p70) this.e;
                p70 p70Var2 = (p70) this.f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                p70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j10 = this.c;
                long j11 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j10, j11, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j10, j11, new StringBuilder("sound_enabled_")), !z4).apply();
                p70Var2.u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, f6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ le(p70 p70Var, int i10, long j10, long j11, p70 p70Var2, zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = p70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = p70Var2;
        this.h = znVar;
        this.n = f6Var;
    }
}
