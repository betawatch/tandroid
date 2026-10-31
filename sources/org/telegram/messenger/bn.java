package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;

    public /* synthetic */ bn(vp vpVar, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.d = j10;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Runnable runnable = this.c;
        long j10 = this.d;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                vpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                if (runnable != null) {
                    vpVar.getClass();
                    runnable.run();
                }
                vpVar.getNotificationCenter().k(zs.X4, Long.valueOf(j10), 0L);
                break;
            default:
                vpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bn(vp vpVar, Runnable runnable, long j10) {
        this.a = 1;
        this.b = vpVar;
        this.c = runnable;
        this.d = j10;
    }
}
