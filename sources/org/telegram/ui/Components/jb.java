package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ jb(q0.a aVar, lb lbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = lbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((xa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((pl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
