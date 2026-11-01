package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vi b;
    public final /* synthetic */ hs c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ qg(vi viVar, hs hsVar, TLRPC.Message message) {
        this.b = viVar;
        this.c = hsVar;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Message message = this.d;
        hs hsVar = this.c;
        vi viVar = this.b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(69, message, hsVar);
                break;
            default:
                a0.h hVar = viVar.y1;
                HashMap hashMap = viVar.x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(hsVar);
                hashMap.put(hsVar, message);
                a0.h hVar2 = viVar.w1;
                ArrayList arrayList = (ArrayList) hVar2.f(hsVar.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, hsVar.a);
                if (kj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.id);
                    }
                    hVar.k(hsVar, message.id);
                }
                viVar.getNotificationCenter().k(69, message, hsVar);
                break;
        }
    }

    public /* synthetic */ qg(vi viVar, TLRPC.Message message, hs hsVar) {
        this.b = viVar;
        this.d = message;
        this.c = hsVar;
    }
}
