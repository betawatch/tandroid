package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ wv(yv yvVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = yvVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv yvVar = this.b;
                yvVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        gj gjVar = new gj(yvVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        gjVar.C0 = true;
                        yvVar.getSendMessagesHelper().k0(0L, gjVar, true);
                        i7++;
                    }
                }
            default:
                yv yvVar2 = this.b;
                yvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        gj gjVar2 = (gj) yvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (gjVar2 != null) {
                            gjVar2.Z = true;
                        }
                        i10++;
                    }
                }
        }
    }
}
