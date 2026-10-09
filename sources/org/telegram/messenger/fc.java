package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ fc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f = updates_channeldifference;
        this.b = j3;
        this.h = chat;
        this.n = iVar;
        this.d = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f, this.b, (TLRPC.Chat) this.h, (a0.i) this.n, this.d, this.c);
                break;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.b, this.c, this.d, (TLRPC.Message) this.f, (ArrayList) this.h, (MessageObject) this.n);
                break;
            default:
                p80 p80Var = (p80) this.e;
                p80 p80Var2 = (p80) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.n;
                p80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j3 = this.b;
                long j10 = this.c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j3, j10, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j3, j10, new StringBuilder("sound_enabled_")), !z10).apply();
                p80Var2.u();
                if (org.telegram.ui.Components.ad.a(n2Var)) {
                    org.telegram.ui.Components.ad.S(z10 ? 1 : 0, n2Var, e6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fc(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.b = j3;
        this.c = j10;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = messageObject;
    }

    public /* synthetic */ fc(p80 p80Var, int i10, long j3, long j10, p80 p80Var2, zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = p80Var;
        this.d = i10;
        this.b = j3;
        this.c = j10;
        this.f = p80Var2;
        this.h = znVar;
        this.n = e6Var;
    }
}
