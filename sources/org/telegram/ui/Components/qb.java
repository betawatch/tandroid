package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ qb(q0.a aVar, sb sbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = sbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((eb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((ml) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
