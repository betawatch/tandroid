package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class bb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ bb(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
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
                ((MessagesController) this.e).lambda$getChannelDifference$347((TLRPC.updates_ChannelDifference) this.f, this.b, (TLRPC.Chat) this.h, (a0.h) this.n, this.d, this.c);
                break;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.b, this.c, this.d, (TLRPC.Message) this.f, (ArrayList) this.h, (MessageObject) this.n);
                break;
            default:
                l80 l80Var = (l80) this.e;
                l80 l80Var2 = (l80) this.f;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.h;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.n;
                l80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.b;
                long j11 = this.c;
                boolean z10 = notificationsSettings.getBoolean(t.j(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(t.j(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                l80Var2.u();
                if (org.telegram.ui.Components.wc.a(r2Var)) {
                    org.telegram.ui.Components.wc.T(z10 ? 1 : 0, r2Var, u6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bb(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = messageObject;
    }

    public /* synthetic */ bb(l80 l80Var, int i10, long j10, long j11, l80 l80Var2, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = l80Var;
        this.d = i10;
        this.b = j10;
        this.c = j11;
        this.f = l80Var2;
        this.h = wnVar;
        this.n = u6Var;
    }
}
