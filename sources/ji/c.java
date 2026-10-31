package ji;

import mg.l;
import org.telegram.messenger.i0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ e c;

    public /* synthetic */ c(f fVar, e eVar, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                e eVar = (e) fVar.c;
                e eVar2 = this.c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.k(eVar2);
                    break;
                }
                break;
            case 1:
                f fVar2 = this.b;
                e eVar3 = (e) fVar2.c;
                e eVar4 = this.c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.d;
                    if (cVar != null) {
                        i0.r(cVar);
                        fVar2.d = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 != 0) {
                        c cVar2 = new c(fVar2, eVar4, 2);
                        fVar2.e = cVar2;
                        i0.h3(cVar2, 20000L);
                        l lVar = eVar4.a;
                        ((ConnectionsManager) lVar.b).checkWebProxyInternal(eVar4.b, i10, new d(fVar2, eVar4));
                        break;
                    } else {
                        fVar2.k(eVar4);
                        break;
                    }
                }
                break;
            default:
                f fVar3 = this.b;
                e eVar5 = (e) fVar3.c;
                e eVar6 = this.c;
                if (eVar5 == eVar6) {
                    fVar3.e = null;
                    fVar3.k(eVar6);
                    break;
                }
                break;
        }
    }
}
