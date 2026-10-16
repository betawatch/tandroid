package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ l00(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k10.V(this.b);
                break;
            default:
                k10.W(this.b);
                break;
        }
    }
}
