package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o70;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                o70 o70Var = (o70) this.e;
                o70 o70Var2 = (o70) this.f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                o70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j10 = this.c;
                long j11 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j10, j11, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j10, j11, new StringBuilder("sound_enabled_")), !z4).apply();
                o70Var2.u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, f6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ le(o70 o70Var, int i10, long j10, long j11, o70 o70Var2, xn xnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = o70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = o70Var2;
        this.h = xnVar;
        this.n = f6Var;
    }
}
