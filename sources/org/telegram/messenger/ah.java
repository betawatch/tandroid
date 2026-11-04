package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ah(li liVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = liVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ArrayList arrayList = this.c;
        li liVar = this.b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(56, Long.valueOf(zi.B0(((zi) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            qr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            liVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    liVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
