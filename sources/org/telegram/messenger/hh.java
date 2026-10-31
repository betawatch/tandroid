package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hh(ui uiVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ArrayList arrayList = this.c;
        ui uiVar = this.b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(56, Long.valueOf(jj.B0(((jj) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        try {
                            hs.d((TLRPC.Message) arrayList.get(i11), hVar, hVar2);
                        } catch (Exception e) {
                            uiVar.getMessagesStorage().o(e, true);
                        }
                    }
                    uiVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
