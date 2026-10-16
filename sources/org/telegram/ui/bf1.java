package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf1 b;

    public /* synthetic */ bf1(gf1 gf1Var, int i10) {
        this.a = i10;
        this.b = gf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gf1 gf1Var = this.b;
                gf1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.m2) gf1Var, 11, false).show();
                break;
            default:
                gf1 gf1Var2 = this.b;
                gf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(gf1Var2.e);
                break;
        }
    }
}
