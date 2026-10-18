package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
