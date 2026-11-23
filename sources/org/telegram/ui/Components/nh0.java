package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh0 b;

    public /* synthetic */ nh0(oh0 oh0Var, int i7) {
        this.a = i7;
        this.b = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oh0 oh0Var = this.b;
                oh0Var.getClass();
                try {
                    bg.i iVar = oh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(oh0Var.A0);
                break;
            case 1:
                oh0 oh0Var2 = this.b;
                oh0Var2.Q = null;
                oh0Var2.p();
                break;
            case 2:
                oh0.h(this.b);
                break;
            case 3:
                oh0.e(this.b);
                break;
            case 4:
                oh0.d(this.b);
                break;
            case 5:
                oh0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
