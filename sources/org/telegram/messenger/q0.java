package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q0(long j10, long j11, long j12, org.telegram.ui.e5 e5Var) {
        this.a = 2;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = e5Var;
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
                org.telegram.ui.e5 e5Var = (org.telegram.ui.e5) this.e;
                long j10 = this.b;
                long j11 = this.c;
                org.telegram.ui.c7.l0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.m0 = valueOf;
                e5Var.run(org.telegram.ui.c7.l0, valueOf);
                break;
        }
    }

    public /* synthetic */ q0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }
}
