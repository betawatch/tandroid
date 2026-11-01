package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ rf.q c;

    public /* synthetic */ tl(wp wpVar, rf.q qVar, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        rf.q qVar = this.c;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                a0.h hVar = qVar.c;
                int m10 = hVar.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    wpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i11)), hVar.n(i11), Boolean.FALSE);
                }
                break;
            case 1:
                a0.h hVar2 = qVar.c;
                int m11 = hVar2.m();
                for (int i12 = 0; i12 < m11; i12++) {
                    wpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i12)), hVar2.n(i12), Boolean.FALSE);
                }
                break;
            default:
                a0.h hVar3 = qVar.c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i13 = 0; i13 < m12; i13++) {
                        wpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i13)), hVar3.n(i13), Boolean.FALSE, 0);
                    }
                    break;
                }
                break;
        }
    }
}
