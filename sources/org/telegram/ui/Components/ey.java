package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ey {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ wy b;

    public ey(wy wyVar) {
        this.b = wyVar;
    }

    public final void a(String str, boolean z10) {
        wy wyVar = this.b;
        int i9 = wyVar.Y0;
        String o6 = aa.d.o("gif_search_", str, "_");
        if (z10 && wyVar.h0.containsKey(o6)) {
            return;
        }
        kh.t1 t1Var = new kh.t1(this, str, z10, o6);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(o6);
            MessagesStorage.getInstance(i9).getBotCache(o6, t1Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(o6);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, t1Var, 2);
        }
    }
}
