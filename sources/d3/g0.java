package d3;

import h2.l0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf.b b;
    public final /* synthetic */ l2.d c;

    public /* synthetic */ g0(wf.b bVar, l2.d dVar, int i7) {
        this.a = i7;
        this.b = bVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf.b bVar = this.b;
                l2.d dVar = this.c;
                h0 h0Var = (h0) bVar.c;
                String str = l0.a;
                m2.e eVar = ((l2.z) h0Var).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1015, new m2.c(U, dVar, 7));
                break;
            default:
                wf.b bVar2 = this.b;
                l2.d dVar2 = this.c;
                synchronized (dVar2) {
                }
                h0 h0Var2 = (h0) bVar2.c;
                String str2 = l0.a;
                l2.f0 f0Var = ((l2.z) h0Var2).a;
                m2.e eVar2 = f0Var.s;
                m2.a S = eVar2.S((x2.f0) eVar2.d.e);
                eVar2.V(S, 1020, new ki.e(S, dVar2, 11));
                f0Var.S = null;
                break;
        }
    }
}
