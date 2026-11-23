package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ h00(y00 y00Var, long j3, int i7) {
        this.a = i7;
        this.b = y00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        y00 y00Var = this.b;
        switch (i7) {
            case 0:
                ks.f(y00Var.currentAccount).k(ks.O1, Long.valueOf(j3));
                break;
            default:
                ArrayList arrayList = (ArrayList) y00Var.n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        fj fjVar = (fj) arrayList.get(i10);
                        if (fjVar == null || fjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(y00Var.getMessagesStorage().e0(fjVar.e1(), fj.B0(fjVar.k)));
                        }
                    }
                    g0.g3(new yf(y00Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
