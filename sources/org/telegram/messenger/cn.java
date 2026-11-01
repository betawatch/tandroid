package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;

    public /* synthetic */ cn(wp wpVar, long j10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.d = j10;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Runnable runnable = this.c;
        long j10 = this.d;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                wpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                if (runnable != null) {
                    wpVar.getClass();
                    runnable.run();
                }
                wpVar.getNotificationCenter().k(at.X4, Long.valueOf(j10), 0L);
                break;
            default:
                wpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cn(wp wpVar, Runnable runnable, long j10) {
        this.a = 1;
        this.b = wpVar;
        this.c = runnable;
        this.d = j10;
    }
}
