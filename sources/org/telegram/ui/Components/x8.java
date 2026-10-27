package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    g9.V(this.b);
                    break;
                }
                break;
            default:
                g9 g9Var = this.b;
                if (i10 == -1) {
                    g9.V(g9Var);
                }
                if (i10 == 1) {
                    g9Var.g0();
                    break;
                }
                break;
        }
    }
}
