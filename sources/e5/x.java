package e5;

import d5.f0;
import gh.i3;
import h3.h0;
import h3.k0;
import j4.d0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ we.b b;
    public final /* synthetic */ k3.f c;

    public /* synthetic */ x(we.b bVar, k3.f fVar, int i9) {
        this.a = i9;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                we.b bVar = this.b;
                k3.f fVar = this.c;
                synchronized (fVar) {
                }
                h0 h0Var = (h0) bVar.c;
                int i9 = f0.a;
                k0 k0Var = h0Var.a;
                i3.f fVar2 = k0Var.r;
                i3.a i10 = fVar2.i((d0) fVar2.d.e);
                fVar2.l(i10, 1020, new i3(i10, fVar, 17));
                k0Var.P = null;
                break;
            default:
                we.b bVar2 = this.b;
                k3.f fVar3 = this.c;
                h0 h0Var2 = (h0) bVar2.c;
                int i11 = f0.a;
                i3.f fVar4 = h0Var2.a.r;
                i3.a k10 = fVar4.k();
                fVar4.l(k10, 1015, new i3.d(k10, fVar3, 0));
                break;
        }
    }
}
