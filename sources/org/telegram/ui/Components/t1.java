package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements gb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib0 b;
    public final /* synthetic */ ib0 c;
    public final /* synthetic */ ib0 d;

    public /* synthetic */ t1(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7) {
        this.a = i7;
        this.b = ib0Var;
        this.c = ib0Var2;
        this.d = ib0Var3;
    }

    @Override // org.telegram.ui.Components.gb0
    public final void n(ib0 ib0Var, int i7) {
        switch (this.a) {
            case 0:
                v4.v0(this.b, this.c, this.d);
                break;
            case 1:
                v4.v0(this.b, this.c, this.d);
                break;
            default:
                v4.b(this.b, this.c, this.d);
                break;
        }
    }
}
