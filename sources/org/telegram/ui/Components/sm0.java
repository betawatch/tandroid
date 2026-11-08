package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;

    public /* synthetic */ sm0(bn0 bn0Var, int i7) {
        this.a = i7;
        this.b = bn0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                this.b.o.setScaleX(1.0f / f10);
                break;
            case 1:
                this.b.o.setScaleY(1.0f / f10);
                break;
            case 2:
                this.b.o.setScaleX(1.0f / f10);
                break;
            default:
                this.b.o.setScaleY(1.0f / f10);
                break;
        }
    }
}
