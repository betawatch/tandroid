package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ kd1(pd1 pd1Var, int i10) {
        this.a = i10;
        this.b = pd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pd1 pd1Var = this.b;
                pd1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) pd1Var, 11, false).show();
                break;
            default:
                pd1 pd1Var2 = this.b;
                pd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(pd1Var2.e);
                break;
        }
    }
}
