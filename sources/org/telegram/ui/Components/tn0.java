package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;

    public /* synthetic */ tn0(co0 co0Var, int i10) {
        this.a = i10;
        this.b = co0Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                this.b.o.setScaleX(1.0f / f7);
                break;
            case 1:
                this.b.o.setScaleY(1.0f / f7);
                break;
            case 2:
                this.b.o.setScaleX(1.0f / f7);
                break;
            default:
                this.b.o.setScaleY(1.0f / f7);
                break;
        }
    }
}
