package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ry {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ kz b;

    public ry(kz kzVar) {
        this.b = kzVar;
    }

    public final void a(String str, boolean z4) {
        kz kzVar = this.b;
        int i10 = kzVar.Z0;
        String o10 = android.support.v4.media.a.o("gif_search_", str, "_");
        if (z4 && kzVar.i0.containsKey(o10)) {
            return;
        }
        String str2 = str;
        org.telegram.ui.wd wdVar = new org.telegram.ui.wd(this, str2, z4, o10, 3);
        ArrayList arrayList = this.a;
        if (z4) {
            arrayList.add(o10);
            MessagesStorage.getInstance(i10).getBotCache(o10, wdVar);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(o10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, wdVar, 2);
        }
    }
}
