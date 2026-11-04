package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;
    public final /* synthetic */ kd c;

    public /* synthetic */ ed(ld ldVar, kd kdVar, int i3) {
        this.a = i3;
        this.b = ldVar;
        this.c = kdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld ldVar = this.b;
                ArrayList arrayList = ldVar.J;
                kd kdVar = this.c;
                arrayList.remove(kdVar);
                ldVar.K.l(kdVar.a);
                if (arrayList.isEmpty()) {
                    ld.s();
                }
                hs.e().k(hs.D4, new Object[0]);
                break;
            case 1:
                ld ldVar2 = this.b;
                ArrayList arrayList2 = ldVar2.J;
                kd kdVar2 = this.c;
                arrayList2.remove(kdVar2);
                ldVar2.K.l(kdVar2.a);
                if (arrayList2.isEmpty()) {
                    ld.s();
                }
                hs.e().k(hs.D4, new Object[0]);
                break;
            default:
                ld ldVar3 = this.b;
                ArrayList arrayList3 = ldVar3.J;
                kd kdVar3 = this.c;
                arrayList3.remove(kdVar3);
                ldVar3.K.l(kdVar3.a);
                if (arrayList3.isEmpty()) {
                    ld.s();
                }
                hs.e().k(hs.D4, new Object[0]);
                break;
        }
    }
}
