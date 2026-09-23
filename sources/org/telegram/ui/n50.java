package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ n50(o50 o50Var, int i10) {
        this.a = i10;
        this.b = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o50 o50Var = this.b;
                p50 p50Var = o50Var.b;
                if (p50Var != null) {
                    p50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new n50(o50Var, 2), 16L);
                break;
            case 1:
                p50 p50Var2 = this.b.b;
                if (p50Var2 != null) {
                    p50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
