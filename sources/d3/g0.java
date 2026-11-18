package d3;

import h2.l0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                m2.d dVar2 = ((l2.z) h0Var).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1015, new m2.c(U, dVar, 8));
                break;
            default:
                wf.b bVar2 = this.b;
                l2.d dVar3 = this.c;
                synchronized (dVar3) {
                }
                h0 h0Var2 = (h0) bVar2.c;
                String str2 = l0.a;
                l2.f0 f0Var = ((l2.z) h0Var2).a;
                m2.d dVar4 = f0Var.s;
                m2.a S = dVar4.S((x2.g0) dVar4.d.e);
                dVar4.V(S, 1020, new ki.e(S, dVar3, 12));
                f0Var.S = null;
                break;
        }
    }
}
