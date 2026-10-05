package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ l7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.n(this.b);
                break;
            default:
                j8.E(this.b);
                break;
        }
    }
}
