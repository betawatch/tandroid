package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ q50(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r50 r50Var = this.b;
                n20 n20Var = r50Var.b;
                if (n20Var != null) {
                    n20Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new q50(r50Var, 2), 16L);
                break;
            case 1:
                n20 n20Var2 = this.b.b;
                if (n20Var2 != null) {
                    n20Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
