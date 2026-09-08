package a3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf.b b;
    public final /* synthetic */ i2.h c;

    public /* synthetic */ j0(pf.b bVar, i2.h hVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pf.b bVar = this.b;
                i2.h hVar = this.c;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) l0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, hVar, 20));
                break;
            default:
                pf.b bVar2 = this.b;
                i2.h hVar2 = this.c;
                synchronized (hVar2) {
                }
                l0 l0Var2 = (l0) bVar2.c;
                String str2 = e2.d0.a;
                i2.f0 f0Var = ((i2.c0) l0Var2).a;
                j2.f fVar2 = f0Var.s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new fi.f(n10, hVar2, 17));
                f0Var.Q = null;
                break;
        }
    }
}
