package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ mo0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
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
