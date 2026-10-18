package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ f5(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
