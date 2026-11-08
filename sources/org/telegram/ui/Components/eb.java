package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ eb(q0.a aVar, gb gbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = gbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((sa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((bl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
