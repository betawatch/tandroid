package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ i00(z00 z00Var, long j3, int i7) {
        this.a = i7;
        this.b = z00Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        z00 z00Var = this.b;
        switch (i7) {
            case 0:
                ks.f(z00Var.currentAccount).k(ks.O1, Long.valueOf(j3));
                break;
            default:
                ArrayList arrayList = (ArrayList) z00Var.n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        fj fjVar = (fj) arrayList.get(i10);
                        if (fjVar == null || fjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(z00Var.getMessagesStorage().e0(fjVar.e1(), fj.B0(fjVar.k)));
                        }
                    }
                    g0.g3(new yf(z00Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
