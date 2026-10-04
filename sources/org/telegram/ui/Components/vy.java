package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vy {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ nz b;

    public vy(nz nzVar) {
        this.b = nzVar;
    }

    public final void a(String str, boolean z10) {
        nz nzVar = this.b;
        int i10 = nzVar.c1;
        String p5 = a4.a.p("gif_search_", str, "_");
        if (z10 && nzVar.l0.containsKey(p5)) {
            return;
        }
        ci.t1 t1Var = new ci.t1(this, str, z10, p5);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p5);
            MessagesStorage.getInstance(i10).getBotCache(p5, t1Var);
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, t1Var, 2);
        }
    }
}
