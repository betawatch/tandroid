package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tx {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ ly b;

    public tx(ly lyVar) {
        this.b = lyVar;
    }

    public final void a(String str, boolean z10) {
        ly lyVar = this.b;
        int i7 = lyVar.d1;
        String p10 = a8.p0.p("gif_search_", str, "_");
        if (z10 && lyVar.m0.containsKey(p10)) {
            return;
        }
        String str2 = str;
        di.f3 f3Var = new di.f3(this, str2, z10, p10, 6);
        ArrayList arrayList = this.a;
        if (z10) {
            arrayList.add(p10);
            org.telegram.messenger.vr.a0(i7).M(p10, f3Var);
            return;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLObject f22 = s12.f2(s12.L3);
        if (f22 instanceof TLRPC.User) {
            arrayList.add(p10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = s12.q1((TLRPC.User) f22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, f3Var, 2);
        }
    }
}
