package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public /* synthetic */ mo0(sp0 sp0Var, int i10) {
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sp0 sp0Var = this.b;
                sp0Var.w0 = true;
                p10 p10Var = sp0Var.u0;
                p10Var.r.setText("");
                AndroidUtilities.showKeyboard(p10Var.r);
                break;
            default:
                gc gcVar = new gc(11);
                sp0 sp0Var2 = this.b;
                if (!sp0Var2.isKeyboardVisible()) {
                    gcVar.run();
                    break;
                } else {
                    p10 p10Var2 = sp0Var2.u0;
                    if (p10Var2 != null) {
                        AndroidUtilities.hideKeyboard(p10Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(gcVar, 300L);
                    break;
                }
        }
    }
}
