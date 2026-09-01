package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie1 b;

    public /* synthetic */ de1(ie1 ie1Var, int i10) {
        this.a = i10;
        this.b = ie1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ie1 ie1Var = this.b;
                ie1Var.getClass();
                new fg.n1((org.telegram.ui.ActionBar.p2) ie1Var, 11, false).show();
                break;
            default:
                ie1 ie1Var2 = this.b;
                ie1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ie1Var2.e);
                break;
        }
    }
}
