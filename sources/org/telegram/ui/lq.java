package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;
    public final /* synthetic */ String c;

    public /* synthetic */ lq(nq nqVar, String str, int i7) {
        this.a = i7;
        this.b = nqVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var;
        switch (this.a) {
            case 0:
                nq nqVar = this.b;
                nqVar.getClass();
                org.telegram.messenger.g0.h3(new lq(nqVar, this.c, 1));
                break;
            default:
                nq nqVar2 = this.b;
                nqVar2.n = null;
                oq oqVar = nqVar2.D;
                TLRPC.Chat chat = oqVar.n;
                int i7 = oqVar.d1;
                ArrayList arrayList = (org.telegram.messenger.t3.T(chat) || oqVar.r == null) ? null : new ArrayList(oqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(oqVar.getContactsController().e0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    nqVar2.s = false;
                    m6Var = null;
                } else {
                    m6Var = new m6(nqVar2, str, arrayList, arrayList2, 13);
                }
                nqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.t3.T(oqVar.n) ? oqVar.M : 0L, false, oqVar.N, 1, 0L, m6Var);
                break;
        }
    }
}
