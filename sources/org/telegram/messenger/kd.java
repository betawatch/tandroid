package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ kd(od odVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = odVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                ArrayList arrayList = odVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    nd ndVar = (nd) arrayList.get(i10);
                    odVar.a.k(ndVar, ndVar.a);
                }
                i0.g3(new kd(odVar, arrayList2, 1));
                break;
            default:
                od odVar2 = this.b;
                ArrayList arrayList3 = odVar2.I;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    nd ndVar2 = (nd) arrayList4.get(i11);
                    odVar2.J.k(ndVar2, ndVar2.a);
                }
                od.q();
                at.e().k(at.D4, new Object[0]);
                break;
        }
    }
}
