package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(long j10, long j11, long j12, org.telegram.ui.d5 d5Var) {
        this.a = 2;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = d5Var;
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
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.e;
                long j10 = this.b;
                long j11 = this.c;
                org.telegram.ui.b7.k0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.b7.l0 = valueOf;
                d5Var.run(org.telegram.ui.b7.k0, valueOf);
                break;
        }
    }

    public /* synthetic */ m0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }
}
