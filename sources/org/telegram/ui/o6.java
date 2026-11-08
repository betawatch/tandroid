package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ bi.x5 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ p6 e;

    public /* synthetic */ o6(boolean[] zArr, bi.x5 x5Var, long[] jArr, p6 p6Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = x5Var;
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
                    org.telegram.messenger.g0.i3(new gq0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
