package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ db(q0.a aVar, fb fbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = fbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((ra) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((al) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
