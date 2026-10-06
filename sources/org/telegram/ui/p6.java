package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ t6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ q6 e;

    public /* synthetic */ p6(boolean[] zArr, t6 t6Var, long[] jArr, q6 q6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = t6Var;
        this.d = jArr;
        this.e = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                q6 q6Var = this.e;
                if (j3 <= 0) {
                    q6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new hu0(q6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
