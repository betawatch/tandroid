package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ nn0(po0 po0Var, int i10) {
        this.a = i10;
        this.b = po0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po0 po0Var = this.b;
                po0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(po0Var.f[0]);
                break;
            case 1:
                this.b.u0();
                break;
            case 2:
                po0 po0Var2 = this.b;
                po0Var2.getMessagesController().newMessageCallback = null;
                if (po0Var2.f1 == 3 && !po0Var2.isFinishing()) {
                    po0Var2.f1 = 4;
                    oo0 oo0Var = po0Var2.Z0;
                    if (oo0Var != null) {
                        oo0Var.a(4);
                    }
                    po0Var2.finishFragment();
                    break;
                } else if (po0Var2.f1 == 1 && !po0Var2.isFinishing()) {
                    po0Var2.finishFragment();
                    break;
                }
                break;
            default:
                po0 po0Var3 = this.b;
                if (po0Var3.d0 != null) {
                    po0Var3.x0();
                    po0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
