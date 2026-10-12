package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf1 b;

    public /* synthetic */ cf1(hf1 hf1Var, int i10) {
        this.a = i10;
        this.b = hf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hf1 hf1Var = this.b;
                hf1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.m2) hf1Var, 11, false).show();
                break;
            default:
                hf1 hf1Var2 = this.b;
                hf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(hf1Var2.e);
                break;
        }
    }
}
