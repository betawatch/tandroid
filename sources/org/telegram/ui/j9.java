package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ j9(s9 s9Var, int i3) {
        this.a = i3;
        this.b = s9Var;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = this.b;
                s9Var.F = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                s9 s9Var2 = this.b;
                s9Var2.c0 = s9Var2.O ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                s9Var2.fragmentView.invalidate();
                break;
        }
    }
}
