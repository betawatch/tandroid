package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ in0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                mo0Var.s2 = true;
                s00 s00Var = mo0Var.q2;
                s00Var.r.setText("");
                org.telegram.messenger.g0.K3(s00Var.r);
                break;
            default:
                vs vsVar = new vs(5);
                mo0 mo0Var2 = this.b;
                if (!mo0Var2.d) {
                    vsVar.run();
                    break;
                } else {
                    s00 s00Var2 = mo0Var2.q2;
                    if (s00Var2 != null) {
                        org.telegram.messenger.g0.v1(s00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(vsVar, 300L);
                    break;
                }
        }
    }
}
