package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                g0.h3(new yb(acVar, bool, i10));
                break;
            default:
                tb tbVar = acVar.a;
                if (!bool.booleanValue()) {
                    ns.f(tbVar.o).k(ns.Z1, tbVar.e, 2);
                    break;
                } else {
                    ns.f(tbVar.o).k(ns.Y1, tbVar.e, tbVar.p);
                    break;
                }
        }
    }
}
