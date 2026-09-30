package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh0 b;

    public /* synthetic */ ih0(lh0 lh0Var, int i10) {
        this.a = i10;
        this.b = lh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
