package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ hq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mr0 mr0Var = this.b;
                mr0Var.A0 = true;
                s20 s20Var = mr0Var.y0;
                s20Var.r.setText("");
                AndroidUtilities.showKeyboard(s20Var.r);
                break;
            default:
                vh vhVar = new vh(9);
                mr0 mr0Var2 = this.b;
                if (!mr0Var2.isKeyboardVisible()) {
                    vhVar.run();
                    break;
                } else {
                    s20 s20Var2 = mr0Var2.y0;
                    if (s20Var2 != null) {
                        AndroidUtilities.hideKeyboard(s20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(vhVar, 300L);
                    break;
                }
        }
    }
}
