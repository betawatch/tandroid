package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ me0(pe0 pe0Var, int i7) {
        this.a = i7;
        this.b = pe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d.a(false);
                break;
            default:
                pe0 pe0Var = this.b;
                Runnable runnable = pe0Var.I;
                pe0Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = pe0Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
