package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;
    public final /* synthetic */ String c;

    public /* synthetic */ jq(mq mqVar, String str, int i3) {
        this.a = i3;
        this.b = mqVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o4.b1 b1Var;
        switch (this.a) {
            case 0:
                mq mqVar = this.b;
                mqVar.getClass();
                org.telegram.messenger.g0.h3(new jq(mqVar, this.c, 1));
                break;
            default:
                mq mqVar2 = this.b;
                mqVar2.n = null;
                nq nqVar = mqVar2.E;
                TLRPC.Chat chat = nqVar.n;
                int i3 = nqVar.e1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || nqVar.r == null) ? null : new ArrayList(nqVar.r.participants.participants);
                ArrayList arrayList2 = i3 == 1 ? new ArrayList(nqVar.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    mqVar2.s = false;
                    b1Var = null;
                } else {
                    b1Var = new o4.b1(mqVar2, str, arrayList, arrayList2, 19);
                }
                mqVar2.h.h(str, i3 != 0, false, true, false, false, org.telegram.messenger.t3.T(nqVar.n) ? nqVar.N : 0L, false, nqVar.O, 1, 0L, b1Var);
                break;
        }
    }
}
