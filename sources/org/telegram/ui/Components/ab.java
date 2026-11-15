package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ ab(q0.a aVar, cb cbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = cbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((oa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((il) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
