package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zy {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ rz b;

    public zy(rz rzVar) {
        this.b = rzVar;
    }

    public final void a(String str, boolean z10) {
        rz rzVar = this.b;
        int i10 = rzVar.c1;
        String p5 = a4.a.p("gif_search_", str, "_");
        if (z10 && rzVar.l0.containsKey(p5)) {
            return;
        }
        bi.d2 d2Var = new bi.d2(this, str, z10, p5);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p5);
            MessagesStorage.getInstance(i10).getBotCache(p5, d2Var);
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, d2Var, 2);
        }
    }
}
