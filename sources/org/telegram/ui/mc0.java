package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mc0(gd0 gd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = gd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                gd0 gd0Var = this.b;
                if (!z10) {
                    gd0Var.b.setVisibility(8);
                    break;
                } else {
                    gd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
