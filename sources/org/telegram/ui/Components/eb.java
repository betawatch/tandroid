package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
