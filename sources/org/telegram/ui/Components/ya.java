package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ ya(q0.a aVar, bb bbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = bbVar;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((ma) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((gl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
