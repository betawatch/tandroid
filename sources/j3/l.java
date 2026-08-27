package j3;

import h3.q2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ k3.f c;

    public /* synthetic */ l(n nVar, k3.f fVar, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                k3.f fVar = this.c;
                o oVar = nVar.b;
                int i10 = d5.g0.a;
                i3.f fVar2 = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar2.k();
                fVar2.l(k10, 1007, new i3.d(k10, fVar, 9));
                break;
            default:
                n nVar2 = this.b;
                k3.f fVar3 = this.c;
                synchronized (fVar3) {
                }
                o oVar2 = nVar2.b;
                int i11 = d5.g0.a;
                i3.f fVar4 = ((h3.h0) oVar2).a.r;
                i3.a i12 = fVar4.i((j4.c0) fVar4.d.e);
                fVar4.l(i12, 1013, new q2(i12, fVar3, 27));
                break;
        }
    }
}
