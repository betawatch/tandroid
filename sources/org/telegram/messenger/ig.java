package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ li b;
    public final /* synthetic */ pr c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ ig(li liVar, pr prVar, TLRPC.Message message) {
        this.b = liVar;
        this.c = prVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.Message message = this.d;
        pr prVar = this.c;
        li liVar = this.b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(69, message, prVar);
                break;
            default:
                a0.h hVar = liVar.z1;
                HashMap hashMap = liVar.y1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(prVar);
                hashMap.put(prVar, message);
                a0.h hVar2 = liVar.x1;
                ArrayList arrayList = (ArrayList) hVar2.f(prVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, prVar.a);
                if (zi.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(prVar, message.id);
                }
                liVar.getNotificationCenter().k(69, message, prVar);
                break;
        }
    }

    public /* synthetic */ ig(li liVar, TLRPC.Message message, pr prVar) {
        this.b = liVar;
        this.d = message;
        this.c = prVar;
    }
}
