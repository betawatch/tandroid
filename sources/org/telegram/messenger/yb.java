package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
