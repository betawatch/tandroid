package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
