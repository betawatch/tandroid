package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        m6 m6Var;
        switch (this.a) {
            case 0:
                pq pqVar = this.b;
                pqVar.getClass();
                org.telegram.messenger.g0.h3(new nq(pqVar, this.c, 1));
                break;
            default:
                pq pqVar2 = this.b;
                pqVar2.n = null;
                qq qqVar = pqVar2.D;
                TLRPC.Chat chat = qqVar.n;
                int i7 = qqVar.d1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || qqVar.r == null) ? null : new ArrayList(qqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(qqVar.getContactsController().e0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    pqVar2.s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(pqVar2, str, arrayList, arrayList2, 13);
                }
                pqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.t3.T(qqVar.n) ? qqVar.M : 0L, false, qqVar.N, 1, 0L, m6Var);
                break;
        }
    }
}
