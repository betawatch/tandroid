package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ gd(ld ldVar, Integer num, int i3) {
        this.a = i3;
        this.b = ldVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 1;
        Integer num = this.c;
        ld ldVar = this.b;
        switch (i3) {
            case 0:
                if (!ldVar.b.isEmpty()) {
                    g0.h3(new gd(ldVar, num, i10));
                    break;
                }
                break;
            default:
                ldVar.getNotificationCenter().k(76, num);
                break;
        }
    }
}
