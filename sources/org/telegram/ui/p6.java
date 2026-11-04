package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ai.c0 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ q6 e;

    public /* synthetic */ p6(boolean[] zArr, ai.c0 c0Var, long[] jArr, q6 q6Var, int i3) {
        this.a = i3;
        this.b = zArr;
        this.c = c0Var;
        this.d = jArr;
        this.e = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new p6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.f(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                q6 q6Var = this.e;
                if (j10 <= 0) {
                    q6Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.i3(new xp0(q6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
