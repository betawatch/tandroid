package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;
    public final /* synthetic */ String c;

    public /* synthetic */ mr(or orVar, String str, int i10) {
        this.a = i10;
        this.b = orVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp fpVar;
        switch (this.a) {
            case 0:
                or orVar = this.b;
                orVar.getClass();
                org.telegram.messenger.i0.g3(new mr(orVar, this.c, 1));
                break;
            default:
                or orVar2 = this.b;
                orVar2.n = null;
                pr prVar = orVar2.D;
                TLRPC.Chat chat = prVar.n;
                int i10 = prVar.d1;
                ArrayList arrayList = (org.telegram.messenger.w3.T(chat) || prVar.r == null) ? null : new ArrayList(prVar.r.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(prVar.getContactsController().e0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.s = false;
                    fpVar = null;
                } else {
                    fpVar = new fp(orVar2, str, arrayList, arrayList2, 3);
                }
                orVar2.h.h(str, i10 != 0, false, true, false, false, org.telegram.messenger.w3.T(prVar.n) ? prVar.M : 0L, false, prVar.N, 1, 0L, fpVar);
                break;
        }
    }
}
