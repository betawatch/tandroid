package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ wi0(xi0 xi0Var, int i10) {
        this.a = i10;
        this.b = xi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xi0 xi0Var = this.b;
                xi0Var.getClass();
                try {
                    yf.e eVar = xi0Var.D0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.B0);
                break;
            case 1:
                xi0 xi0Var2 = this.b;
                xi0Var2.Q = null;
                xi0Var2.n();
                break;
            case 2:
                xi0.h(this.b);
                break;
            case 3:
                xi0.e(this.b);
                break;
            case 4:
                xi0.d(this.b);
                break;
            case 5:
                xi0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
