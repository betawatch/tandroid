package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;

    public /* synthetic */ li0(gj0 gj0Var, int i10) {
        this.a = i10;
        this.b = gj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                gj0 gj0Var = this.b;
                gj0Var.getClass();
                wh.f.f(false);
                wh.f fVar = gj0Var.i0;
                if (fVar != null) {
                    fVar.b(gj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new li0(gj0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                gj0 gj0Var2 = this.b;
                wh.f fVar2 = gj0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(gj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new li0(gj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
