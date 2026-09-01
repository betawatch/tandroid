package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ kb(q0.a aVar, nb nbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = nbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((xa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((il) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
