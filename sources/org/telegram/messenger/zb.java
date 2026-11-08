package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ zb(bc bcVar, Boolean bool, int i7) {
        this.a = i7;
        this.b = bcVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Boolean bool = this.c;
        bc bcVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                bcVar.h.u.remove(bcVar.a.e);
                g0.h3(new zb(bcVar, bool, i10));
                break;
            default:
                ub ubVar = bcVar.a;
                if (!bool.booleanValue()) {
                    qs.f(ubVar.o).k(qs.Z1, ubVar.e, 2);
                    break;
                } else {
                    qs.f(ubVar.o).k(qs.Y1, ubVar.e, ubVar.p);
                    break;
                }
        }
    }
}
