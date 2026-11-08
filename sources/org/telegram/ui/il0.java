package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;

    public /* synthetic */ il0(hm0 hm0Var, int i7) {
        this.a = i7;
        this.b = hm0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                fi.g1 g1Var = this.b.I;
                if (g1Var != null) {
                    g1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                hm0 hm0Var = this.b;
                hm0Var.r = false;
                hm0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    hm0Var.C0();
                    hm0Var.finishFragment();
                    hm0Var.I0();
                    break;
                }
                break;
        }
    }
}
