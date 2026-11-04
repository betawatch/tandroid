package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ nm(hp hpVar, long j10, Runnable runnable, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = j10;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Runnable runnable = this.d;
        long j10 = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                if (runnable != null) {
                    hpVar.getClass();
                    runnable.run();
                }
                hpVar.getNotificationCenter().k(hs.X4, Long.valueOf(j10), 0L);
                break;
            case 1:
                hpVar.V2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                hpVar.V2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nm(hp hpVar, Runnable runnable, long j10) {
        this.a = 0;
        this.b = hpVar;
        this.d = runnable;
        this.c = j10;
    }
}
