package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ bc(dc dcVar, Boolean bool, int i10) {
        this.a = i10;
        this.b = dcVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Boolean bool = this.c;
        dc dcVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                dcVar.h.u.remove(dcVar.a.e);
                i0.g3(new bc(dcVar, bool, i11));
                break;
            default:
                wb wbVar = dcVar.a;
                if (!bool.booleanValue()) {
                    at.f(wbVar.o).k(at.Z1, wbVar.e, 2);
                    break;
                } else {
                    at.f(wbVar.o).k(at.Y1, wbVar.e, wbVar.p);
                    break;
                }
        }
    }
}
