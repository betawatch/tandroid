package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ tj0(uj0 uj0Var, int i10) {
        this.a = i10;
        this.b = uj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj0 uj0Var = this.b;
                uj0Var.getClass();
                try {
                    zf.e eVar = uj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(uj0Var.z0);
                break;
            case 1:
                uj0 uj0Var2 = this.b;
                uj0Var2.P = null;
                uj0Var2.p();
                break;
            case 2:
                uj0.h(this.b);
                break;
            case 3:
                uj0.e(this.b);
                break;
            case 4:
                uj0.d(this.b);
                break;
            case 5:
                uj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
