package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hh(si siVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ArrayList arrayList = this.c;
        si siVar = this.b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(56, Long.valueOf(gj.B0(((gj) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            vr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            siVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    siVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
