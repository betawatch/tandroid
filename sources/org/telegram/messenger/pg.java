package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ui b;
    public final /* synthetic */ gs c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ pg(ui uiVar, gs gsVar, TLRPC.Message message) {
        this.b = uiVar;
        this.c = gsVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Message message = this.d;
        gs gsVar = this.c;
        ui uiVar = this.b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, gsVar);
                break;
            default:
                a0.h hVar = uiVar.y1;
                HashMap hashMap = uiVar.x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(gsVar);
                hashMap.put(gsVar, message);
                a0.h hVar2 = uiVar.w1;
                ArrayList arrayList = (ArrayList) hVar2.f(gsVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, gsVar.a);
                if (jj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(gsVar, message.id);
                }
                uiVar.getNotificationCenter().k(69, message, gsVar);
                break;
        }
    }

    public /* synthetic */ pg(ui uiVar, TLRPC.Message message, gs gsVar) {
        this.b = uiVar;
        this.d = message;
        this.c = gsVar;
    }
}
