package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
