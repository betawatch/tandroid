package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.pc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ b(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.pc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.j2 = str;
                g0Var.G2.O(true);
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.j2 = str;
                g0Var2.G2.O(true);
                break;
        }
    }
}
