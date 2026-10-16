package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public /* synthetic */ np0(wp0 wp0Var, int i10) {
        this.a = i10;
        this.b = wp0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
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
