package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ hi0(cj0 cj0Var, int i10) {
        this.a = i10;
        this.b = cj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                cj0 cj0Var = this.b;
                cj0Var.getClass();
                wh.g.f(false);
                wh.g gVar = cj0Var.i0;
                if (gVar != null) {
                    gVar.b(cj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var, 0));
                break;
            case 2:
                wh.g.f(false);
                cj0 cj0Var2 = this.b;
                wh.g gVar2 = cj0Var2.i0;
                if (gVar2 != null) {
                    gVar2.b(cj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new hi0(cj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
