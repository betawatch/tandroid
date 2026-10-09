package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ vb(q0.a aVar, xb xbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = xbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((jb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((dm) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
