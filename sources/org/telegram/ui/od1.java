package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class od1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ td1 b;

    public /* synthetic */ od1(td1 td1Var, int i10) {
        this.a = i10;
        this.b = td1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                td1 td1Var = this.b;
                td1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.o2) td1Var, 11, false).show();
                break;
            default:
                td1 td1Var2 = this.b;
                td1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(td1Var2.e);
                break;
        }
    }
}
