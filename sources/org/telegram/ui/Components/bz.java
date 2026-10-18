package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bz {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ tz b;

    public bz(tz tzVar) {
        this.b = tzVar;
    }

    public final void a(String str, boolean z10) {
        tz tzVar = this.b;
        int i10 = tzVar.c1;
        String p5 = a1.g.p("gif_search_", str, "_");
        if (z10 && tzVar.l0.containsKey(p5)) {
            return;
        }
        String str2 = str;
        ai.g4 g4Var = new ai.g4(this, str2, z10, p5, 5);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p5);
            MessagesStorage.getInstance(i10).getBotCache(p5, g4Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(p5);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, g4Var, 2);
        }
    }
}
