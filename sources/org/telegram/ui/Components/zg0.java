package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ zg0(ah0 ah0Var, int i7) {
        this.a = i7;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b;
                ah0Var.getClass();
                try {
                    bg.i iVar = ah0Var.B0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(ah0Var.z0);
                break;
            case 1:
                ah0 ah0Var2 = this.b;
                ah0Var2.P = null;
                ah0Var2.p();
                break;
            case 2:
                ah0.h(this.b);
                break;
            case 3:
                ah0.e(this.b);
                break;
            case 4:
                ah0.d(this.b);
                break;
            case 5:
                ah0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
