package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m90 b;
    public final /* synthetic */ q90 c;

    public /* synthetic */ l90(m90 m90Var, q90 q90Var, int i10) {
        this.a = i10;
        this.b = m90Var;
        this.c = q90Var;
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
