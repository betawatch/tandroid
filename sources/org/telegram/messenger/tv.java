package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ tv(vv vvVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vv vvVar = this.b;
                vvVar.getClass();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i3 >= arrayList.size()) {
                        break;
                    } else {
                        zi ziVar = new zi(vvVar.currentAccount, (TLRPC.Message) arrayList.get(i3), false, true);
                        ziVar.A0 = true;
                        vvVar.getSendMessagesHelper().k0(0L, ziVar, true);
                        i3++;
                    }
                }
            default:
                vv vvVar2 = this.b;
                vvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        zi ziVar2 = (zi) vvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (ziVar2 != null) {
                            ziVar2.Z = true;
                        }
                        i10++;
                    }
                }
        }
    }
}
