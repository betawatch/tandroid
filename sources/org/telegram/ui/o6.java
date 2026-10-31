package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ fg.i c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ p6 e;

    public /* synthetic */ o6(boolean[] zArr, fg.i iVar, long[] jArr, p6 p6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = iVar;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new o6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.d(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                p6 p6Var = this.e;
                if (j10 <= 0) {
                    p6Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.h3(new rr0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
