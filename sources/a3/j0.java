package a3;

import ei.d5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of.b b;
    public final /* synthetic */ i2.g c;

    public /* synthetic */ j0(of.b bVar, i2.g gVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                of.b bVar = this.b;
                i2.g gVar = this.c;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.b0) l0Var).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, gVar, 22));
                break;
            default:
                of.b bVar2 = this.b;
                i2.g gVar2 = this.c;
                synchronized (gVar2) {
                }
                l0 l0Var2 = (l0) bVar2.c;
                String str2 = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) l0Var2).a;
                j2.f fVar2 = e0Var.s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n10, 1020, new d5(n10, gVar2, 25));
                e0Var.Q = null;
                break;
        }
    }
}
