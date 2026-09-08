package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ r6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ o6 e;

    public /* synthetic */ n6(boolean[] zArr, r6 r6Var, long[] jArr, o6 o6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = r6Var;
        this.d = jArr;
        this.e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j3 = jArr[0];
                o6 o6Var = this.e;
                if (j3 <= 0) {
                    o6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new lu0(o6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
