package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ od(sd sdVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = sdVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sd sdVar = this.b;
                ArrayList arrayList = sdVar.b;
                ArrayList arrayList2 = this.c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    rd rdVar = (rd) arrayList.get(i7);
                    sdVar.a.k(rdVar, rdVar.a);
                }
                g0.h3(new od(sdVar, arrayList2, 1));
                break;
            default:
                sd sdVar2 = this.b;
                ArrayList arrayList3 = sdVar2.I;
                ArrayList arrayList4 = this.c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    rd rdVar2 = (rd) arrayList4.get(i10);
                    sdVar2.J.k(rdVar2, rdVar2.a);
                }
                sd.q();
                qs.e().k(qs.D4, new Object[0]);
                break;
        }
    }
}
