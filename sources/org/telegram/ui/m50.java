package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n50 b;

    public /* synthetic */ m50(n50 n50Var, int i10) {
        this.a = i10;
        this.b = n50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n50 n50Var = this.b;
                fg.h0 h0Var = n50Var.b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new m50(n50Var, 2), 16L);
                break;
            case 1:
                fg.h0 h0Var2 = this.b.b;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
