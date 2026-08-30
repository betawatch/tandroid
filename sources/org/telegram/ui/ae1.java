package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe1 b;

    public /* synthetic */ ae1(fe1 fe1Var, int i10) {
        this.a = i10;
        this.b = fe1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fe1 fe1Var = this.b;
                fe1Var.getClass();
                new eg.o1((org.telegram.ui.ActionBar.p2) fe1Var, 11, false).show();
                break;
            default:
                fe1 fe1Var2 = this.b;
                fe1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(fe1Var2.e);
                break;
        }
    }
}
