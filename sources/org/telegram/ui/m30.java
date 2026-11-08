package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n30 b;

    public /* synthetic */ m30(n30 n30Var, int i7) {
        this.a = i7;
        this.b = n30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n30 n30Var = this.b;
                l00 l00Var = n30Var.b;
                if (l00Var != null) {
                    l00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                break;
            case 1:
                l00 l00Var2 = this.b.b;
                if (l00Var2 != null) {
                    l00Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
