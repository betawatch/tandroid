package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w40 b;

    public /* synthetic */ m40(w40 w40Var, int i7) {
        this.a = i7;
        this.b = w40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                w40 w40Var = this.b;
                w40Var.n0();
                w40Var.j0();
                break;
            case 2:
                w40 w40Var2 = this.b;
                w40Var2.getClass();
                w40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                w40 w40Var3 = this.b;
                w40Var3.n.postOnAnimation(new m40(w40Var3, 1));
                break;
        }
    }
}
