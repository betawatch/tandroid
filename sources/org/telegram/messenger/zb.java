package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;

    public /* synthetic */ zb(cc ccVar, int i10) {
        this.a = i10;
        this.b = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        cc ccVar = this.b;
        switch (i10) {
            case 0:
                hc hcVar = ccVar.h;
                ThreadLocal threadLocal = hc.I;
                hcVar.V(true);
                break;
            case 1:
                ccVar.h.u.remove(ccVar.a.e);
                i0.g3(new zb(ccVar, 3));
                break;
            case 2:
                hc hcVar2 = ccVar.h;
                ThreadLocal threadLocal2 = hc.I;
                hcVar2.V(true);
                break;
            default:
                vb vbVar = ccVar.a;
                zs.f(vbVar.o).k(zs.Z1, vbVar.e, 1);
                break;
        }
    }
}
