package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ si b;
    public final /* synthetic */ tr c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ pg(si siVar, tr trVar, TLRPC.Message message) {
        this.b = siVar;
        this.c = trVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Message message = this.d;
        tr trVar = this.c;
        si siVar = this.b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(69, message, trVar);
                break;
            default:
                a0.h hVar = siVar.B1;
                HashMap hashMap = siVar.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(trVar);
                hashMap.put(trVar, message);
                a0.h hVar2 = siVar.z1;
                ArrayList arrayList = (ArrayList) hVar2.f(trVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, trVar.a);
                if (gj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(trVar, message.id);
                }
                siVar.getNotificationCenter().k(69, message, trVar);
                break;
        }
    }

    public /* synthetic */ pg(si siVar, TLRPC.Message message, tr trVar) {
        this.b = siVar;
        this.d = message;
        this.c = trVar;
    }
}
