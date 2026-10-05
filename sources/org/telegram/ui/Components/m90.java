package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n90 b;
    public final /* synthetic */ r90 c;

    public /* synthetic */ m90(n90 n90Var, r90 r90Var, int i10) {
        this.a = i10;
        this.b = n90Var;
        this.c = r90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
