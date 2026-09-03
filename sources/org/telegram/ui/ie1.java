package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne1 b;

    public /* synthetic */ ie1(ne1 ne1Var, int i10) {
        this.a = i10;
        this.b = ne1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ne1 ne1Var = this.b;
                ne1Var.getClass();
                new eg.o1((org.telegram.ui.ActionBar.p2) ne1Var, 11, false).show();
                break;
            default:
                ne1 ne1Var2 = this.b;
                ne1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ne1Var2.e);
                break;
        }
    }
}
