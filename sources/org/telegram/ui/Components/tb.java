package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ tb(q0.a aVar, vb vbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = vbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((hb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((pl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
