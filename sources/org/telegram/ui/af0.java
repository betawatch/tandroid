package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ af0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf0 bf0Var = this.b;
                cf0 cf0Var = bf0Var.d;
                if (bf0Var.b) {
                    boolean z10 = cf0Var.K;
                    org.telegram.ui.Components.yi0 yi0Var = cf0Var.J;
                    id idVar = cf0Var.n;
                    if (z10 && System.currentTimeMillis() - bf0Var.a >= 10000) {
                        idVar.setAnimation(yi0Var);
                        yi0Var.N(0, false, false);
                        yi0Var.t0 = new af0(bf0Var, 1);
                        idVar.d();
                        bf0Var.a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(bf0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new af0(this.b, 2));
                break;
            default:
                cf0 cf0Var2 = this.b.d;
                org.telegram.ui.Components.yi0 yi0Var2 = cf0Var2.I;
                yi0Var2.N(0, false, false);
                cf0Var2.n.setAnimation(yi0Var2);
                break;
        }
    }
}
