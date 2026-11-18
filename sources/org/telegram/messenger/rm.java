package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ rm(mp mpVar, long j3, Runnable runnable, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = j3;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.d;
        long j3 = this.c;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    mpVar.getClass();
                    runnable.run();
                }
                mpVar.getNotificationCenter().k(ks.a5, Long.valueOf(j3), 0L);
                break;
            case 1:
                mpVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                mpVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rm(mp mpVar, Runnable runnable, long j3) {
        this.a = 0;
        this.b = mpVar;
        this.d = runnable;
        this.c = j3;
    }
}
