package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(long j10, long j11, long j12, org.telegram.ui.b5 b5Var) {
        this.a = 2;
        this.b = j10;
        this.c = j11;
        this.d = j12;
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
                long j10 = this.b;
                long j11 = this.c;
                org.telegram.ui.x6.j0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.x6.k0 = valueOf;
                b5Var.run(org.telegram.ui.x6.j0, valueOf);
                break;
        }
    }

    public /* synthetic */ l0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }
}
