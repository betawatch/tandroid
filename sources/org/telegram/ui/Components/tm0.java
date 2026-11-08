package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = bn0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z9) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                bn0 bn0Var = this.b;
                if (!z9) {
                    bn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    bn0Var.getClass();
                    break;
                }
        }
    }
}
