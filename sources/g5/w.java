package g5;

import f5.d0;
import j3.h0;
import j3.k0;
import jh.d3;
import l4.c0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze.b b;
    public final /* synthetic */ m3.f c;

    public /* synthetic */ w(ze.b bVar, m3.f fVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze.b bVar = this.b;
                m3.f fVar = this.c;
                synchronized (fVar) {
                }
                h0 h0Var = (h0) bVar.b;
                int i10 = d0.a;
                k0 k0Var = h0Var.a;
                k3.f fVar2 = k0Var.r;
                k3.a i11 = fVar2.i((c0) fVar2.d.e);
                fVar2.l(i11, 1020, new eg.n(i11, fVar, 29));
                k0Var.P = null;
                break;
            default:
                ze.b bVar2 = this.b;
                m3.f fVar3 = this.c;
                h0 h0Var2 = (h0) bVar2.b;
                int i12 = d0.a;
                k3.f fVar4 = h0Var2.a.r;
                k3.a k9 = fVar4.k();
                fVar4.l(k9, 1015, new d3(k9, fVar3, 16));
                break;
        }
    }
}
