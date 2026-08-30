package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;

    public /* synthetic */ dj0(gj0 gj0Var, int i10) {
        this.a = i10;
        this.b = gj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gj0 gj0Var = this.b;
                gj0Var.getClass();
                try {
                    lf.g gVar = gj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(gj0Var.y0);
                break;
            case 1:
                gj0 gj0Var2 = this.b;
                gj0Var2.N = null;
                gj0Var2.n();
                break;
            case 2:
                gj0.h(this.b);
                break;
            case 3:
                gj0.e(this.b);
                break;
            case 4:
                gj0.d(this.b);
                break;
            case 5:
                gj0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
