package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ dp0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hq0 hq0Var = this.b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                ue ueVar = new ue(8);
                hq0 hq0Var2 = this.b;
                if (!hq0Var2.isKeyboardVisible()) {
                    ueVar.run();
                    break;
                } else {
                    b20 b20Var2 = hq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(ueVar, 300L);
                    break;
                }
        }
    }
}
