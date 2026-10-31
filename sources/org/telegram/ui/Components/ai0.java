package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi0 b;

    public /* synthetic */ ai0(bi0 bi0Var, int i10) {
        this.a = i10;
        this.b = bi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bi0 bi0Var = this.b;
                bi0Var.getClass();
                try {
                    rf.e eVar = bi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.i0.g3(bi0Var.z0);
                break;
            case 1:
                bi0 bi0Var2 = this.b;
                bi0Var2.P = null;
                bi0Var2.p();
                break;
            case 2:
                bi0.h(this.b);
                break;
            case 3:
                bi0.e(this.b);
                break;
            case 4:
                bi0.d(this.b);
                break;
            case 5:
                bi0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
