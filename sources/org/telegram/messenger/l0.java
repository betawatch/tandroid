package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.a = 2;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.b, this.c, this.d);
                break;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.b, this.c, this.d);
                break;
            default:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.e;
                long j3 = this.b;
                long j10 = this.c;
                org.telegram.ui.a7.o0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.p0 = valueOf;
                b5Var.run(org.telegram.ui.a7.o0, valueOf);
                break;
        }
    }

    public /* synthetic */ l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j3;
        this.c = j10;
        this.d = j11;
    }
}
