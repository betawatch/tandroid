package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ xj0(yj0 yj0Var, int i10) {
        this.a = i10;
        this.b = yj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                yj0Var.getClass();
                try {
                    ag.k kVar = yj0Var.B0;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yj0Var.z0);
                break;
            case 1:
                yj0 yj0Var2 = this.b;
                yj0Var2.P = null;
                yj0Var2.p();
                break;
            case 2:
                yj0.h(this.b);
                break;
            case 3:
                yj0.e(this.b);
                break;
            case 4:
                yj0.d(this.b);
                break;
            case 5:
                yj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
