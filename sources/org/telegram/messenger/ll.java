package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ll implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ cg.t c;

    public /* synthetic */ ll(hp hpVar, cg.t tVar, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        cg.t tVar = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                a0.h hVar = tVar.c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    hpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                break;
            case 1:
                a0.h hVar2 = tVar.c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    hpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                break;
            default:
                a0.h hVar3 = tVar.c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        hpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    break;
                }
                break;
        }
    }
}
