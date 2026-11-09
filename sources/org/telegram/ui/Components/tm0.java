package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ tm0(cn0 cn0Var, int i7) {
        this.a = i7;
        this.b = cn0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                this.b.o.setScaleX(1.0f / f10);
                break;
            case 1:
                this.b.o.setScaleY(1.0f / f10);
                break;
            case 2:
                this.b.o.setScaleX(1.0f / f10);
                break;
            default:
                this.b.o.setScaleY(1.0f / f10);
                break;
        }
    }
}
