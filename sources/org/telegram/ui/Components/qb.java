package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
