package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;

    public /* synthetic */ np0(sq0 sq0Var, int i10) {
        this.a = i10;
        this.b = sq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sq0 sq0Var = this.b;
                sq0Var.A0 = true;
                k20 k20Var = sq0Var.y0;
                k20Var.r.setText("");
                AndroidUtilities.showKeyboard(k20Var.r);
                break;
            default:
                c30 c30Var = new c30(2);
                sq0 sq0Var2 = this.b;
                if (!sq0Var2.isKeyboardVisible()) {
                    c30Var.run();
                    break;
                } else {
                    k20 k20Var2 = sq0Var2.y0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(c30Var, 300L);
                    break;
                }
        }
    }
}
