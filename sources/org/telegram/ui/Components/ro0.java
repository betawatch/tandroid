package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ ro0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
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
