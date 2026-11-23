package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                g0.g3(new xb(acVar, 3));
                break;
            case 2:
                fc fcVar2 = acVar.h;
                ThreadLocal threadLocal2 = fc.I;
                fcVar2.V(true);
                break;
            default:
                tb tbVar = acVar.a;
                ls.f(tbVar.o).k(ls.Z1, tbVar.e, 1);
                break;
        }
    }
}
