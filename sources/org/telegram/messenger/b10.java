package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b10(t10 t10Var, long j10, int i10) {
        this.a = i10;
        this.b = t10Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        t10 t10Var = this.b;
        switch (i10) {
            case 0:
                zs.f(t10Var.currentAccount).k(zs.O1, Long.valueOf(j10));
                break;
            default:
                ArrayList arrayList = (ArrayList) t10Var.n.R.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        jj jjVar = (jj) arrayList.get(i11);
                        if (jjVar == null || jjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(t10Var.getMessagesStorage().e0(jjVar.f1(), jj.B0(jjVar.k)));
                        }
                    }
                    i0.g3(new mg(t10Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
