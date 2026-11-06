package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ yb(bc bcVar, int i7) {
        this.a = i7;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        bc bcVar = this.b;
        switch (i7) {
            case 0:
                gc gcVar = bcVar.h;
                ThreadLocal threadLocal = gc.I;
                gcVar.V(true);
                break;
            case 1:
                bcVar.h.u.remove(bcVar.a.e);
                g0.h3(new yb(bcVar, 3));
                break;
            case 2:
                gc gcVar2 = bcVar.h;
                ThreadLocal threadLocal2 = gc.I;
                gcVar2.V(true);
                break;
            default:
                ub ubVar = bcVar.a;
                qs.f(ubVar.o).k(qs.Z1, ubVar.e, 1);
                break;
        }
    }
}
