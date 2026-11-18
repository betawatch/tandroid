package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ xb(zb zbVar, Boolean bool, int i7) {
        this.a = i7;
        this.b = zbVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Boolean bool = this.c;
        zb zbVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                zbVar.h.u.remove(zbVar.a.e);
                g0.g3(new xb(zbVar, bool, i10));
                break;
            default:
                sb sbVar = zbVar.a;
                if (!bool.booleanValue()) {
                    ks.f(sbVar.o).k(ks.Z1, sbVar.e, 2);
                    break;
                } else {
                    ks.f(sbVar.o).k(ks.Y1, sbVar.e, sbVar.p);
                    break;
                }
        }
    }
}
