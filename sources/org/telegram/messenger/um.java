package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ um(np npVar, long j3, Runnable runnable, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = j3;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.d;
        long j3 = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    npVar.getClass();
                    runnable.run();
                }
                npVar.getNotificationCenter().k(ns.X4, Long.valueOf(j3), 0L);
                break;
            case 1:
                npVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                npVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ um(np npVar, Runnable runnable, long j3) {
        this.a = 0;
        this.b = npVar;
        this.d = runnable;
        this.c = j3;
    }
}
