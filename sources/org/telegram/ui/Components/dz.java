package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dz {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ wz b;

    public dz(wz wzVar) {
        this.b = wzVar;
    }

    public final void a(String str, boolean z10) {
        wz wzVar = this.b;
        int i10 = wzVar.c1;
        String p5 = a1.g.p("gif_search_", str, "_");
        if (z10 && wzVar.l0.containsKey(p5)) {
            return;
        }
        di.s1 s1Var = new di.s1(this, str, z10, p5);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p5);
            MessagesStorage.getInstance(i10).getBotCache(p5, s1Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(p5);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, s1Var, 2);
        }
    }
}
