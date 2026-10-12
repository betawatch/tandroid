package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                ((am) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
