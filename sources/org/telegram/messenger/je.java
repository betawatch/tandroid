package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ je(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
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
                j70 j70Var = (j70) this.e;
                j70 j70Var2 = (j70) this.f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.n;
                j70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(x3.j(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(x3.j(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                j70Var2.u();
                if (org.telegram.ui.Components.tc.a(o2Var)) {
                    org.telegram.ui.Components.tc.S(z10 ? 1 : 0, o2Var, c6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ je(j70 j70Var, int i10, long j10, long j11, j70 j70Var2, tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = j70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.f = j70Var2;
        this.h = tnVar;
        this.n = c6Var;
    }
}
