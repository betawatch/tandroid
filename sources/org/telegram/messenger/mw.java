package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ mw(ow owVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = owVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ow owVar = this.b;
                owVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        jj jjVar = new jj(owVar.currentAccount, (TLRPC.Message) arrayList.get(i10), false, true);
                        jjVar.A0 = true;
                        owVar.getSendMessagesHelper().k0(0L, jjVar, true);
                        i10++;
                    }
                }
            default:
                ow owVar2 = this.b;
                owVar2.getClass();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        jj jjVar2 = (jj) owVar2.getMessagesController().S.f(((Long) arrayList2.get(i11)).longValue());
                        if (jjVar2 != null) {
                            jjVar2.Z = true;
                        }
                        i11++;
                    }
                }
        }
    }
}
