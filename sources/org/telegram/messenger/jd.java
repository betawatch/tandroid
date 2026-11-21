package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;
    public final /* synthetic */ pd c;

    public /* synthetic */ jd(qd qdVar, pd pdVar, int i7) {
        this.a = i7;
        this.b = qdVar;
        this.c = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qd qdVar = this.b;
                ArrayList arrayList = qdVar.J;
                pd pdVar = this.c;
                arrayList.remove(pdVar);
                qdVar.K.l(pdVar.a);
                if (arrayList.isEmpty()) {
                    qd.s();
                }
                ks.e().k(ks.G4, new Object[0]);
                break;
            case 1:
                qd qdVar2 = this.b;
                ArrayList arrayList2 = qdVar2.J;
                pd pdVar2 = this.c;
                arrayList2.remove(pdVar2);
                qdVar2.K.l(pdVar2.a);
                if (arrayList2.isEmpty()) {
                    qd.s();
                }
                ks.e().k(ks.G4, new Object[0]);
                break;
            default:
                qd qdVar3 = this.b;
                ArrayList arrayList3 = qdVar3.J;
                pd pdVar3 = this.c;
                arrayList3.remove(pdVar3);
                qdVar3.K.l(pdVar3.a);
                if (arrayList3.isEmpty()) {
                    qd.s();
                }
                ks.e().k(ks.G4, new Object[0]);
                break;
        }
    }
}
