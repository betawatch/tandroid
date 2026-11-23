package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ ib(q0.a aVar, kb kbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = kbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((wa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((pl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
