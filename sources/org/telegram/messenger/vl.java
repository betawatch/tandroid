package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ bg.u c;

    public /* synthetic */ vl(qp qpVar, bg.u uVar, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        bg.u uVar = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = uVar.c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    qpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                break;
            case 1:
                a0.h hVar2 = uVar.c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    qpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                break;
            default:
                a0.h hVar3 = uVar.c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        qpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    break;
                }
                break;
        }
    }
}
