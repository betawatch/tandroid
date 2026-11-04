package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ sb(ub ubVar, Boolean bool, int i3) {
        this.a = i3;
        this.b = ubVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Boolean bool = this.c;
        ub ubVar = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                ubVar.h.u.remove(ubVar.a.e);
                g0.h3(new sb(ubVar, bool, i10));
                break;
            default:
                nb nbVar = ubVar.a;
                if (!bool.booleanValue()) {
                    hs.f(nbVar.o).k(hs.Z1, nbVar.e, 2);
                    break;
                } else {
                    hs.f(nbVar.o).k(hs.Y1, nbVar.e, nbVar.p);
                    break;
                }
        }
    }
}
