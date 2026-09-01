package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij0 b;

    public /* synthetic */ fj0(ij0 ij0Var, int i10) {
        this.a = i10;
        this.b = ij0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ij0 ij0Var = this.b;
                ij0Var.getClass();
                try {
                    lf.g gVar = ij0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ij0Var.y0);
                break;
            case 1:
                ij0 ij0Var2 = this.b;
                ij0Var2.N = null;
                ij0Var2.n();
                break;
            case 2:
                ij0.h(this.b);
                break;
            case 3:
                ij0.e(this.b);
                break;
            case 4:
                ij0.d(this.b);
                break;
            case 5:
                ij0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
