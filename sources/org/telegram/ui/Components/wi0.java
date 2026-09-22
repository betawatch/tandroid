package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    yf.e eVar = xi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.z0);
                break;
            case 1:
                xi0 xi0Var2 = this.b;
                xi0Var2.P = null;
                xi0Var2.p();
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
                this.b.m();
                break;
        }
    }
}
