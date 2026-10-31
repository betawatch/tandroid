package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ jd(nd ndVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ndVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd ndVar = this.b;
                ArrayList arrayList = ndVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    md mdVar = (md) arrayList.get(i10);
                    ndVar.a.k(mdVar, mdVar.a);
                }
                i0.g3(new jd(ndVar, arrayList2, 1));
                break;
            default:
                nd ndVar2 = this.b;
                ArrayList arrayList3 = ndVar2.I;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    md mdVar2 = (md) arrayList4.get(i11);
                    ndVar2.J.k(mdVar2, mdVar2.a);
                }
                nd.q();
                zs.e().k(zs.D4, new Object[0]);
                break;
        }
    }
}
