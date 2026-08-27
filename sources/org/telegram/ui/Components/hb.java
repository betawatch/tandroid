package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ hb(q0.a aVar, jb jbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = jbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((va) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((zk) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
