package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ bg.v c;

    public /* synthetic */ ql(np npVar, bg.v vVar, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        bg.v vVar = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = vVar.c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                break;
            case 1:
                a0.h hVar2 = vVar.c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                break;
            default:
                a0.h hVar3 = vVar.c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        npVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    break;
                }
                break;
        }
    }
}
