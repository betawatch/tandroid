package i5;

import h5.d0;
import j3.c0;
import j3.f0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ n3.f c;

    public /* synthetic */ w(f7.b bVar, n3.f fVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f7.b bVar = this.b;
                n3.f fVar = this.c;
                synchronized (fVar) {
                }
                c0 c0Var = (c0) bVar.c;
                int i10 = d0.a;
                f0 f0Var = c0Var.a;
                k3.f fVar2 = f0Var.q;
                k3.a n10 = fVar2.n((o4.v) fVar2.d.e);
                fVar2.q(n10, 1020, new gg.f(n10, fVar, 18));
                f0Var.N = null;
                break;
            default:
                f7.b bVar2 = this.b;
                n3.f fVar3 = this.c;
                c0 c0Var2 = (c0) bVar2.c;
                int i11 = d0.a;
                k3.f fVar4 = c0Var2.a.q;
                k3.a p10 = fVar4.p();
                fVar4.q(p10, 1015, new k3.c(p10, fVar3, 2));
                break;
        }
    }
}
