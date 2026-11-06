package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
