package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ai.k0 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ p6 e;

    public /* synthetic */ o6(boolean[] zArr, ai.k0 k0Var, long[] jArr, p6 p6Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = k0Var;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.f(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                p6 p6Var = this.e;
                if (j3 <= 0) {
                    p6Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.i3(new fq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
