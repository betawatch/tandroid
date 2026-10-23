package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ sb(q0.a aVar, ub ubVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = ubVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((gb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((xl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
