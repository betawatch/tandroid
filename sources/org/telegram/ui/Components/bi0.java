package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci0 b;

    public /* synthetic */ bi0(ci0 ci0Var, int i10) {
        this.a = i10;
        this.b = ci0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ci0 ci0Var = this.b;
                ci0Var.getClass();
                try {
                    rf.e eVar = ci0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.i0.g3(ci0Var.z0);
                break;
            case 1:
                ci0 ci0Var2 = this.b;
                ci0Var2.P = null;
                ci0Var2.p();
                break;
            case 2:
                ci0.h(this.b);
                break;
            case 3:
                ci0.e(this.b);
                break;
            case 4:
                ci0.d(this.b);
                break;
            case 5:
                ci0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
