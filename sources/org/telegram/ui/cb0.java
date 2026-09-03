package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ cb0(ob0 ob0Var, int i10) {
        this.a = i10;
        this.b = ob0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ob0 ob0Var = this.b;
                ob0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(ob0Var.r.b);
                break;
            case 1:
                ob0 ob0Var2 = this.b;
                ob0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(ob0Var2.r.b);
                break;
            default:
                af.g.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
