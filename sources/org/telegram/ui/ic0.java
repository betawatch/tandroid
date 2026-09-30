package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ic0(cd0 cd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = cd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                cd0 cd0Var = this.b;
                if (!z10) {
                    cd0Var.b.setVisibility(8);
                    break;
                } else {
                    cd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
