package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd1 b;

    public /* synthetic */ id1(nd1 nd1Var, int i10) {
        this.a = i10;
        this.b = nd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd1 nd1Var = this.b;
                nd1Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) nd1Var, 11, false).show();
                break;
            default:
                nd1 nd1Var2 = this.b;
                nd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(nd1Var2.e);
                break;
        }
    }
}
