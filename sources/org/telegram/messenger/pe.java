package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pe(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
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
                w70 w70Var = (w70) this.e;
                w70 w70Var2 = (w70) this.f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                w70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j3 = this.c;
                long j10 = this.d;
                boolean z10 = notificationsSettings.getBoolean(a2.i(j3, j10, sb2), true);
                notificationsSettings.edit().putBoolean(a2.i(j3, j10, new StringBuilder("sound_enabled_")), !z10).apply();
                w70Var2.u();
                if (org.telegram.ui.Components.wc.a(p2Var)) {
                    org.telegram.ui.Components.wc.S(z10 ? 1 : 0, p2Var, f6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pe(w70 w70Var, int i10, long j3, long j10, w70 w70Var2, eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = w70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.f = w70Var2;
        this.h = eoVar;
        this.n = f6Var;
    }
}
