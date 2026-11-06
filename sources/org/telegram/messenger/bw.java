package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ bw(dw dwVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = dwVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dw dwVar = this.b;
                dwVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        ij ijVar = new ij(dwVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        ijVar.A0 = true;
                        dwVar.getSendMessagesHelper().k0(0L, ijVar, true);
                        i7++;
                    }
                }
            default:
                dw dwVar2 = this.b;
                dwVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        ij ijVar2 = (ij) dwVar2.getMessagesController().S.f(((Long) arrayList2.get(i10)).longValue());
                        if (ijVar2 != null) {
                            ijVar2.Z = true;
                        }
                        i10++;
                    }
                }
        }
    }
}
