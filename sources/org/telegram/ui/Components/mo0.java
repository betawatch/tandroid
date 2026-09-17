package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
