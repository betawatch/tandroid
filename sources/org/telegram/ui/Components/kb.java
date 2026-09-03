package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
