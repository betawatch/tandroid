package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd1 b;

    public /* synthetic */ nd1(sd1 sd1Var, int i10) {
        this.a = i10;
        this.b = sd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sd1 sd1Var = this.b;
                sd1Var.getClass();
                new ag.g2((org.telegram.ui.ActionBar.n2) sd1Var, 11, false).show();
                break;
            default:
                sd1 sd1Var2 = this.b;
                sd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(sd1Var2.e);
                break;
        }
    }
}
