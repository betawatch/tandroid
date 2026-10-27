package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ jq0(nr0 nr0Var, int i10) {
        this.a = i10;
        this.b = nr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nr0 nr0Var = this.b;
                nr0Var.B0 = true;
                m20 m20Var = nr0Var.z0;
                m20Var.r.setText("");
                AndroidUtilities.showKeyboard(m20Var.r);
                break;
            default:
                k5 k5Var = new k5(16);
                nr0 nr0Var2 = this.b;
                if (!nr0Var2.isKeyboardVisible()) {
                    k5Var.run();
                    break;
                } else {
                    m20 m20Var2 = nr0Var2.z0;
                    if (m20Var2 != null) {
                        AndroidUtilities.hideKeyboard(m20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(k5Var, 300L);
                    break;
                }
        }
    }
}
