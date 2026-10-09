package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hz {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ a00 b;

    public hz(a00 a00Var) {
        this.b = a00Var;
    }

    public final void a(String str, boolean z10) {
        a00 a00Var = this.b;
        int i10 = a00Var.c1;
        String q6 = a1.g.q("gif_search_", str, "_");
        if (z10 && a00Var.l0.containsKey(q6)) {
            return;
        }
        ci.s1 s1Var = new ci.s1(this, str, z10, q6);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(q6);
            MessagesStorage.getInstance(i10).getBotCache(q6, s1Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(q6);
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
