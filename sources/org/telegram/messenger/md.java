package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ md(qd qdVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = qdVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qd qdVar = this.b;
                ArrayList arrayList = qdVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    pd pdVar = (pd) arrayList.get(i7);
                    qdVar.a.k(pdVar, pdVar.a);
                }
                g0.g3(new md(qdVar, arrayList2, 1));
                break;
            default:
                qd qdVar2 = this.b;
                ArrayList arrayList3 = qdVar2.J;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    pd pdVar2 = (pd) arrayList4.get(i10);
                    qdVar2.K.k(pdVar2, pdVar2.a);
                }
                qd.q();
                ks.e().k(ks.F4, new Object[0]);
                break;
        }
    }
}
