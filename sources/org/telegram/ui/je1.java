package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe1 b;

    public /* synthetic */ je1(oe1 oe1Var, int i10) {
        this.a = i10;
        this.b = oe1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oe1 oe1Var = this.b;
                oe1Var.getClass();
                new fg.n1((org.telegram.ui.ActionBar.p2) oe1Var, 11, false).show();
                break;
            default:
                oe1 oe1Var2 = this.b;
                oe1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(oe1Var2.e);
                break;
        }
    }
}
