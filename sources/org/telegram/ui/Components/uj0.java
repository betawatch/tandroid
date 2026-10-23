package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj0 b;

    public /* synthetic */ uj0(vj0 vj0Var, int i10) {
        this.a = i10;
        this.b = vj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vj0 vj0Var = this.b;
                vj0Var.getClass();
                try {
                    zf.e eVar = vj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(vj0Var.z0);
                break;
            case 1:
                vj0 vj0Var2 = this.b;
                vj0Var2.P = null;
                vj0Var2.p();
                break;
            case 2:
                vj0.h(this.b);
                break;
            case 3:
                vj0.e(this.b);
                break;
            case 4:
                vj0.d(this.b);
                break;
            case 5:
                vj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
