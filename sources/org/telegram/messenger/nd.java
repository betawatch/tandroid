package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ nd(rd rdVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = rdVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rd rdVar = this.b;
                ArrayList arrayList = rdVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    qd qdVar = (qd) arrayList.get(i7);
                    rdVar.a.k(qdVar, qdVar.a);
                }
                g0.g3(new nd(rdVar, arrayList2, 1));
                break;
            default:
                rd rdVar2 = this.b;
                ArrayList arrayList3 = rdVar2.J;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    qd qdVar2 = (qd) arrayList4.get(i10);
                    rdVar2.K.k(qdVar2, qdVar2.a);
                }
                rd.q();
                ls.e().k(ls.G4, new Object[0]);
                break;
        }
    }
}
