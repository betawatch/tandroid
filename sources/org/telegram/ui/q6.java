package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ u6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ r6 e;

    public /* synthetic */ q6(boolean[] zArr, u6 u6Var, long[] jArr, r6 r6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = u6Var;
        this.d = jArr;
        this.e = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                r6 r6Var = this.e;
                if (j10 <= 0) {
                    r6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ut0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
