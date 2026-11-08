package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                v6.b((v6) this.b, z9, f10);
                break;
            default:
                m9 m9Var = (m9) this.b;
                m9Var.a0 = null;
                m9Var.b0 = 1.0f;
                m9Var.G0();
                break;
        }
    }
}
