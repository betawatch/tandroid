package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue1 b;

    public /* synthetic */ pe1(ue1 ue1Var, int i10) {
        this.a = i10;
        this.b = ue1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ue1 ue1Var = this.b;
                ue1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) ue1Var, 11, false).show();
                break;
            default:
                ue1 ue1Var2 = this.b;
                ue1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ue1Var2.e);
                break;
        }
    }
}
