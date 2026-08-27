package e5;

import d5.g0;
import h3.h0;
import h3.k0;
import h3.q2;
import j4.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe.b b;
    public final /* synthetic */ k3.f c;

    public /* synthetic */ v(xe.b bVar, k3.f fVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe.b bVar = this.b;
                k3.f fVar = this.c;
                synchronized (fVar) {
                }
                h0 h0Var = (h0) bVar.c;
                int i10 = g0.a;
                k0 k0Var = h0Var.a;
                i3.f fVar2 = k0Var.r;
                i3.a i11 = fVar2.i((c0) fVar2.d.e);
                fVar2.l(i11, 1020, new h3.x(i11, fVar, 16));
                k0Var.P = null;
                break;
            default:
                xe.b bVar2 = this.b;
                k3.f fVar3 = this.c;
                h0 h0Var2 = (h0) bVar2.c;
                int i12 = g0.a;
                i3.f fVar4 = h0Var2.a.r;
                i3.a k10 = fVar4.k();
                fVar4.l(k10, 1015, new q2(k10, fVar3, 23));
                break;
        }
    }
}
