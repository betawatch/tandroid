package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    public /* synthetic */ yp0(dr0 dr0Var, int i10) {
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dr0 dr0Var = this.b;
                dr0Var.A0 = true;
                k20 k20Var = dr0Var.y0;
                k20Var.r.setText("");
                AndroidUtilities.showKeyboard(k20Var.r);
                break;
            default:
                sc scVar = new sc(13);
                dr0 dr0Var2 = this.b;
                if (!dr0Var2.isKeyboardVisible()) {
                    scVar.run();
                    break;
                } else {
                    k20 k20Var2 = dr0Var2.y0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(scVar, 300L);
                    break;
                }
        }
    }
}
