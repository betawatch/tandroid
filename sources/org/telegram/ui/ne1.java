package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                new rg.x0((org.telegram.ui.ActionBar.m2) se1Var, 11, false).show();
                break;
            default:
                se1 se1Var2 = this.b;
                se1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(se1Var2.e);
                break;
        }
    }
}
