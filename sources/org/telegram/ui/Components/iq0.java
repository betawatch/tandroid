package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ iq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mr0 mr0Var = this.b;
                mr0Var.B0 = true;
                m20 m20Var = mr0Var.z0;
                m20Var.r.setText("");
                AndroidUtilities.showKeyboard(m20Var.r);
                break;
            default:
                k5 k5Var = new k5(16);
                mr0 mr0Var2 = this.b;
                if (!mr0Var2.isKeyboardVisible()) {
                    k5Var.run();
                    break;
                } else {
                    m20 m20Var2 = mr0Var2.z0;
                    if (m20Var2 != null) {
                        AndroidUtilities.hideKeyboard(m20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(k5Var, 300L);
                    break;
                }
        }
    }
}
