package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ jb(q0.a aVar, lb lbVar, int i9) {
        this.a = i9;
        this.c = aVar;
        this.b = lbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((xa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((dl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
