package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq0 b;

    public /* synthetic */ vp0(zq0 zq0Var, int i10) {
        this.a = i10;
        this.b = zq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zq0 zq0Var = this.b;
                zq0Var.A0 = true;
                f20 f20Var = zq0Var.y0;
                f20Var.r.setText("");
                AndroidUtilities.showKeyboard(f20Var.r);
                break;
            default:
                uh uhVar = new uh(9);
                zq0 zq0Var2 = this.b;
                if (!zq0Var2.isKeyboardVisible()) {
                    uhVar.run();
                    break;
                } else {
                    f20 f20Var2 = zq0Var2.y0;
                    if (f20Var2 != null) {
                        AndroidUtilities.hideKeyboard(f20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(uhVar, 300L);
                    break;
                }
        }
    }
}
