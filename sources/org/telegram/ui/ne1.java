package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                new rg.x0((org.telegram.ui.ActionBar.n2) se1Var, 11, false).show();
                break;
            default:
                se1 se1Var2 = this.b;
                se1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(se1Var2.e);
                break;
        }
    }
}
