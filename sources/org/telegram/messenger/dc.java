package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ dc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
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
                i80 i80Var = (i80) this.e;
                i80 i80Var2 = (i80) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.n;
                i80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.b;
                long j11 = this.c;
                boolean z10 = notificationsSettings.getBoolean(g0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(g0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                i80Var2.u();
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dc(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = messageObject;
    }

    public /* synthetic */ dc(i80 i80Var, int i10, long j10, long j11, i80 i80Var2, qn qnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i80Var;
        this.d = i10;
        this.b = j10;
        this.c = j11;
        this.f = i80Var2;
        this.h = qnVar;
        this.n = d6Var;
    }
}
