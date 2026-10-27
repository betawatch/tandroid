package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class az {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ sz b;

    public az(sz szVar) {
        this.b = szVar;
    }

    public final void a(String str, boolean z10) {
        sz szVar = this.b;
        int i10 = szVar.c1;
        String p10 = a1.g.p("gif_search_", str, "_");
        if (z10 && szVar.l0.containsKey(p10)) {
            return;
        }
        String str2 = str;
        bi.d4 d4Var = new bi.d4(this, str2, z10, p10, 5);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p10);
            MessagesStorage.getInstance(i10).getBotCache(p10, d4Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(p10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, d4Var, 2);
        }
    }
}
