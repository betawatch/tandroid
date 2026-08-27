package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fy {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ yy b;

    public fy(yy yyVar) {
        this.b = yyVar;
    }

    public final void a(String str, boolean z10) {
        yy yyVar = this.b;
        int i10 = yyVar.Y0;
        String m10 = a9.p.m("gif_search_", str, "_");
        if (z10 && yyVar.h0.containsKey(m10)) {
            return;
        }
        lh.r1 r1Var = new lh.r1(this, str, z10, m10);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(m10);
            MessagesStorage.getInstance(i10).getBotCache(m10, r1Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(m10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, r1Var, 2);
        }
    }
}
