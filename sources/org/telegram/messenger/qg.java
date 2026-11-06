package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ui b;
    public final /* synthetic */ xr c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ qg(ui uiVar, xr xrVar, TLRPC.Message message) {
        this.b = uiVar;
        this.c = xrVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Message message = this.d;
        xr xrVar = this.c;
        ui uiVar = this.b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, xrVar);
                break;
            default:
                a0.h hVar = uiVar.y1;
                HashMap hashMap = uiVar.x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(xrVar);
                hashMap.put(xrVar, message);
                a0.h hVar2 = uiVar.w1;
                ArrayList arrayList = (ArrayList) hVar2.f(xrVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, xrVar.a);
                if (ij.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(xrVar, message.id);
                }
                uiVar.getNotificationCenter().k(69, message, xrVar);
                break;
        }
    }

    public /* synthetic */ qg(ui uiVar, TLRPC.Message message, xr xrVar) {
        this.b = uiVar;
        this.d = message;
        this.c = xrVar;
    }
}
