package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(long j10, long j11, long j12, org.telegram.ui.f5 f5Var) {
        this.a = 2;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = f5Var;
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
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.e;
                long j10 = this.b;
                long j11 = this.c;
                org.telegram.ui.c7.n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.o0 = valueOf;
                f5Var.run(org.telegram.ui.c7.n0, valueOf);
                break;
        }
    }

    public /* synthetic */ n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }
}
