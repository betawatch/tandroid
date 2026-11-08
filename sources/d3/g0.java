package d3;

import h2.m0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                String str = m0.a;
                m2.e eVar = ((l2.c0) h0Var).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1015, new m2.d(U, dVar, 1));
                break;
            default:
                wf.b bVar2 = this.b;
                l2.d dVar2 = this.c;
                synchronized (dVar2) {
                }
                h0 h0Var2 = (h0) bVar2.c;
                String str2 = m0.a;
                l2.i0 i0Var = ((l2.c0) h0Var2).a;
                m2.e eVar2 = i0Var.s;
                m2.a S = eVar2.S((x2.g0) eVar2.d.e);
                eVar2.V(S, 1020, new l2.y(S, dVar2, 15));
                i0Var.S = null;
                break;
        }
    }
}
