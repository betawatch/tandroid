package l3;

import jh.d3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k(n nVar, Exception exc, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        n nVar = this.b;
        switch (i10) {
            case 0:
                o oVar = nVar.b;
                int i11 = f5.d0.a;
                k3.f fVar = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1029, new d3(k9, exc, 2));
                break;
            default:
                o oVar2 = nVar.b;
                int i12 = f5.d0.a;
                k3.f fVar2 = ((j3.h0) oVar2).a.r;
                k3.a k10 = fVar2.k();
                fVar2.l(k10, 1014, new d3(k10, exc, 29));
                break;
        }
    }
}
