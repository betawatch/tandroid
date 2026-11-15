package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
