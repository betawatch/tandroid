package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp0 b;

    public /* synthetic */ bp0(kp0 kp0Var, int i10) {
        this.a = i10;
        this.b = kp0Var;
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
