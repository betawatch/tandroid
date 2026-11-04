package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ g00(x00 x00Var, long j10, int i3) {
        this.a = i3;
        this.b = x00Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.c;
        x00 x00Var = this.b;
        switch (i3) {
            case 0:
                hs.f(x00Var.currentAccount).k(hs.O1, Long.valueOf(j10));
                break;
            default:
                ArrayList arrayList = (ArrayList) x00Var.n.S.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        zi ziVar = (zi) arrayList.get(i10);
                        if (ziVar == null || ziVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(x00Var.getMessagesStorage().e0(ziVar.f1(), zi.B0(ziVar.k)));
                        }
                    }
                    g0.h3(new fg(x00Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
