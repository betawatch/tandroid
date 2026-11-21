package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma0 b;

    public /* synthetic */ la0(ma0 ma0Var, int i7) {
        this.a = i7;
        this.b = ma0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ma0 ma0Var = this.b;
                if (ma0Var.W != -1) {
                    org.telegram.messenger.ks.f(ma0Var.Y.d0.x).j(ma0Var.W);
                    ma0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                ma0 ma0Var2 = this.b;
                if (ma0Var2.W != -1) {
                    org.telegram.messenger.ks.f(ma0Var2.Y.d0.x).j(ma0Var2.W);
                    ma0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
