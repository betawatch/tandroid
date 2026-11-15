package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ si b;
    public final /* synthetic */ ur c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ pg(si siVar, ur urVar, TLRPC.Message message) {
        this.b = siVar;
        this.c = urVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Message message = this.d;
        ur urVar = this.c;
        si siVar = this.b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(69, message, urVar);
                break;
            default:
                a0.h hVar = siVar.z1;
                HashMap hashMap = siVar.y1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(urVar);
                hashMap.put(urVar, message);
                a0.h hVar2 = siVar.x1;
                ArrayList arrayList = (ArrayList) hVar2.f(urVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, urVar.a);
                if (gj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(urVar, message.id);
                }
                siVar.getNotificationCenter().k(69, message, urVar);
                break;
        }
    }

    public /* synthetic */ pg(si siVar, TLRPC.Message message, ur urVar) {
        this.b = siVar;
        this.d = message;
        this.c = urVar;
    }
}
