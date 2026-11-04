package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements ab0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb0 b;
    public final /* synthetic */ cb0 c;
    public final /* synthetic */ cb0 d;

    public /* synthetic */ s1(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, int i3) {
        this.a = i3;
        this.b = cb0Var;
        this.c = cb0Var2;
        this.d = cb0Var3;
    }

    @Override // org.telegram.ui.Components.ab0
    public final void l(cb0 cb0Var, int i3) {
        switch (this.a) {
            case 0:
                t4.x0(this.b, this.c, this.d);
                break;
            case 1:
                t4.x0(this.b, this.c, this.d);
                break;
            default:
                t4.b(this.b, this.c, this.d);
                break;
        }
    }
}
