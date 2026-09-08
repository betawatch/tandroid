package fg;

import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
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
                e eVar = (e) fVar.b;
                e eVar2 = this.c;
                if (eVar == eVar2) {
                    fVar.c = null;
                    fVar.k(eVar2);
                    break;
                }
                break;
            case 1:
                f fVar2 = this.b;
                e eVar3 = (e) fVar2.b;
                e eVar4 = this.c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 != 0) {
                        c cVar2 = new c(fVar2, eVar4, 2);
                        fVar2.d = cVar2;
                        AndroidUtilities.runOnUIThread(cVar2, 20000L);
                        k5 k5Var = eVar4.a;
                        ((ConnectionsManager) k5Var.b).checkWebProxyInternal(eVar4.b, i10, new d(fVar2, eVar4));
                        break;
                    } else {
                        fVar2.k(eVar4);
                        break;
                    }
                }
                break;
            default:
                f fVar3 = this.b;
                e eVar5 = (e) fVar3.b;
                e eVar6 = this.c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.k(eVar6);
                    break;
                }
                break;
        }
    }
}
