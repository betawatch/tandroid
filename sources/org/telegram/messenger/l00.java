package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ l00(c10 c10Var, long j3, int i7) {
        this.a = i7;
        this.b = c10Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        c10 c10Var = this.b;
        switch (i7) {
            case 0:
                ns.f(c10Var.currentAccount).k(ns.O1, Long.valueOf(j3));
                break;
            default:
                ArrayList arrayList = (ArrayList) c10Var.n.S.f(j3);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        if (gjVar == null || gjVar.k == null) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(c10Var.getMessagesStorage().e0(gjVar.e1(), gj.B0(gjVar.k)));
                        }
                    }
                    g0.h3(new mg(c10Var, arrayList2, arrayList, 5));
                    break;
                }
                break;
        }
    }
}
