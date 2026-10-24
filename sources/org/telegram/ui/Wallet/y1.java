package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ a2 c;
    public final /* synthetic */ i2 d;

    public /* synthetic */ y1(boolean[] zArr, a2 a2Var, i2 i2Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = a2Var;
        this.d = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (!this.b[0]) {
                    if (!this.c.m) {
                        this.d.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                if (!this.b[0]) {
                    if (!this.c.m) {
                        this.d.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
