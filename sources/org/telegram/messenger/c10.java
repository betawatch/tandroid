package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class c10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c10(u10 u10Var, long j10, int i10) {
        this.a = i10;
        this.b = u10Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        u10 u10Var = this.b;
        switch (i10) {
            case 0:
                at.f(u10Var.currentAccount).k(at.O1, Long.valueOf(j10));
                break;
            default:
                ArrayList arrayList = (ArrayList) u10Var.n.R.f(j10);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        kj kjVar = (kj) arrayList.get(i11);
                        if (kjVar == null || kjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(u10Var.getMessagesStorage().e0(kjVar.f1(), kj.B0(kjVar.k)));
                        }
                    }
                    i0.g3(new ng(u10Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
