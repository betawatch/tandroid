package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm0 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;

    public /* synthetic */ vm0(en0 en0Var, int i3) {
        this.a = i3;
        this.b = en0Var;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
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
