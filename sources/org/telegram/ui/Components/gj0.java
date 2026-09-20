package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ gj0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hj0 hj0Var = this.b;
                hj0Var.getClass();
                try {
                    yf.e eVar = hj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(hj0Var.z0);
                break;
            case 1:
                hj0 hj0Var2 = this.b;
                hj0Var2.P = null;
                hj0Var2.p();
                break;
            case 2:
                hj0.h(this.b);
                break;
            case 3:
                hj0.e(this.b);
                break;
            case 4:
                hj0.d(this.b);
                break;
            case 5:
                hj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
