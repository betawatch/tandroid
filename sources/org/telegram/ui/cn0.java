package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;

    public /* synthetic */ cn0(go0 go0Var, int i10) {
        this.a = i10;
        this.b = go0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go0 go0Var = this.b;
                go0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(go0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                go0 go0Var2 = this.b;
                go0Var2.getMessagesController().newMessageCallback = null;
                if (go0Var2.f1 == 3 && !go0Var2.isFinishing()) {
                    go0Var2.f1 = 4;
                    fo0 fo0Var = go0Var2.Z0;
                    if (fo0Var != null) {
                        fo0Var.c(4);
                    }
                    go0Var2.finishFragment();
                    break;
                } else if (go0Var2.f1 == 1 && !go0Var2.isFinishing()) {
                    go0Var2.finishFragment();
                    break;
                }
                break;
            default:
                go0 go0Var3 = this.b;
                if (go0Var3.d0 != null) {
                    go0Var3.w0();
                    go0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
