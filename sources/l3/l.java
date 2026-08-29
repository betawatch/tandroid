package l3;

import jh.d3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ m3.f c;

    public /* synthetic */ l(n nVar, m3.f fVar, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                m3.f fVar = this.c;
                o oVar = nVar.b;
                int i10 = f5.d0.a;
                k3.f fVar2 = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar2.k();
                fVar2.l(k9, 1007, new k3.d(k9, fVar, 2));
                break;
            default:
                n nVar2 = this.b;
                m3.f fVar3 = this.c;
                synchronized (fVar3) {
                }
                o oVar2 = nVar2.b;
                int i11 = f5.d0.a;
                k3.f fVar4 = ((j3.h0) oVar2).a.r;
                k3.a i12 = fVar4.i((l4.c0) fVar4.d.e);
                fVar4.l(i12, 1013, new d3(i12, fVar3, 20));
                break;
        }
    }
}
