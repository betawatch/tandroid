package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ ln0(oo0 oo0Var, int i10) {
        this.a = i10;
        this.b = oo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.b;
                oo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(oo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                oo0 oo0Var2 = this.b;
                oo0Var2.getMessagesController().newMessageCallback = null;
                if (oo0Var2.f1 == 3 && !oo0Var2.isFinishing()) {
                    oo0Var2.f1 = 4;
                    no0 no0Var = oo0Var2.Z0;
                    if (no0Var != null) {
                        no0Var.a(4);
                    }
                    oo0Var2.finishFragment();
                    break;
                } else if (oo0Var2.f1 == 1 && !oo0Var2.isFinishing()) {
                    oo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                oo0 oo0Var3 = this.b;
                if (oo0Var3.d0 != null) {
                    oo0Var3.w0();
                    oo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
