package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ go0(po0 po0Var, int i10) {
        this.a = i10;
        this.b = po0Var;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                this.b.o.setScaleX(1.0f / f9);
                break;
            case 1:
                this.b.o.setScaleY(1.0f / f9);
                break;
            case 2:
                this.b.o.setScaleX(1.0f / f9);
                break;
            default:
                this.b.o.setScaleY(1.0f / f9);
                break;
        }
    }
}
