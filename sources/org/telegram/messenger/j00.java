package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class j00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ j00(a10 a10Var, long j3, int i7) {
        this.a = i7;
        this.b = a10Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        a10 a10Var = this.b;
        switch (i7) {
            case 0:
                ls.f(a10Var.currentAccount).k(ls.O1, Long.valueOf(j3));
                break;
            default:
                ArrayList arrayList = (ArrayList) a10Var.n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        if (gjVar == null || gjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(a10Var.getMessagesStorage().e0(gjVar.e1(), gj.B0(gjVar.k)));
                        }
                    }
                    g0.g3(new zf(a10Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
