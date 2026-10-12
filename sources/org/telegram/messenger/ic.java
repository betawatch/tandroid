package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ic(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
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
                m80 m80Var = (m80) this.e;
                m80 m80Var2 = (m80) this.f;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.n;
                m80Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.b;
                long j11 = this.c;
                boolean z10 = notificationsSettings.getBoolean(q.j(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.j(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                m80Var2.u();
                if (org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.S(z10 ? 1 : 0, m2Var, c6Var).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ic(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.b = j10;
        this.c = j11;
        this.d = i10;
        this.f = message;
        this.h = arrayList;
        this.n = messageObject;
    }

    public /* synthetic */ ic(m80 m80Var, int i10, long j10, long j11, m80 m80Var2, fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = m80Var;
        this.d = i10;
        this.b = j10;
        this.c = j11;
        this.f = m80Var2;
        this.h = foVar;
        this.n = c6Var;
    }
}
