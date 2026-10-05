package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se1 b;

    public /* synthetic */ ne1(se1 se1Var, int i10) {
        this.a = i10;
        this.b = se1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                se1 se1Var = this.b;
                se1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) se1Var, 11, false).show();
                break;
            default:
                se1 se1Var2 = this.b;
                se1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(se1Var2.e);
                break;
        }
    }
}
