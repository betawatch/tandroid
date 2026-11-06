package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ nd(sd sdVar, ArrayList arrayList, int i7) {
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
                g0.h3(new nd(sdVar, arrayList2, 1));
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
