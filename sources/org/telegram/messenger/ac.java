package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc b;

    public /* synthetic */ ac(dc dcVar, int i10) {
        this.a = i10;
        this.b = dcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        dc dcVar = this.b;
        switch (i10) {
            case 0:
                ic icVar = dcVar.h;
                ThreadLocal threadLocal = ic.I;
                icVar.V(true);
                break;
            case 1:
                dcVar.h.u.remove(dcVar.a.e);
                i0.g3(new ac(dcVar, 3));
                break;
            case 2:
                ic icVar2 = dcVar.h;
                ThreadLocal threadLocal2 = ic.I;
                icVar2.V(true);
                break;
            default:
                wb wbVar = dcVar.a;
                at.f(wbVar.o).k(at.Z1, wbVar.e, 1);
                break;
        }
    }
}
