package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ hn0(qn0 qn0Var, int i7) {
        this.a = i7;
        this.b = qn0Var;
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
