package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ nn0(qo0 qo0Var, int i10) {
        this.a = i10;
        this.b = qo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qo0 qo0Var = this.b;
                qo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(qo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                qo0 qo0Var2 = this.b;
                qo0Var2.getMessagesController().newMessageCallback = null;
                if (qo0Var2.f1 == 3 && !qo0Var2.isFinishing()) {
                    qo0Var2.f1 = 4;
                    po0 po0Var = qo0Var2.Z0;
                    if (po0Var != null) {
                        po0Var.a(4);
                    }
                    qo0Var2.finishFragment();
                    break;
                } else if (qo0Var2.f1 == 1 && !qo0Var2.isFinishing()) {
                    qo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                qo0 qo0Var3 = this.b;
                if (qo0Var3.d0 != null) {
                    qo0Var3.w0();
                    qo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
