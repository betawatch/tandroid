package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.a) {
            case 0:
                pq pqVar = this.b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.c, 1));
                break;
            default:
                pq pqVar2 = this.b;
                pqVar2.n = null;
                qq qqVar = pqVar2.E;
                TLRPC.Chat chat = qqVar.n;
                int i7 = qqVar.e1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || qqVar.r == null) ? null : new ArrayList(qqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(qqVar.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.s = false;
                    l5Var = null;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(pqVar2, str, arrayList, arrayList2, 15);
                }
                pqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.t3.T(qqVar.n) ? qqVar.N : 0L, false, qqVar.O, 1, 0L, l5Var);
                break;
        }
    }
}
