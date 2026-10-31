package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ ac(cc ccVar, Boolean bool, int i10) {
        this.a = i10;
        this.b = ccVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Boolean bool = this.c;
        cc ccVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                ccVar.h.u.remove(ccVar.a.e);
                i0.g3(new ac(ccVar, bool, i11));
                break;
            default:
                vb vbVar = ccVar.a;
                if (!bool.booleanValue()) {
                    zs.f(vbVar.o).k(zs.Z1, vbVar.e, 2);
                    break;
                } else {
                    zs.f(vbVar.o).k(zs.Y1, vbVar.e, vbVar.p);
                    break;
                }
        }
    }
}
