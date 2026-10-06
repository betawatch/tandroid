package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
