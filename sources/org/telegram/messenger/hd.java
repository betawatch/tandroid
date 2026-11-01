package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ nd c;

    public /* synthetic */ hd(od odVar, nd ndVar, int i10) {
        this.a = i10;
        this.b = odVar;
        this.c = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                ArrayList arrayList = odVar.I;
                nd ndVar = this.c;
                arrayList.remove(ndVar);
                odVar.J.l(ndVar.a);
                if (arrayList.isEmpty()) {
                    od.s();
                }
                at.e().k(at.D4, new Object[0]);
                break;
            case 1:
                od odVar2 = this.b;
                ArrayList arrayList2 = odVar2.I;
                nd ndVar2 = this.c;
                arrayList2.remove(ndVar2);
                odVar2.J.l(ndVar2.a);
                if (arrayList2.isEmpty()) {
                    od.s();
                }
                at.e().k(at.D4, new Object[0]);
                break;
            default:
                od odVar3 = this.b;
                ArrayList arrayList3 = odVar3.I;
                nd ndVar3 = this.c;
                arrayList3.remove(ndVar3);
                odVar3.J.l(ndVar3.a);
                if (arrayList3.isEmpty()) {
                    od.s();
                }
                at.e().k(at.D4, new Object[0]);
                break;
        }
    }
}
