package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ b2 c;
    public final /* synthetic */ j2 d;

    public /* synthetic */ z1(boolean[] zArr, b2 b2Var, j2 j2Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = b2Var;
        this.d = j2Var;
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
