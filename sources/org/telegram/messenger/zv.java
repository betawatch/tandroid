package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class zv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zv(bw bwVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = bwVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bw bwVar = this.b;
                bwVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        gj gjVar = new gj(bwVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        gjVar.C0 = true;
                        bwVar.getSendMessagesHelper().k0(0L, gjVar, true);
                        i7++;
                    }
                }
            default:
                bw bwVar2 = this.b;
                bwVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        gj gjVar2 = (gj) bwVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (gjVar2 != null) {
                            gjVar2.Z = true;
                        }
                        i10++;
                    }
                }
        }
    }
}
