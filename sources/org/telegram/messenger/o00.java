package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ o00(f10 f10Var, long j3, int i7) {
        this.a = i7;
        this.b = f10Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        f10 f10Var = this.b;
        switch (i7) {
            case 0:
                qs.f(f10Var.currentAccount).k(qs.O1, Long.valueOf(j3));
                break;
            default:
                ArrayList arrayList = (ArrayList) f10Var.n.R.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ij ijVar = (ij) arrayList.get(i10);
                        if (ijVar == null || ijVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(f10Var.getMessagesStorage().e0(ijVar.f1(), ij.B0(ijVar.k)));
                        }
                    }
                    g0.h3(new ng(f10Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
