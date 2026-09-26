package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ n6 e;

    public /* synthetic */ m6(boolean[] zArr, q6 q6Var, long[] jArr, n6 n6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = q6Var;
        this.d = jArr;
        this.e = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                n6 n6Var = this.e;
                if (j3 <= 0) {
                    n6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new eu0(n6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
