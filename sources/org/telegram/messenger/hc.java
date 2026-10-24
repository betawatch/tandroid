package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ hc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f = updates_channeldifference;
        this.b = j10;
        this.h = chat;
        this.n = hVar;
        this.d = i10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f, this.b, (TLRPC.Chat) this.h, (a0.h) this.n, this.d, this.c);
                break;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.b, this.c, this.d, (TLRPC.Message) this.f, (ArrayList) this.h, (MessageObject) this.n);
                break;
            default:
                j80 j80Var = (j80) this.e;
                j80 j80Var2 = (j80) this.f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.n;
                j80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.b;
                long j11 = this.c;
                boolean z10 = notificationsSettings.getBoolean(v0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(v0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                j80Var2.u();
                if (org.telegram.ui.Components.xc.a(o2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, o2Var, g6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hc(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = messageObject;
    }

    public /* synthetic */ hc(j80 j80Var, int i10, long j10, long j11, j80 j80Var2, sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = j80Var;
        this.d = i10;
        this.b = j10;
        this.c = j11;
        this.f = j80Var2;
        this.h = snVar;
        this.n = g6Var;
    }
}
