package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ai.k0 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ o6 e;

    public /* synthetic */ n6(boolean[] zArr, ai.k0 k0Var, long[] jArr, o6 o6Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = k0Var;
        this.d = jArr;
        this.e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new n6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.f(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                o6 o6Var = this.e;
                if (j3 <= 0) {
                    o6Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new hq0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
