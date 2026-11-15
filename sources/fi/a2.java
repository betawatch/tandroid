package fi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;

    public /* synthetic */ a2(int i7, long j3, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.i3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            case 1:
                Runnable runnable2 = this.b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            default:
                Runnable runnable3 = this.b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.i3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
        }
    }
}
