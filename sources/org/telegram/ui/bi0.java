package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi0 b;

    public /* synthetic */ bi0(wi0 wi0Var, int i10) {
        this.a = i10;
        this.b = wi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                wi0 wi0Var = this.b;
                wi0Var.getClass();
                vh.g.f(false);
                vh.g gVar = wi0Var.i0;
                if (gVar != null) {
                    gVar.b(wi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new bi0(wi0Var, 0));
                break;
            case 2:
                vh.g.f(false);
                wi0 wi0Var2 = this.b;
                vh.g gVar2 = wi0Var2.i0;
                if (gVar2 != null) {
                    gVar2.b(wi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new bi0(wi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
