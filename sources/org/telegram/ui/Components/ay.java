package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ay {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ ty b;

    public ay(ty tyVar) {
        this.b = tyVar;
    }

    public final void a(String str, boolean z10) {
        ty tyVar = this.b;
        int i7 = tyVar.d1;
        String p10 = a8.p0.p("gif_search_", str, "_");
        if (z10 && tyVar.m0.containsKey(p10)) {
            return;
        }
        String str2 = str;
        di.j3 j3Var = new di.j3(this, str2, z10, p10, 6);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p10);
            org.telegram.messenger.ur.a0(i7).M(p10, j3Var);
            return;
        }
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        TLObject h22 = u12.h2(u12.N3);
        if (h22 instanceof TLRPC.User) {
            arrayList.add(p10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = u12.s1((TLRPC.User) h22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, j3Var, 2);
        }
    }
}
