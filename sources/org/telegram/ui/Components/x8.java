package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ x8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    g9.U(this.b);
                    break;
                }
                break;
            default:
                g9 g9Var = this.b;
                if (i10 == -1) {
                    g9.U(g9Var);
                }
                if (i10 == 1) {
                    g9Var.f0();
                    break;
                }
                break;
        }
    }
}
