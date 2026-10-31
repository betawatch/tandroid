package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dy {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ vy b;

    public dy(vy vyVar) {
        this.b = vyVar;
    }

    public final void a(String str, boolean z10) {
        vy vyVar = this.b;
        int i10 = vyVar.c1;
        String n10 = a1.g.n("gif_search_", str, "_");
        if (z10 && vyVar.l0.containsKey(n10)) {
            return;
        }
        String str2 = str;
        org.telegram.messenger.s6 s6Var = new org.telegram.messenger.s6(this, str2, z10, n10, 4);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(n10);
            org.telegram.messenger.hs.a0(i10).M(n10, s6Var);
            return;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLObject e22 = r12.e2(r12.M3);
        if (e22 instanceof TLRPC.User) {
            arrayList.add(n10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = r12.p1((TLRPC.User) e22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, s6Var, 2);
        }
    }
}
