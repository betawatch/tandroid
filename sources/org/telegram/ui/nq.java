package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;
    public final /* synthetic */ String c;

    public /* synthetic */ nq(pq pqVar, String str, int i7) {
        this.a = i7;
        this.b = pqVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pq pqVar = this.b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.c, 1));
                break;
            default:
                pq pqVar2 = this.b;
                org.telegram.ui.ActionBar.m5 m5Var = null;
                pqVar2.n = null;
                qq qqVar = pqVar2.E;
                TLRPC.Chat chat = qqVar.n;
                int i7 = qqVar.e1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || qqVar.r == null) ? null : new ArrayList(qqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(qqVar.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.s = false;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(pqVar2, str, arrayList, arrayList2);
                }
                pqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.t3.T(qqVar.n) ? qqVar.N : 0L, false, qqVar.O, 1, 0L, m5Var);
                break;
        }
    }
}
