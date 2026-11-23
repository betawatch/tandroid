package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ sm(np npVar, long j3, Runnable runnable, int i7) {
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
                npVar.getNotificationCenter().k(ls.a5, Long.valueOf(j3), 0L);
                break;
            case 1:
                npVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                npVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sm(np npVar, Runnable runnable, long j3) {
        this.a = 0;
        this.b = npVar;
        this.d = runnable;
        this.c = j3;
    }
}
