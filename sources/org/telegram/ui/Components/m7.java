package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ m7(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.o(this.b);
                break;
            default:
                k8.H(this.b);
                break;
        }
    }
}
