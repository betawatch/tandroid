package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ yb(ac acVar, Boolean bool, int i7) {
        this.a = i7;
        this.b = acVar;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Boolean bool = this.c;
        ac acVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                acVar.h.u.remove(acVar.a.e);
                g0.g3(new yb(acVar, bool, i10));
                break;
            default:
                tb tbVar = acVar.a;
                if (!bool.booleanValue()) {
                    ls.f(tbVar.o).k(ls.Z1, tbVar.e, 2);
                    break;
                } else {
                    ls.f(tbVar.o).k(ls.Y1, tbVar.e, tbVar.p);
                    break;
                }
        }
    }
}
