package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ rb(q0.a aVar, tb tbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = tbVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((fb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((rl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
