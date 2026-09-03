package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ t6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ r6 e;

    public /* synthetic */ q6(boolean[] zArr, t6 t6Var, long[] jArr, r6 r6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = t6Var;
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
                    AndroidUtilities.runOnUIThread(new yt0(r6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
