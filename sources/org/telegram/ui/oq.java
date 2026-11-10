package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;
    public final /* synthetic */ String c;

    public /* synthetic */ oq(qq qqVar, String str, int i7) {
        this.a = i7;
        this.b = qqVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var;
        switch (this.a) {
            case 0:
                qq qqVar = this.b;
                qqVar.getClass();
                org.telegram.messenger.g0.h3(new oq(qqVar, this.c, 1));
                break;
            default:
                qq qqVar2 = this.b;
                qqVar2.n = null;
                rq rqVar = qqVar2.D;
                TLRPC.Chat chat = rqVar.n;
                int i7 = rqVar.d1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || rqVar.r == null) ? null : new ArrayList(rqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(rqVar.getContactsController().e0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(qqVar2, str, arrayList, arrayList2, 13);
                }
                qqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.t3.T(rqVar.n) ? rqVar.M : 0L, false, rqVar.N, 1, 0L, m6Var);
                break;
        }
    }
}
