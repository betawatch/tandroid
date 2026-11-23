package d3;

import h2.l0;
import kg.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf.b b;
    public final /* synthetic */ l2.e c;

    public /* synthetic */ g0(wf.b bVar, l2.e eVar, int i7) {
        this.a = i7;
        this.b = bVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf.b bVar = this.b;
                l2.e eVar = this.c;
                h0 h0Var = (h0) bVar.c;
                String str = l0.a;
                m2.d dVar = ((l2.a0) h0Var).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1015, new m2.c(U, eVar, 8));
                break;
            default:
                wf.b bVar2 = this.b;
                l2.e eVar2 = this.c;
                synchronized (eVar2) {
                }
                h0 h0Var2 = (h0) bVar2.c;
                String str2 = l0.a;
                l2.g0 g0Var = ((l2.a0) h0Var2).a;
                m2.d dVar2 = g0Var.s;
                m2.a S = dVar2.S((x2.g0) dVar2.d.e);
                dVar2.V(S, 1020, new f1(S, eVar2, 15));
                g0Var.S = null;
                break;
        }
    }
}
