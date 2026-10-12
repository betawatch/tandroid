package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ z1 c;
    public final /* synthetic */ h2 d;

    public /* synthetic */ x1(boolean[] zArr, z1 z1Var, h2 h2Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = z1Var;
        this.d = h2Var;
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
