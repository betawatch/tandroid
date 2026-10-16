package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ ub(q0.a aVar, wb wbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = wbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((ib) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((zl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
