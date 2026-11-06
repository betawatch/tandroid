package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ xm(qp qpVar, long j3, Runnable runnable, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = j3;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.d;
        long j3 = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    qpVar.getClass();
                    runnable.run();
                }
                qpVar.getNotificationCenter().k(qs.X4, Long.valueOf(j3), 0L);
                break;
            case 1:
                qpVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                qpVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xm(qp qpVar, Runnable runnable, long j3) {
        this.a = 0;
        this.b = qpVar;
        this.d = runnable;
        this.c = j3;
    }
}
