package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                    AndroidUtilities.runOnUIThread(new vt0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
