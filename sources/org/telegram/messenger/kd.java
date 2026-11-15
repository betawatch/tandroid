package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;
    public final /* synthetic */ qd c;

    public /* synthetic */ kd(rd rdVar, qd qdVar, int i7) {
        this.a = i7;
        this.b = rdVar;
        this.c = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rd rdVar = this.b;
                ArrayList arrayList = rdVar.J;
                qd qdVar = this.c;
                arrayList.remove(qdVar);
                rdVar.K.l(qdVar.a);
                if (arrayList.isEmpty()) {
                    rd.s();
                }
                ns.e().k(ns.D4, new Object[0]);
                break;
            case 1:
                rd rdVar2 = this.b;
                ArrayList arrayList2 = rdVar2.J;
                qd qdVar2 = this.c;
                arrayList2.remove(qdVar2);
                rdVar2.K.l(qdVar2.a);
                if (arrayList2.isEmpty()) {
                    rd.s();
                }
                ns.e().k(ns.D4, new Object[0]);
                break;
            default:
                rd rdVar3 = this.b;
                ArrayList arrayList3 = rdVar3.J;
                qd qdVar3 = this.c;
                arrayList3.remove(qdVar3);
                rdVar3.K.l(qdVar3.a);
                if (arrayList3.isEmpty()) {
                    rd.s();
                }
                ns.e().k(ns.D4, new Object[0]);
                break;
        }
    }
}
