package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ gi0(bj0 bj0Var, int i10) {
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                bj0 bj0Var = this.b;
                bj0Var.getClass();
                vh.g.f(false);
                vh.g gVar = bj0Var.i0;
                if (gVar != null) {
                    gVar.b(bj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new gi0(bj0Var, 0));
                break;
            case 2:
                vh.g.f(false);
                bj0 bj0Var2 = this.b;
                vh.g gVar2 = bj0Var2.i0;
                if (gVar2 != null) {
                    gVar2.b(bj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new gi0(bj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
