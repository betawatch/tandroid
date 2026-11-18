package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ri b;
    public final /* synthetic */ sr c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ og(ri riVar, sr srVar, TLRPC.Message message) {
        this.b = riVar;
        this.c = srVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Message message = this.d;
        sr srVar = this.c;
        ri riVar = this.b;
        switch (i7) {
            case 0:
                riVar.getNotificationCenter().k(69, message, srVar);
                break;
            default:
                a0.h hVar = riVar.B1;
                HashMap hashMap = riVar.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(srVar);
                hashMap.put(srVar, message);
                a0.h hVar2 = riVar.z1;
                ArrayList arrayList = (ArrayList) hVar2.f(srVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, srVar.a);
                if (fj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(srVar, message.id);
                }
                riVar.getNotificationCenter().k(69, message, srVar);
                break;
        }
    }

    public /* synthetic */ og(ri riVar, TLRPC.Message message, sr srVar) {
        this.b = riVar;
        this.d = message;
        this.c = srVar;
    }
}
