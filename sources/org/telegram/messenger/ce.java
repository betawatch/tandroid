package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ce(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i9, long j11) {
        this.e = messagesController;
        this.f = updates_channeldifference;
        this.c = j10;
        this.h = chat;
        this.n = hVar;
        this.b = i9;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f, this.c, (TLRPC.Chat) this.h, (a0.h) this.n, this.b, this.d);
                break;
            default:
                x60 x60Var = (x60) this.e;
                x60 x60Var2 = (x60) this.f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.n;
                x60Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(l0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(l0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                x60Var2.u();
                if (org.telegram.ui.Components.oc.a(o2Var)) {
                    org.telegram.ui.Components.oc.S(z10 ? 1 : 0, o2Var, b6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ce(x60 x60Var, int i9, long j10, long j11, x60 x60Var2, qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = x60Var;
        this.b = i9;
        this.c = j10;
        this.d = j11;
        this.f = x60Var2;
        this.h = qnVar;
        this.n = b6Var;
    }
}
