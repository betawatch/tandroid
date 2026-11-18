package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;

    public /* synthetic */ wb(zb zbVar, int i7) {
        this.a = i7;
        this.b = zbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        zb zbVar = this.b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                break;
            case 1:
                zbVar.h.u.remove(zbVar.a.e);
                g0.g3(new wb(zbVar, 3));
                break;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                break;
            default:
                sb sbVar = zbVar.a;
                ks.f(sbVar.o).k(ks.Z1, sbVar.e, 1);
                break;
        }
    }
}
