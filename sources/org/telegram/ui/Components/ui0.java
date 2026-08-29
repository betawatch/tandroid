package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ ui0(xi0 xi0Var, int i10) {
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
                    jf.g gVar = xi0Var.z0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.x0);
                break;
            case 1:
                xi0 xi0Var2 = this.b;
                xi0Var2.M = null;
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
