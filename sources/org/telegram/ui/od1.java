package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
