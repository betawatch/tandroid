package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;
    public final /* synthetic */ md c;

    public /* synthetic */ gd(nd ndVar, md mdVar, int i10) {
        this.a = i10;
        this.b = ndVar;
        this.c = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd ndVar = this.b;
                ArrayList arrayList = ndVar.I;
                md mdVar = this.c;
                arrayList.remove(mdVar);
                ndVar.J.l(mdVar.a);
                if (arrayList.isEmpty()) {
                    nd.s();
                }
                zs.e().k(zs.D4, new Object[0]);
                break;
            case 1:
                nd ndVar2 = this.b;
                ArrayList arrayList2 = ndVar2.I;
                md mdVar2 = this.c;
                arrayList2.remove(mdVar2);
                ndVar2.J.l(mdVar2.a);
                if (arrayList2.isEmpty()) {
                    nd.s();
                }
                zs.e().k(zs.D4, new Object[0]);
                break;
            default:
                nd ndVar3 = this.b;
                ArrayList arrayList3 = ndVar3.I;
                md mdVar3 = this.c;
                arrayList3.remove(mdVar3);
                ndVar3.J.l(mdVar3.a);
                if (arrayList3.isEmpty()) {
                    nd.s();
                }
                zs.e().k(zs.D4, new Object[0]);
                break;
        }
    }
}
