package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;
    public final /* synthetic */ long c;

    public /* synthetic */ uz(c00 c00Var, long j10, int i3) {
        this.a = i3;
        this.b = c00Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.c;
        c00 c00Var = this.b;
        switch (i3) {
            case 0:
                c00Var.c.put(j10, 0);
                c00Var.getNotificationCenter().k(hs.q5, Long.valueOf(j10), Boolean.FALSE);
                break;
            default:
                c00Var.n(0, j10, false);
                break;
        }
    }
}
