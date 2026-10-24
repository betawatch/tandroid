package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ sb(q0.a aVar, ub ubVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = ubVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((gb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((xl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
