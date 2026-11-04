package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hd(ld ldVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = ldVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld ldVar = this.b;
                ArrayList arrayList = ldVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    kd kdVar = (kd) arrayList.get(i3);
                    ldVar.a.k(kdVar, kdVar.a);
                }
                g0.h3(new hd(ldVar, arrayList2, 1));
                break;
            default:
                ld ldVar2 = this.b;
                ArrayList arrayList3 = ldVar2.J;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    kd kdVar2 = (kd) arrayList4.get(i10);
                    ldVar2.K.k(kdVar2, kdVar2.a);
                }
                ld.q();
                hs.e().k(hs.D4, new Object[0]);
                break;
        }
    }
}
