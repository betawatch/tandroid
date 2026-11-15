package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;

    public /* synthetic */ xb(ac acVar, int i7) {
        this.a = i7;
        this.b = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ac acVar = this.b;
        switch (i7) {
            case 0:
                fc fcVar = acVar.h;
                ThreadLocal threadLocal = fc.I;
                fcVar.V(true);
                break;
            case 1:
                acVar.h.u.remove(acVar.a.e);
                g0.h3(new xb(acVar, 3));
                break;
            case 2:
                fc fcVar2 = acVar.h;
                ThreadLocal threadLocal2 = fc.I;
                fcVar2.V(true);
                break;
            default:
                tb tbVar = acVar.a;
                ns.f(tbVar.o).k(ns.Z1, tbVar.e, 1);
                break;
        }
    }
}
